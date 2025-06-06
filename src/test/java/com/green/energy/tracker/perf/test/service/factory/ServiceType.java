package com.green.energy.tracker.perf.test.service.factory;

import com.green.energy.tracker.perf.test.service.Service;
import io.gatling.javaapi.core.ScenarioBuilder;
import lombok.AllArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
public abstract class ServiceType {
    protected final Service service;
    private final String baseUrl = System.getProperty("APP_URL");
    protected String buildUrl(String operation) {
        return baseUrl + "/api/v" + service.getVersion() + "/" + service.getService() + "/" + operation;
    }

    public abstract ScenarioBuilder scenario();
}
