package domain.repository;

import domain.pojo.Mahasiswa;

import java.util.List;

/**
 * Created by Muhammad Muflih Kholidin
 * https://github.com/mmuflih
 * muflic.24@gmail.com
 * at: 04/07/18
 */
public interface MahasiswaRepository {
    public boolean save(Mahasiswa m);

    public List<Mahasiswa> getList();

    public Mahasiswa find(int nim);
}
