package com.devglan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.devglan.model.User;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableWebSecurity
public class SpringbootOauth2PcfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOauth2PcfApplication.class, args);
	}

	@Bean
    public User user() {
        return new User();
    }

}

