package com.projet.back.services;

import com.projet.back.models.DemandeFourniture;
import com.projet.back.repository.DemandeFournitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandeFournitureService {

    @Autowired
    private DemandeFournitureRepo demandeFournitureRepo;

    public DemandeFournitureService() {
    }

    public List<DemandeFourniture> findAll() {
        return this.demandeFournitureRepo.findAll();
    }

    public List<DemandeFourniture> findByEtat(int etat) {
        return this.demandeFournitureRepo.findByEtat(etat);
    }

    public List<DemandeFourniture> getFournitureByEmployee(Long employeeId) {
        return this.demandeFournitureRepo.findByEmployeeId(employeeId);
    }

    public DemandeFourniture findById(long id) {
        return this.demandeFournitureRepo.findById(id).orElse(null);
    }

    public DemandeFourniture save(DemandeFourniture demandeFourniture) {
        return this.demandeFournitureRepo.save(demandeFourniture);
    }

    public void deleteById(Long id) {
        this.demandeFournitureRepo.deleteById(id);
    }

    public Long countAllDemandeFournitures() {
        return demandeFournitureRepo.count();
    }
}
