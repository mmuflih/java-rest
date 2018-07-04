package usecase;

import domain.pojo.Phonebook;
import domain.repository.PhonebookRepository;
import domain.service.PhonebookService;

/**
 * Created by Muhammad Muflih Kholidin
 * https://github.com/mmuflih
 * muflic.24@gmail.com
 * at: 04/07/18
 */
public class AddPhonebookUsecase {
    private PhonebookRepository phonebookRepo;

    public AddPhonebookUsecase() {
        phonebookRepo = new PhonebookService();
    }

    public Phonebook save(String name, String phone) {
        Phonebook pb = new Phonebook(0, name, phone);
        phonebookRepo.save(pb);
        return pb;
    }
}
