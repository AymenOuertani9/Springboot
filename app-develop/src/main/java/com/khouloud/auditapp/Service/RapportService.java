package com.khouloud.auditapp.Service;

import com.khouloud.auditapp.Entity.Rapport;
import com.khouloud.auditapp.Entity.User;

public interface RapportService {
    Rapport getRapportByUser(User user);

    boolean DeleteRapportById(Long id);

    Rapport updateRapport(Rapport rapport);
}
