package com.revature.service;

import com.revature.dao.TicketDAO;
import com.revature.dao.TicketDAOImpl;
import com.revature.models.Ticket;

import java.util.Scanner;

public class TicketService {

    Scanner input = new Scanner(System.in);

    TicketDAO td = (TicketDAO) new TicketDAOImpl();

    public void createTicket() {
        System.out.println("Please enter amount of reimbursement: ");
        double amount = input.nextDouble();

        System.out.println("Please enter description: ");
        String description = input.nextLine();

        System.out.println("Please enter user ID: ");
        int user_id = Integer.parseInt(input.nextLine());

        td.createTicket(amount, description, user_id);
    }

    public void updateTicket(int user_id) {
        System.out.println("Please enter updated amount: ");
        double amount = input.nextDouble();

        System.out.println("Please enter updated description: ");
        String description = input.nextLine();

        Ticket update = new Ticket(amount, description, user_id);

        td.updateTicket(update);
    }
}
