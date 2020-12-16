package com.khouloud.auditapp.Controller;

import com.khouloud.auditapp.Entity.User;
import com.khouloud.auditapp.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Files;
import java.nio.file.Paths;

@CrossOrigin("*")
@RestController

public class CatalogueRestController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping(path="/photoClient/{id}",produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getPhoto(@PathVariable("id") Long id) throws Exception{
        User p=userRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/client/"+p.getLogo()));
    }
}
