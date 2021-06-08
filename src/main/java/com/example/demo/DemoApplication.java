package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.DAOs.ArticleDAO;
import com.example.demo.DAOs.GroupDAO;
import com.example.demo.DAOs.ParticipantDAO;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {GroupDAO.class,ParticipantDAO.class, ArticleDAO.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
