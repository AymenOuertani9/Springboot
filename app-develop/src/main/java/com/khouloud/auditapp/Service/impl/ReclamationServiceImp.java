package com.khouloud.auditapp.Service.impl;

import com.khouloud.auditapp.Entity.Reclamation;
import com.khouloud.auditapp.Entity.User;
import com.khouloud.auditapp.Repository.ReclamationRepository;
import com.khouloud.auditapp.Service.ReclamationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class ReclamationServiceImp implements ReclamationService {
    @Autowired
    private ReclamationRepository reclamationRepository ;
    @Override
    public List<Reclamation> getAllReclamation() {
        return reclamationRepository.findAll();
    }

    @Override
    public List<Reclamation> getAllreclamationByUser(User user) {
        return reclamationRepository.findByUser(user);
    }

    @Override
    public Reclamation addReclamation(Reclamation reclamation) {
        return reclamationRepository.save(reclamation);
    }

    @Override
    public boolean deleteReclamation(Long id) {
        Assert.notNull(id);
        try {
            reclamationRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
