package com.harrisonbrock.orders.services;

import com.harrisonbrock.orders.model.Agent;
import com.harrisonbrock.orders.repositories.AgentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Agent findByAgentCode(long id) {
        return repository.findById(id).orElse(new Agent());
    }

    @Override
    public Agent addAgent(Agent agent) {
        return repository.save(agent);
    }

    @Override
    public Agent updateById(Agent agent,long id) {
        Optional<Agent> updatingAgent = repository.findById(id);

        if (updatingAgent.isPresent()) {
            agent.setId(id);
            repository.save(agent);
            return agent;
        }
        return new Agent();
    }
}
