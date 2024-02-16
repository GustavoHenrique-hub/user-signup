package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import connetion.Connetion;
import entity.User;

public class UserDAO {
    public void userSignup(User user) {

        String sql = "INSERT INTO USER (NAME, LOGIN, EMAIL, PASSWORD) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Connetion.getConnection().prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setString(2, user.getLogin());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
