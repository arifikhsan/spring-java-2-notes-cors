package com.example.springjavanotestemplate.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "notes")
public class NoteEntity extends BaseEntity {
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;
}
