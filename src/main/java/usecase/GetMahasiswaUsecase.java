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
public class GetMahasiswaUsecase {
    private MahasiswaRepository mhsRepo;

    public GetMahasiswaUsecase() {
        mhsRepo = new MahasiswaService();
    }

    public Mahasiswa find(int id) {
        return mhsRepo.find(id);
    }
}
