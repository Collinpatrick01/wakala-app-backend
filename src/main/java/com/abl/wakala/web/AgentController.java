package com.abl.wakala.web;

import com.abl.wakala.model.Agent;
import com.abl.wakala.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class AgentController {
    //    Injecting agent repository

    @Autowired
    private AgentRepository agentRepository;

    //    Get all agent

    @GetMapping("/agent")
    public List<Agent> getAll() {
        return agentRepository.findAll();
    }
    //    Create user POST api
    @PostMapping("/agent")
    public Agent createAgent(@RequestBody Agent agent){
        return agentRepository.save(agent);
    }
}
