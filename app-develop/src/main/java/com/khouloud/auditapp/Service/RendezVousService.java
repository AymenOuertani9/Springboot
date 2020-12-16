package com.khouloud.auditapp.Service;

import com.khouloud.auditapp.Entity.RendezVous;
import com.khouloud.auditapp.Entity.User;

import java.util.List;
import java.util.Optional;

public interface RendezVousService {
    List<RendezVous> getAllrendezvouz();

    List<RendezVous> getAllrendezvouzByUser(User user);

    RendezVous addRendervouz(RendezVous rendezVous);

    RendezVous updateRendervouz(RendezVous rendezVous);

    boolean deleteRendezvouz(Long id);

    public Optional<RendezVous> prendreRendezVous (RendezVous rendezVous);

}
