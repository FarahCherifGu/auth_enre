package RegistrationLoginSpringSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan(basePackages = "RegistrationLoginSpringSecurity")
@EntityScan("RegistrationLoginSpringSecurity.model")
@EnableJpaRepositories("RegistrationLoginSpringSecurity.repository")
public class RegistrationLoginSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginSpringSecurityApplication.class, args);
	}

}
