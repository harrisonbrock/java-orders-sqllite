package com.harrisonbrock.orders.services;

import com.harrisonbrock.orders.model.Agent;
import com.harrisonbrock.orders.repositories.AgentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentServiceImpl implements AgentService {

    private AgentRepository repository;

    public AgentServiceImpl(AgentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Agent> getAllAgents() {
        return repository.findAll();
    }

    @Override
    public Agent findByAgentCode(String agentCode) {
        return null;
    }
}
