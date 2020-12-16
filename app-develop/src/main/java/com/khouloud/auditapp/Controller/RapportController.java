package com.khouloud.auditapp.Controller;

import com.khouloud.auditapp.Entity.Rapport;
import com.khouloud.auditapp.Entity.User;
import com.khouloud.auditapp.Service.RapportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rapport")
public class RapportController {
    @Autowired
    private RapportService rapportService;
    @GetMapping("/getRapportByUser")
    public Rapport RapportByUser(@PathVariable User user) {
        return rapportService.getRapportByUser(user);
    }
    @PostMapping("/saveRapport")
    public Rapport save(@RequestBody Rapport rapport) {
        return rapportService.updateRapport(rapport);
    }
    @DeleteMapping("/deleteRapport/{id}")
    public boolean delete(@PathVariable Long id) {
        return rapportService.DeleteRapportById(id);}
}
