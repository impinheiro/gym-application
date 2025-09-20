package dev.alfateia.gym_space;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class GymSpaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymSpaceApplication.class, args);
	}

}
