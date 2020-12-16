package com.khouloud.auditapp.Repository;

import com.khouloud.auditapp.Entity.Risque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RisqueRepository extends JpaRepository<Risque,Long> {
}
