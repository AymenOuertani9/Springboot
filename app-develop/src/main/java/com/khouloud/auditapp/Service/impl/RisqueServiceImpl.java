package com.khouloud.auditapp.Service.impl;

import com.khouloud.auditapp.Entity.Risque;
import com.khouloud.auditapp.Repository.RisqueRepository;
import com.khouloud.auditapp.Service.RisqueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class RisqueServiceImpl implements RisqueService {

    Logger log = LoggerFactory.getLogger(RisqueServiceImpl.class);

    @Autowired
    private RisqueRepository risqueRepository;

    @Override
    public Risque save(Risque risque) {
        return risqueRepository.save(risque);
    }

    @Override
    public Risque get(Long id) throws Exception {
        Assert.notNull(id);
        return risqueRepository.findById(id).orElseThrow(()
                -> new Exception("The risque with id " + id + " not found"));
    }

    @Override
    public List<Risque> getAll() {
        return risqueRepository.findAll();
    }

    @Override
    public boolean delete(Long id) {
        Assert.notNull(id);
        try {
            risqueRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
