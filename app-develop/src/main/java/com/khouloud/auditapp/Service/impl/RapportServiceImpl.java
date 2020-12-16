package com.khouloud.auditapp.Service.impl;

import com.khouloud.auditapp.Entity.Rapport;
import com.khouloud.auditapp.Entity.User;
import com.khouloud.auditapp.Repository.RapportRepository;
import com.khouloud.auditapp.Service.RapportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;

@Service
@Transactional
public class RapportServiceImpl implements RapportService {
    @Autowired
    private RapportRepository rapportRepository;
    @Override
    public Rapport getRapportByUser(User user) {
        return rapportRepository.findByUser(user);
    }

    @Override
    public boolean DeleteRapportById(Long id) {
        Assert.notNull(id);
        try {
            rapportRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Rapport updateRapport(Rapport rapport) {
        return  rapportRepository.save(rapport);
    }
}
