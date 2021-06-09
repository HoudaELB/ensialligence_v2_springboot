package com.example.demo;

import com.example.demo.dao.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {GroupDAO.class,ParticipantDAO.class, ArticleDAO.class,
        CommentaireDAO.class, FriendDAO.class,ArticleDAO.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
