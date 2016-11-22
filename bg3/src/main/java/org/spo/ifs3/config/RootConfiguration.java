package org.spo.ifs3.config;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.health.HealthCheckRegistry;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Controller;

/**
 * The root application context.
 * <p/>
 * Beans can also be configured by XML in root-context.xml which is imported by
 * this context class.
 * <p/>
 * Component scanning is also done to pickup any components other than
 *
 * @Controllers. @Controllers will be picked up by the SpringMVC context.
 */
@Configuration
@Import({org.spo.ifs3.config.JettyConfiguration.class, org.spo.ifs3.config.SpringSecurityConfig.class})
//@ImportResource({"classpath:META-INF/spring/root-context.xml"})
@ComponentScan(basePackages = {"org.spo.ifs3.config", 
		"org.spo.ifs3.template",	
		"org.spo.svc3.trxdemo1",
		"org.spo.svc3.trxdemo1.pgs",
		"org.spo.ifs3.dsl.model",
		"org.spo.ifs3.template.web",
		"org.spo.svc3.trxdemo1.def",
		"org.spo.cms3.svc"
		},
        excludeFilters = {@ComponentScan.Filter(Controller.class),
                @ComponentScan.Filter(Configuration.class)})
public class RootConfiguration {

    /**
     * Allows access to environment properties.  eg @Value("${jetty.port}).
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    /**
     * The metrics registry.
     */
    @Bean
    public MetricRegistry metricsRegistry() {
        return new MetricRegistry();
    }

    /**
     * The metrics health check registry.
     */
    @Bean
    public HealthCheckRegistry metricsHealthCheckRegistry() {
        return new HealthCheckRegistry();
    }
}
