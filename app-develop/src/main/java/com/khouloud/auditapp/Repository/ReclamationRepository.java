package com.khouloud.auditapp.Repository;

import com.khouloud.auditapp.Entity.Reclamation;
import com.khouloud.auditapp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReclamationRepository  extends JpaRepository<Reclamation,Long> {
    public List<Reclamation> findByUser(User user);
}
