package com.abl.wakala.web;
import com.abl.wakala.dto.AuthenticationDto;
import com.abl.wakala.model.Role;
import com.abl.wakala.model.User;
import com.abl.wakala.repository.RoleRepository;
import com.abl.wakala.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v1/")
public class UserController{

//    Injecting user repository

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserRepository userRepository;

//    Get all user
    @GetMapping("/user")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    @GetMapping("/user/role")
    public List<Role> getAllRole(){
        return roleRepository.findAll();
    }

//    Create user rest api
    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        Role role = roleRepository.findById(user.getRole().getId()).orElse(
                null
        );
        if (role !=
        null
        ){
            user.setRole(role);
        }
        return userRepository.save(user);
    }

    // Login API
    @PostMapping("/user/login")
    public ResponseEntity<String>
    loginUser(@RequestBody AuthenticationDto authenticationDto)
    {

        if(userRepository.findByUsername(authenticationDto.getUsername()).isEmpty()){
            return new ResponseEntity<>("In correct username or password", HttpStatus.UNAUTHORIZED);
        }

        User user = userRepository.findByUsername(authenticationDto.getUsername()).get();
        if(!Objects.equals(user.getPassword(), authenticationDto.getPassword())){
            return new ResponseEntity<>("In correct username or password", HttpStatus.UNAUTHORIZED);
        }
        return ResponseEntity.ok("Authentication successfully");

    }

}
