package com.khouloud.auditapp.Service.impl;

import com.khouloud.auditapp.Entity.Evaluation;
import com.khouloud.auditapp.Entity.User;
import com.khouloud.auditapp.Repository.EvaluationRepository;
import com.khouloud.auditapp.Service.EvaluationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EvaluationServiceImp implements EvaluationService {
    Logger log = LoggerFactory.getLogger(EvaluationServiceImp.class);
    @Autowired
    private EvaluationRepository evaluationRepository;

    @Override
    public List<Evaluation> GetAllEvaluation() {
        return  evaluationRepository.findAll();
    }

    @Override
    public List<Evaluation> GetAllEvaluationByUser(User user) {
        return evaluationRepository.findByUser(user);
    }

    @Override
    public Evaluation addEvaluation(Evaluation evaluation) {
       return evaluationRepository.saveAndFlush(evaluation);
    }


    @Override
    public boolean deleteEvaluation(Long id) {
        Assert.notNull(id);
        try {
            evaluationRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
   

    @Override
    public Evaluation updateEvaluation(Evaluation evaluation) {
        return  evaluationRepository.save(evaluation);
    }


}
