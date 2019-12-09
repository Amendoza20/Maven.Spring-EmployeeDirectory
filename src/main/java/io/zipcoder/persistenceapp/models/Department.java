package io.zipcoder.persistenceapp.models;

import javax.persistence.*;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true, name = "manager_id")
    private Employee manager;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Department(String departmentName, Employee manager) {
        this.departmentName = departmentName;
        this.manager = manager;
    }

    public Department(Long departmentId, String departmentName, Employee manager) {
        this.departmentName = departmentName;
        this.manager = manager;
    }

    public Department() {
    }
}

