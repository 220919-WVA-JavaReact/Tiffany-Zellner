package com.revature.models;

import java.util.Objects;

public class Ticket {

    private int ID;

    private double amount;

    private String description;

    private String status = "pending";

    private int user_id;

    public Ticket(double amount, String description, int user_id) {
        this.amount = amount;
        this.description = description;
        this.user_id = user_id;
    }

    public Ticket() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return ID == ticket.ID && Double.compare(ticket.amount, amount) == 0 && user_id == ticket.user_id && description.equals(ticket.description) && status.equals(ticket.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, amount, description, status, user_id);
    }
}
