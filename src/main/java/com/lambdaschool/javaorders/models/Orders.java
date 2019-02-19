package com.lambdaschool.javaorders.models;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ordNum;

    private double ordAmount, advanceAmount;

    @ManyToOne
    @JoinColumn(name = "custcode", nullable = false)
    private Agents custCode;

    @ManyToOne
    @JoinColumn(name = "agentcode", nullable = false)
    private Agents agentCode;

    private String ordDescription;

    public Orders() {
    }

    public long getOrdNum() {
        return ordNum;
    }

    public double getOrdAmount() {
        return ordAmount;
    }

    public void setOrdAmount(double ordAmount) {
        this.ordAmount = ordAmount;
    }

    public double getAdvanceAmount() {
        return advanceAmount;
    }

    public void setAdvanceAmount(double advanceAmount) {
        this.advanceAmount = advanceAmount;
    }

    public Agents getCustCode() {
        return custCode;
    }

    public void setCustCode(Agents custCode) {
        this.custCode = custCode;
    }

    public Agents getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(Agents agentCode) {
        this.agentCode = agentCode;
    }

    public String getOrdDescription() {
        return ordDescription;
    }

    public void setOrdDescription(String ordDescription) {
        this.ordDescription = ordDescription;
    }
}
