package com.projet.back.controllers;

import com.projet.back.models.DemandeFourniture;
import com.projet.back.services.DemandeFournitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/demandefourniture")
public class DemandeFournitureController {

    @Autowired
    private DemandeFournitureService demandeFournitureService;

    public DemandeFournitureController() {
    }

    @GetMapping("/all")
    public List<DemandeFourniture> findAll() {
        return demandeFournitureService.findAll();
    }

    @GetMapping("/etat/{etat}")
    public List<DemandeFourniture> findByEtat(@PathVariable("etat") int etat) {
        return demandeFournitureService.findByEtat(etat);
    }

    @GetMapping("/employee/fourniture/{id}")
    public List<DemandeFourniture> findByEmployeeId(@PathVariable Long id) {
        return demandeFournitureService.getFournitureByEmployee(id);
    }

    @PostMapping("/add")
    public DemandeFourniture createDemandeFourniture(@RequestBody DemandeFourniture demandeFourniture) {
        return demandeFournitureService.save(demandeFourniture);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDemandeFourniture(@PathVariable("id") Long id) {
        demandeFournitureService.deleteById(id);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> countAllDemandeFournitures() {
        long count = demandeFournitureService.countAllDemandeFournitures();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @PutMapping("/accepter/{id}")
    public DemandeFourniture acceptDemandeFourniture(@PathVariable(value = "id") long id) {
        DemandeFourniture currentDemandeFourniture = demandeFournitureService.findById(id);
        currentDemandeFourniture.setEtat(1);

        // Ajoutez ici la logique pour traiter l'acceptation de la demande et effectuer toute autre opération nécessaire.

        return demandeFournitureService.save(currentDemandeFourniture);
    }

    @PutMapping("/rejeter/{id}")
    public DemandeFourniture rejectDemandeFourniture(@PathVariable(value = "id") long id) {
        DemandeFourniture currentDemandeFourniture = demandeFournitureService.findById(id);
        currentDemandeFourniture.setEtat(2);

        // Ajoutez ici la logique pour traiter le rejet de la demande et effectuer toute autre opération nécessaire.

        return demandeFournitureService.save(currentDemandeFourniture);
    }
}
