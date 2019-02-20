package com.harrisonbrock.orders.repositories;

import com.harrisonbrock.orders.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Long> {

}
