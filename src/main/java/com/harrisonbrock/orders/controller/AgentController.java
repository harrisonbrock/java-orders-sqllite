package com.harrisonbrock.orders.controller;

import com.harrisonbrock.orders.model.Agent;
import com.harrisonbrock.orders.services.AgentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "agents", produces = MediaType.APPLICATION_JSON_VALUE)
public class AgentController {

    private AgentService service;

    public AgentController(AgentService service) {
        this.service = service;
    }


    @GetMapping()
    public List<Agent> getAll() {

        return service.getAllAgents();
    }

    @PostMapping()
    public Agent addAgent(@RequestBody Agent agent) {
        return service.addAgent(agent);
    }

}
