package domain.pojo;

/**
 * Created by Muhammad Muflih Kholidin
 * https://github.com/mmuflih
 * muflic.24@gmail.com
 * at: 04/07/18
 */
public class Mahasiswa {
    private String nim;
    private String name;

    public Mahasiswa(String nim, String name) {
        this.name = name;
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }
}
