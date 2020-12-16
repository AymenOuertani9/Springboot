package com.khouloud.auditapp.Service;

import com.khouloud.auditapp.Entity.Reclamation;
import com.khouloud.auditapp.Entity.User;

import java.util.List;

public interface ReclamationService {
    List<Reclamation> getAllReclamation();

    List<Reclamation> getAllreclamationByUser(User user);

    Reclamation addReclamation(Reclamation reclamation);

    boolean deleteReclamation(Long id);
}
