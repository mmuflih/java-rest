package controller;

import domain.pojo.Mahasiswa;
import org.springframework.web.bind.annotation.*;
import usecase.AddMahasiswaUsecase;
import usecase.GetListMahasiswaUsecase;
import usecase.GetMahasiswaUsecase;

import java.util.List;

/**
 * Created by Muhammad Muflih Kholidin
 * https://github.com/mmuflih
 * muflic.24@gmail.com
 * at: 04/07/18
 */

@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaController {
    private AddMahasiswaUsecase add;
    private GetListMahasiswaUsecase list;
    private GetMahasiswaUsecase get;

    public MahasiswaController() {
        add = new AddMahasiswaUsecase();
        list = new GetListMahasiswaUsecase();
        get = new GetMahasiswaUsecase();
    }

    @PostMapping()
    public Mahasiswa addMahasiswa(@RequestBody Mahasiswa input) {
        Mahasiswa mhs = add.save(input.getNim(), input.getName());
        return mhs;
    }

    @GetMapping()
    public List<Mahasiswa> getListMahasiswa() {
        return list.getList();
    }

    @GetMapping("/{id}")
    public Mahasiswa getMahasiswa(@PathVariable("id") String id) {
        return get.find(Integer.parseInt(id));
    }
}
