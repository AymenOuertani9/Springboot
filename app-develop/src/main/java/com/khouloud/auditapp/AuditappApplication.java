package com.khouloud.auditapp;

import com.khouloud.auditapp.Entity.Role;
import com.khouloud.auditapp.Service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AuditappApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuditappApplication.class, args);
    }
    @Bean
    CommandLineRunner start(UserService userService){
        return args->{
            //userService.save(new Role(null," ROlE_ADMIN"));
            //userService.save(new Role(null,"ROLE_USER"));
            //userService.addRoleToClient("admin","ROlE_ADMIN");
        };
    }



}
