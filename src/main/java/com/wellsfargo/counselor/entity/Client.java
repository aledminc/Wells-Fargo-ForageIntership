package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import com.wellsfargo.counselor.entity.Advisor;
import com.wellsfargo.counselor.entity.Security;


@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false) // FK to Advisor
    private Advisor advisor;

    @OneToOne()
    private Portfolio portfolio;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    protected Client() {

    }

    public Client(String firstName, String lastName, String address, String phone, String email, Advisor advisor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.advisor = advisor;
    }

    public Advisor getAdvisor() {
        return this.advisor;
    }

    public void setAdvisor(Advisor advisor){
        this.advisor = advisor;
    }

    public Portfolio getPortfolio() {
        return this.portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
