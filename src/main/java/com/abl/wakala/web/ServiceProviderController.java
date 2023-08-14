package com.abl.wakala.web;
import com.abl.wakala.model.ServiceProvider;
import com.abl.wakala.repository.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class ServiceProviderController {
//    Injecting user repository
    @Autowired
    private ServiceProviderRepository serviceProviderRepository;

    //    Get all service provider

    @GetMapping("/serviceProvider")
    public List<ServiceProvider> getAll() { return serviceProviderRepository.findAll(); }

    //    Create user POST api
    @PostMapping("/serviceProvider")
    public ServiceProvider createServiceProvider(@RequestBody ServiceProvider serviceProvider){
        return  serviceProviderRepository.save(serviceProvider);
    }
}



