package com.revature.dao;

import com.revature.models.Ticket;

public interface TicketDAO {
    void createTicket(double amount, String description, int user_id);

    void updateTicket(Ticket update);
}
