package io.zipcoder.persistenceapp.controller;

import io.zipcoder.persistenceapp.models.Employee;
import io.zipcoder.persistenceapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService service;

    @PostMapping("/employee/manager{id}--{manger_id}")
    public ResponseEntity<Employee> updateManager (@PathVariable Long id, Employee employee ){
        return new ResponseEntity<Employee>(service.updateManager(employee),HttpStatus.OK);
    }
    @GetMapping("/employees")
    public ResponseEntity<Iterable<Employee>> getAllEmployees(){
        return new ResponseEntity<Iterable<Employee>>(service.getAllEmployees(), HttpStatus.OK);
    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id){
        return new ResponseEntity<Employee>(service.getEmployee(id), HttpStatus.OK);
    }
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(service.updateEmplyoee(employee), HttpStatus.OK);
    }
    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(service.createEmployee(employee),HttpStatus.CREATED);
    }
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable Long id){
        service.deleteEmployee(emplyoee);
        return new ResponseEntity<Employee>(HttpStatus.OK);
    }
}
