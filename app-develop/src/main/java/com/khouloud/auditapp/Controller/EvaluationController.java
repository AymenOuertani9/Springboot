package com.khouloud.auditapp.Controller;

import com.khouloud.auditapp.Entity.Evaluation;
import com.khouloud.auditapp.Entity.User;
import com.khouloud.auditapp.Service.EvaluationService;
import com.khouloud.auditapp.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/evaluation")
public class EvaluationController {
    @Autowired
    private EvaluationService evaluationService;
    
    @Autowired
    private UserService userservice;

    @GetMapping("/getEvaluations")
    public List<Evaluation> listEvaluations() {
        return evaluationService.GetAllEvaluation();
    }

    @GetMapping("/getEvaluationByUser/{username}")
    public List<Evaluation> listEvaluationsByUser(@PathVariable ("username") String username) {
    	User user=userservice.findByUsername(username);
        return evaluationService.GetAllEvaluationByUser(user);
    }

    @PostMapping("/saveEvaluation/{username}")
    public Evaluation save(@RequestBody Evaluation evaluation,@PathVariable("username") String username) {
    	User user=userservice.findByUsername(username);
    	evaluation.setUser(user);
        return evaluationService.addEvaluation(evaluation);
    }

    @DeleteMapping("/deleteEvaluation/{id}")
    public boolean delete(@PathVariable Long id) {
        return evaluationService.deleteEvaluation(id);
    }

    @PostMapping("/updateEvaluation")
    public Evaluation update(@RequestBody Evaluation evaluation) {
        return evaluationService.updateEvaluation(evaluation);
    }

}
