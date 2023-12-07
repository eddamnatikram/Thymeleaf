package ma.projet.them;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import ma.projet.them.entity.User;
import ma.projet.them.repository.*;
@SpringBootApplication
@EntityScan(basePackages = "ma.projet.them.entity")
@ComponentScan(basePackages = {"ma.projet.them.controller"})
@EnableJpaRepositories(basePackages = "ma.projet.them.repository")
public class ThemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThemApplication.class, args);
	}

}
