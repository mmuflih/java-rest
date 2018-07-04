package usecase;

import domain.pojo.Phonebook;
import domain.repository.PhonebookRepository;
import domain.service.PhonebookService;

import java.util.List;

/**
 * Created by Muhammad Muflih Kholidin
 * https://github.com/mmuflih
 * muflic.24@gmail.com
 * at: 04/07/18
 */
public class GetPhonebookUsecase {
    private PhonebookRepository phonebookRepository;

    public GetPhonebookUsecase() {
        phonebookRepository = new PhonebookService();
    }

    public Phonebook get(int id) {
        return phonebookRepository.find(id);
    }
}
