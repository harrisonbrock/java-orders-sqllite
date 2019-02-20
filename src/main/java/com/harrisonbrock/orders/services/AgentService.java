package com.harrisonbrock.orders.services;

import com.harrisonbrock.orders.model.Agent;

import java.util.List;

public interface AgentService {
    List<Agent> getAllAgents();
    Agent findByAgentCode(String agentCode);
    Agent addAgent(Agent agent);
}
