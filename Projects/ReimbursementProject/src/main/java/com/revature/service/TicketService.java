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
        while (amount == 0 ){
            System.out.println("Invalid input. ");
            System.out.println("Please enter amount of reimbursement: ");
            amount = input.nextDouble();
        }
        input.nextLine();
        System.out.println("Please enter description: ");
        String description = input.nextLine();
        while (description.length() < 1 || description == null){
            System.out.println("Invalid input");
            System.out.println("Please enter description: ");
            description = input.nextLine();
        }
        System.out.println("Please enter your username: ");
        String username = input.nextLine();
        while (username.length() < 1 || username == null){
            System.out.println("Invalid input");
            System.out.println("Please enter your username: ");
            username = input.nextLine();
        }
        td.createTicket(amount, description, username);
    }

    public void getAllTicketsByUsername(String username){
        System.out.println("Using the database to return all our ticket objects");

        List<Ticket> existingTickets = td.getAllTicketsByUsername(username);

        for(Ticket ticket: existingTickets){
            System.out.println(ticket);
        }


    }
}
