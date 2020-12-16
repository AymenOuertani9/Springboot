package com.khouloud.auditapp.Repository;

import com.khouloud.auditapp.Entity.RendezVous;
import com.khouloud.auditapp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
    public List<RendezVous> findByUser(User user);

}
