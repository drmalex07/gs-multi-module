package hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration 
{   
    @ConfigurationProperties("service")
    @Bean
    ServiceProperties properties()
    {
        return new ServiceProperties();
    }
    
    @Bean
    public Service service(@Autowired ServiceProperties props) 
    {
        return new Service(props.getMessage());
    }
}
