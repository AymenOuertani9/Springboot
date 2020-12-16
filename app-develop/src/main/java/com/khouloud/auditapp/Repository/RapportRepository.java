package com.khouloud.auditapp.Repository;

import com.khouloud.auditapp.Entity.Rapport;
import com.khouloud.auditapp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RapportRepository extends JpaRepository<Rapport,Long> {
    public Rapport findByUser(User user);
}
