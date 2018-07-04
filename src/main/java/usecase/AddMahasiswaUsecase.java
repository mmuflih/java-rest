package usecase;

import domain.pojo.Mahasiswa;
import domain.repository.MahasiswaRepository;
import domain.service.MahasiswaService;

/**
 * Created by Muhammad Muflih Kholidin
 * https://github.com/mmuflih
 * muflic.24@gmail.com
 * at: 04/07/18
 */
public class AddMahasiswaUsecase {
    private MahasiswaRepository mhsRepo;

    public AddMahasiswaUsecase() {
        mhsRepo = new MahasiswaService();
    }

    public Mahasiswa save(String nim, String name) {
        Mahasiswa mhs = new Mahasiswa(nim, name);
        mhsRepo.save(mhs);
        return mhs;
    }
}
