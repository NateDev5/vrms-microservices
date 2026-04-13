package com.nate.vrms.agents.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataAgentRepository extends JpaRepository<AgentJpaEntity, String> {
    boolean existsByNameIgnoreCase(String name);
}
