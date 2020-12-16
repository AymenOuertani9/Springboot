package com.khouloud.auditapp.Service.impl;

import com.khouloud.auditapp.Entity.RendezVous;
import com.khouloud.auditapp.Entity.User;
import com.khouloud.auditapp.Repository.RendezVousRepository;
import com.khouloud.auditapp.Service.RendezVousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RendezVousServiceImp implements RendezVousService {
    boolean test = false;
    @Autowired
    private RendezVousRepository rendezVouzRepository;

    @Override
    public List<RendezVous> getAllrendezvouz() {
        return rendezVouzRepository.findAll();
    }

    @Override
    public List<RendezVous> getAllrendezvouzByUser(User user) {
        return rendezVouzRepository.findByUser(user);
    }

    @Override
    public RendezVous addRendervouz(RendezVous rendezVous) {
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String today = formatter.format(rendezVous.getDate());
        return rendezVouzRepository.save(rendezVous);

    }

    @Override
    public RendezVous updateRendervouz(RendezVous rendezVous) {
        return rendezVouzRepository.save(rendezVous);

    }

    @Override
    public boolean deleteRendezvouz(Long id) {
        Assert.notNull(id);
        try {
            rendezVouzRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Optional<RendezVous> prendreRendezVous(RendezVous rendezVous) {
        List<RendezVous> rendezVous1 = this.getAllrendezvouz();
        Iterator<RendezVous> it = rendezVous1.iterator();
        boolean resultat = false;

        RendezVous rv = new RendezVous();
        Long id_r = 0L;
        while (it.hasNext() && (!resultat)) {
            rv = it.next();
            int a = rendezVous.getHeurededebut().getHours();
            int b = rendezVous.getHeurededebut().getMinutes();
            int c = rendezVous.getHeurededebut().getSeconds();
            float d = (a * 60) + b + (c / 60);
            int a1 = rv.getHeurededebut().getHours();
            int b1 = rv.getHeurededebut().getMinutes();
            int c1 = rv.getHeurededebut().getSeconds();
            float d1 = (a1 * 60) + b1 + (c1 / 60);
            int a2 = rv.getHeuredefin().getHours();
            int b2 = rv.getHeuredefin().getMinutes();
            int c2 = rv.getHeuredefin().getSeconds();
            float d2 = (a2 * 60) + b2 + (c2 / 60);
            Time t1 = new Time(12, 30, 00);
            int a3 = t1.getHours();
            int b3 = t1.getMinutes();
            int c3 = t1.getSeconds();
            float d3 = (a3 * 60) + b3 + (c3 / 60);
            if ((resultat = rv.getDate().equals(rendezVous.getDate())) && (rv.getHeurededebut().equals(rendezVous.getHeurededebut())) ||
                    (resultat = rv.getDate().equals(rendezVous.getDate())) && (Math.abs(d - d1) < 60) ||
                    (resultat = rv.getDate().equals(rendezVous.getDate())) && (Math.abs(d - d2) < 15) || (Math.abs(d - d3) < 60)) {
                id_r = rv.getId();
                System.out.println("impossible");
            }
        }
        return this.rendezVouzRepository.findById(id_r);
    }

}
