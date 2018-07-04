package domain.service;

import config.Database;
import domain.pojo.Mahasiswa;
import domain.repository.MahasiswaRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad Muflih Kholidin
 * https://github.com/mmuflih
 * muflic.24@gmail.com
 * at: 04/07/18
 */
public class MahasiswaService implements MahasiswaRepository {
    private Connection conn = new Database().getConnection();

    @Override
    public boolean save(Mahasiswa m) {
        String query = "Insert into mahasiswa (name, nim) value (?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, m.getName());
            ps.setString(2, m.getNim());
            return ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Mahasiswa> getList() {
        List<Mahasiswa> mhss = new ArrayList<>();
        try {
            String query = "select * from mahasiswa";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Mahasiswa m = new Mahasiswa(
                        rs.getString("name"),
                        rs.getString("nim")
                );
                mhss.add(m);
            }
            return mhss;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Mahasiswa find(int id) {
        try {
            String query = "SELECT * FROM mahasiswa " +
                    " WHERE id = " + id;
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Mahasiswa m = new Mahasiswa(
                        rs.getString("name"),
                        rs.getString("nim")
                );
                return m;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
