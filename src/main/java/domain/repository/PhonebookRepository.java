package domain.repository;

import domain.pojo.Phonebook;

import java.util.List;

/**
 * Created by Muhammad Muflih Kholidin
 * https://github.com/mmuflih
 * muflic.24@gmail.com
 * at: 04/07/18
 */
public interface PhonebookRepository {
    public boolean save(Phonebook data);

    public Phonebook edit(int id, Phonebook data);

    public Phonebook find(int id);

    public List<Phonebook> getList();

    public boolean delete(int id);
}
