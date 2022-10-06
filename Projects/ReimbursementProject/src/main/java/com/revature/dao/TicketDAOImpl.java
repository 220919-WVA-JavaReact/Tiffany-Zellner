package com.revature.dao;

import com.revature.models.Ticket;
import com.revature.models.User;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static com.revature.App.us;

public class TicketDAOImpl implements TicketDAO {
    @Override
    public Ticket createTicket(double amount, String description) throws SQLException {

        User loggedInUser = us.Login();
        User user_id = loggedInUser;

        Ticket ticket = new Ticket();

        try(Connection conn = ConnectionUtil.getConnection()){
            String sql = "INSERT INTO tickets (amount, description) VALUES (?,?) RETURNING *";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setDouble(1, amount);
            stmt.setString(2, description);

            ResultSet rs;

            if ((rs = stmt.executeQuery()) != null){
                rs.next();

                int id = rs.getInt("id");
                double receivedAmount = rs.getDouble("amount");
                String receivedDescription = rs.getString("description");
                int receivedUser_id = rs.getInt("user_id");

                ticket = new Ticket(amount, description);
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
        return ticket;
    }

    @Override
    public List<Ticket> getAllTickets() {
        return null;
    }

    @Override
    public List<Ticket> getAllTickets(int id, double amount, String description, String status, int user_id) {
        return null;
    }
}
