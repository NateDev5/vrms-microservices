package com.nate.vrms.agents.api.mapper;

import com.nate.vrms.agents.api.dto.AgentResponse;
import com.nate.vrms.agents.domain.model.Agent;

public class AgentApiMapper {
    public static AgentResponse toResponse(Agent a) {
        return new AgentResponse(
                a.id().value(),
                a.name(),
                a.role().name(),
                a.status().name()
        );
    }
}
