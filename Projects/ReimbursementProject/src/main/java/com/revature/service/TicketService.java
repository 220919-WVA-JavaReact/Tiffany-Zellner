package com.revature.service;

import com.revature.dao.TicketDAO;
import com.revature.dao.TicketDAOImpl;
import com.revature.models.Ticket;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TicketService {

    Scanner input = new Scanner(System.in);

    TicketDAO td = (TicketDAO) new TicketDAOImpl();

    public void createTicket() throws SQLException {
        System.out.println("Please enter amount of reimbursement: ");
        double amount = input.nextDouble();

        System.out.println("Please enter description: ");
        String description = input.nextLine();

        td.createTicket(amount, description);
    }

    public void getAllTickets(){
        System.out.println("Using the database to return all our ticket objects");

        List<Ticket> ticketList = td.getAllTickets();

        for(Ticket ticket: ticketList){
            System.out.println(ticket);
        }


    }
}
