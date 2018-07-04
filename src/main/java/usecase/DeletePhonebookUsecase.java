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
public class DeletePhonebookUsecase {
    private PhonebookRepository phonebookRepository;

    public DeletePhonebookUsecase() {
        phonebookRepository = new PhonebookService();
    }

    public boolean delete(int id) {
        return phonebookRepository.delete(id);
    }
}
