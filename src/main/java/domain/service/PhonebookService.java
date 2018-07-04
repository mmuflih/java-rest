package domain.service;

import config.Database;
import domain.pojo.Phonebook;
import domain.repository.PhonebookRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad Muflih Kholidin
 * https://github.com/mmuflih
 * muflic.24@gmail.com
 * at: 04/07/18
 */
public class PhonebookService implements PhonebookRepository {

    private Connection conn = new Database().getConnection();

    @Override
    public boolean save(Phonebook data) {
        String query = "INSERT INTO phonebooks (name, phone) VALUES (?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, data.getName());
            ps.setString(2, data.getPhone());
            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Phonebook edit(int id, Phonebook data) {
        String query = "UPDATE phonebooks SET name = ?, phone = ? WHERE id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, data.getName());
            ps.setString(2, data.getPhone());
            ps.setInt(3, id);
            ps.execute();
            return data;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Phonebook find(int id) {
        String query = "SELECT * FROM phonebooks WHERE id = " + id;
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                Phonebook pb = new Phonebook(rs.getInt("id"), rs.getString("name"), rs.getString("phone"));
                return pb;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Phonebook> getList() {
        String query = "SELECT * FROM phonebooks";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            List<Phonebook> pbs = new ArrayList<>();
            while(rs.next()) {
                Phonebook pb = new Phonebook(rs.getInt("id"), rs.getString("name"), rs.getString("phone"));
                pbs.add(pb);
            }
            return pbs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        String query = "DELETE FROM phonebooks WHERE id = " + id;
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
