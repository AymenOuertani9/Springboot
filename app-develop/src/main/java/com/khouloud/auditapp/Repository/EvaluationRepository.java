package com.khouloud.auditapp.Repository;

import com.khouloud.auditapp.Entity.Evaluation;
import com.khouloud.auditapp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvaluationRepository  extends JpaRepository<Evaluation,Long> {
    public List<Evaluation> findByUser( @Param("user") User user);

}
