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
public class EditPhonebookUsecase {
    private PhonebookRepository phonebookRepository;

    public EditPhonebookUsecase() {
        phonebookRepository = new PhonebookService();
    }

    public Phonebook edit(int id, Phonebook phonebook) {
        return phonebookRepository.edit(id, phonebook);
    }
}
