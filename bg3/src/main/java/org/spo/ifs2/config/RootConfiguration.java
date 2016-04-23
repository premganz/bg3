package org.spo.ifs2.config;

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
@Import({org.spo.ifs2.config.JettyConfiguration.class, org.spo.ifs2.config.SpringSecurityConfig.class})
//@ImportResource({"classpath:META-INF/spring/root-context.xml"})
@ComponentScan(basePackages = {"org.spo.ifs2.config", 
		"org.spo.ifs2.template",	
		"org.spo.svc2.trx",
		"org.spo.svc2.trx.pgs",
		"org.spo.ifs2.dsl.model",
		"org.spo.ifs2.template.web",
		"org.spo.svc2.trx.def",
		"org.spo.cms2.svc"
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
