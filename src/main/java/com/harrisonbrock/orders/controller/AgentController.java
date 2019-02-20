package com.harrisonbrock.orders.controller;

import com.harrisonbrock.orders.model.Agent;
import com.harrisonbrock.orders.services.AgentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "agents", produces = MediaType.APPLICATION_JSON_VALUE)
public class AgentController {

    private AgentService service;

    public AgentController(AgentService service) {
        this.service = service;
    }


    @RequestMapping()
    public List<Agent> getAll() {
        return service.getAllAgents();
    }
}
