package com.projet.back.controllers;


import com.projet.back.models.Employees;
import com.projet.back.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// on specifie que quelques methodes ne peuvent etre execute seulement si le client a un role de chef ou adjoint
@RestController
@PreAuthorize("hasAnyRole('Chef', 'Adjoint')")
@RequestMapping("/admin/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    public EmployeeController(EmployeeService employeeService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.employeeService = employeeService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employees>> getAllEmployees() {
        List<Employees> employees = employeeService.findAllEmployees();
        return  new ResponseEntity<>(employees, HttpStatus.OK);
    }
    //this is considered as /employee/find/{id}
    @GetMapping("/find/{id}")
    public ResponseEntity<Employees> getEmployeeById(@PathVariable("id") Long id) {
        Employees employee = employeeService.findEmployeeById(id);
        return  new ResponseEntity<>(employee, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Employees> addEmployee(@RequestBody Employees employee) {

        String encodedPassword = bCryptPasswordEncoder
                .encode(employee.getPassword());

        employee.setPassword(encodedPassword);

        Employees newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Employees> updateEmployee(@RequestBody Employees employee) {
        Employees oldEmployee = employeeService.findEmployeeById(employee.getId());
        if (oldEmployee.getPassword() != employee.getPassword()) {
            String encodedPassword = bCryptPasswordEncoder
                    .encode(employee.getPassword());

            employee.setPassword(encodedPassword);
        }
        Employees updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        //return "deleted successfully";
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Employees>> getEmployeeByNomLikeIgnoreCase(@RequestParam("nom") String nom) {
        List<Employees> employees = employeeService.findByNomLikeIgnoreCase(nom);
        return  new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/count")
    public ResponseEntity<Long> countAllEmployees() {
        long count = employeeService.countAllEmployees();
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

}

