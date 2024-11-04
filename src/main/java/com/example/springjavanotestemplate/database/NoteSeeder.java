package com.example.springjavanotestemplate.database;

import com.example.springjavanotestemplate.entity.NoteEntity;
import com.example.springjavanotestemplate.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class NoteSeeder {
    private final NoteRepository repository;

    public void seed() {
        repository.save(new NoteEntity("Note 1", "This is note 1"));
        repository.save(new NoteEntity("Note 2", "This is note 2"));
        repository.save(new NoteEntity("Note 3", "This is note 3"));
    }
}
