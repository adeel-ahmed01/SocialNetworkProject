package com.example.demo;

import com.example.demo.repository.UserRepository;
import com.example.demo.security.UserPrincipal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisRepositoriesAutoConfiguration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Slf4j
@SpringBootApplication(exclude = {RedisRepositoriesAutoConfiguration.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        log.info("DemoApplication is running ...");
    }

    public void authenticationManager(AuthenticationManagerBuilder builder, UserRepository repository) throws Exception {
        builder.userDetailsService(s -> new UserPrincipal(repository.findByEmail(s)));
    }
}
