package me.luji.springjpaweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "accountAuditAware")
public class SpringjpawebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringjpawebApplication.class, args);
    }

}
