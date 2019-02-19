package com.lambdaschool.javaorders.models;

import javax.persistence.*;

@Entity
@Table(name = "agents")
public class Agents {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long agentCode;

    private String agentName, workingArea, phone, country;
    private double commission;

    public Agents() {
    }

    public long getAgentCode() {
        return agentCode;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getWorkingArea() {
        return workingArea;
    }

    public void setWorkingArea(String workingArea) {
        this.workingArea = workingArea;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
}
