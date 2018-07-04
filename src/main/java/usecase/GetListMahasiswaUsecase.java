package usecase;

import domain.pojo.Mahasiswa;
import domain.repository.MahasiswaRepository;
import domain.service.MahasiswaService;

import java.util.List;

/**
 * Created by Muhammad Muflih Kholidin
 * https://github.com/mmuflih
 * muflic.24@gmail.com
 * at: 04/07/18
 */
public class GetListMahasiswaUsecase {
    private MahasiswaRepository mhsRepo;

    public GetListMahasiswaUsecase() {
        mhsRepo = new MahasiswaService();
    }

    public List<Mahasiswa> getList() {
        return mhsRepo.getList();
    }
}
