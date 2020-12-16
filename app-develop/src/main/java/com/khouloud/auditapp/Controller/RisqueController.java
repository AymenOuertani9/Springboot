package com.khouloud.auditapp.Controller;

import com.khouloud.auditapp.Entity.Risque;
import com.khouloud.auditapp.Service.RisqueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/risques")
public class RisqueController {

    Logger log = LoggerFactory.getLogger(RisqueController.class);

    @Autowired
    private RisqueService risqueService;

    @GetMapping("/get")
    public List<Risque> listRisque() {
        log.info("risqueService.getAll():{}", risqueService.getAll());

        return risqueService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public Risque get(@PathVariable Long id) throws Exception {
        return risqueService.get(id);
    }

    @PostMapping("/save")
    public Risque save(@RequestBody Risque risque) {
        return risqueService.save(risque);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable Long id) {
        return risqueService.delete(id);
    }
}
