package ru.gothmog.one_to_many.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date dateCreated =  new Date();

    @Temporal(TemporalType.TIMESTAMP)
    protected Date lastUpdated =  new Date();

    private String email;
    private String name;
    private String password;

    @OneToOne(mappedBy = "employee",optional = false,cascade = CascadeType.ALL)
    private Address address;

    @ManyToOne(fetch = FetchType.EAGER)
    private Department department;

    public Employee() {
    }

    public Employee(String email, String name, String password, Address address, Department department) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.address = address;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", lastUpdated=" + lastUpdated +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
