package com.harrisonbrock.orders.services;

import com.harrisonbrock.orders.model.Agent;

import java.util.List;
import java.util.Optional;

public interface AgentService {
    List<Agent> getAllAgents();
    Agent findByAgentCode(long id);
    Agent addAgent(Agent agent);
    Agent updateById(Agent agent,long id);
}
