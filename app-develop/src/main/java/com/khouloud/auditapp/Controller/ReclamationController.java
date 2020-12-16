package com.khouloud.auditapp.Controller;

import com.khouloud.auditapp.Entity.Reclamation;
import com.khouloud.auditapp.Entity.User;
import com.khouloud.auditapp.Service.ReclamationService;
import com.khouloud.auditapp.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reclamation")
public class ReclamationController {
    @Autowired
    private ReclamationService reclamationService;
    
    @Autowired
    private UserService userservice;
    
    @GetMapping("/getReclamations")
    public List<Reclamation> listRendezVouz() {
        return reclamationService.getAllReclamation();
    }
    @GetMapping("/getReclamationByUser/{username}")
    public List<Reclamation> listRendezVouzByUser(@PathVariable("username") String username) {
    	User user=userservice.findByUsername(username);
        return reclamationService.getAllreclamationByUser(user);
    }
    @PostMapping("/saveReclamation/{username}")
    public Reclamation save(@RequestBody Reclamation reclamation,@PathVariable("username") String username) {
    	User user=userservice.findByUsername(username);
    	reclamation.setUser(user);
        return reclamationService.addReclamation(reclamation);
    }
    @DeleteMapping("/deleteReclamation/{id}")
    public boolean delete(@PathVariable Long id) {
        return reclamationService.deleteReclamation(id);}
}
