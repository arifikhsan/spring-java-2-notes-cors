package com.example.springjavanotestemplate.controller;

import com.example.springjavanotestemplate.entity.NoteEntity;
import com.example.springjavanotestemplate.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/notes")
public class NoteController {
    private final NoteService service;

    @GetMapping
    public Page<NoteEntity> getNotes(Pageable pageable) {
        return service.findAll(pageable);
    }
}
