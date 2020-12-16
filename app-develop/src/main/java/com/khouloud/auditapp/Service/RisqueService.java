package com.khouloud.auditapp.Service;


import com.khouloud.auditapp.Entity.Risque;

import java.util.List;

public interface RisqueService {

    Risque save(Risque risque);

    Risque get(Long id) throws Exception;

    List<Risque> getAll();

    boolean delete(Long id);

}
