package controller;

import domain.pojo.Phonebook;
import org.springframework.web.bind.annotation.*;
import usecase.*;

import java.util.List;

/**
 * Created by Muhammad Muflih Kholidin
 * https://github.com/mmuflih
 * muflic.24@gmail.com
 * at: 04/07/18
 */

@RestController
@RequestMapping("/phonebook")
public class PhonebookController {
    private AddPhonebookUsecase addUsecase;
    private GetPhonebookUsecase get;
    private EditPhonebookUsecase edit;
    private GetPhonebookListUsecase listUsecase;
    private DeletePhonebookUsecase delete;

    public PhonebookController() {
        addUsecase = new AddPhonebookUsecase();
        listUsecase = new GetPhonebookListUsecase();
        get = new GetPhonebookUsecase();
        edit = new EditPhonebookUsecase();
    }

    @PostMapping()
    public Phonebook add(@RequestBody Phonebook input) {
        Phonebook pb = addUsecase.save(input.getName(), input.getPhone());
        return pb;
    }

    @GetMapping()
    public List<Phonebook> list() {
        return listUsecase.getList();
    }

    @GetMapping()
    public Phonebook get(@RequestParam(value = "id") String id) {
        return get.get(Integer.parseInt(id));
    }

    @PutMapping()
    public Phonebook edit(@RequestParam(value = "id") String id, @RequestBody Phonebook input) {
        return edit.edit(Integer.parseInt(id), input);
    }

    @DeleteMapping()
    public boolean delete(@RequestParam(value = "id") String id) {
        return delete.delete(Integer.parseInt(id));
    }
}
