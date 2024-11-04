package com.example.springjavanotestemplate.database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseSeeder {
    @Bean
    public CommandLineRunner seedRunner(NoteSeeder noteSeeder) {
        return args -> {
            System.out.println("Seeding database...");
            noteSeeder.seed();
            System.out.println("Seeding database... Done");
        };
    }
}
