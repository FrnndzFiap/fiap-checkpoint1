package br.com.fiap.checkpoint1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AppConfig {

    @Autowired
    private Environment env;

    public String getActiveProfile() {
        return env.getProperty("spring.profiles.active");
    }
}
