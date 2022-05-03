package com.aca.homework.exam.exam3;

import com.aca.homework.exam.exam3.generator.NumberPlateGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan
@EnableJpaRepositories
@SpringBootApplication
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        NumberPlateGenerator.generate(context);

    }

}
