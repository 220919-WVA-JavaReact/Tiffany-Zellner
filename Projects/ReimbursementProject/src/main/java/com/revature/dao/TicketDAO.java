package com.revature.dao;

import com.revature.models.Ticket;

import java.sql.SQLException;
import java.util.List;

public interface TicketDAO {
    Ticket createTicket(double amount, String description) throws SQLException;

    List<Ticket> getAllTickets();

    List<Ticket> getAllTickets(int id, double amount, String description, String status, int user_id);
}
