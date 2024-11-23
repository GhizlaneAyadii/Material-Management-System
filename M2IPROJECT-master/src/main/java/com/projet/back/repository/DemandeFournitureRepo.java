package com.projet.back.repository;



import com.projet.back.models.DemandeFourniture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DemandeFournitureRepo extends JpaRepository<DemandeFourniture, Long> {
    List<DemandeFourniture> findByEtat(int etat);

    List<DemandeFourniture> findByEmployeeId(Long employeeId);
}
