package com.khouloud.auditapp.Service;

import com.khouloud.auditapp.Entity.Evaluation;
import com.khouloud.auditapp.Entity.User;

import java.util.List;

public interface EvaluationService {

    List<Evaluation> GetAllEvaluation();

    List<Evaluation> GetAllEvaluationByUser(User user);

    Evaluation addEvaluation(Evaluation evaluation);

    boolean deleteEvaluation(Long id);

    Evaluation updateEvaluation(Evaluation evaluation);

}
