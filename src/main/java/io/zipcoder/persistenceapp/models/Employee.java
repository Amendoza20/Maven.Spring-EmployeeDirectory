package io.zipcoder.persistenceapp.models;

import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import javax.xml.transform.sax.SAXTransformerFactory;
import java.time.format.DateTimeFormatter;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String title;
    private String phoneNumber;
    private String email;
    private DateTimeFormatter hireDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private Employee manager;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dept_id")
    private Department department_number;



    public Employee() {
    }
    public Employee(Long id, String firstName, String lastName, String title, String phoneNumber, String email, DateTimeFormatter hireDate, Employee manager, Department department_number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hireDate = hireDate;
        this.manager = manager;
        this.department_number = department_number;

}
    public Employee(String firstName, String lastName, String title, String phoneNumber, String email, DateTimeFormatter hireDate, Employee manager, Department department_number){
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.hireDate = hireDate;
        this.manager = manager;
        this.department_number = department_number;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DateTimeFormatter getHireDate() {
        return hireDate;
    }

    public void setHireDate(DateTimeFormatter hireDate) {
        this.hireDate = hireDate;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Department getDepartmentId() {
        return department_number;
    }

    public void setDepartmentId(Department department_number) {
        this.department_number = department_number;
    }

}