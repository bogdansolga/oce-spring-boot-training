package com.oce.springboot.training.d01.s06.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * A simple product {@link Service}, which wires the configured properties using the {@link Value} annotation
 *
 * @author bogdan.solga
 */
@Service
public class ProductService {

    @Value("${remote.endpoint.url}")
    private String remoteEndpointURL;

    @Value("${metrics.enabled}")
    private boolean metricsEnabled;

    @Value("${connection.timeout}")
    private int connectionTimeout;

    public void displayLoadedProperties() {
        System.out.println("The remote endpoint is '" + remoteEndpointURL + "'");
        System.out.println("The metrics are enabled: " + metricsEnabled);
        System.out.println("The connection timeout is " + connectionTimeout);
    }
}
