package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Setter
@Getter
@Table(name = "classe", schema = "apicrud", catalog = "")
public class Class {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "room")
    private String room;
    @Basic
    @Column(name = "note")
    private String note;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return id == aClass.id && Objects.equals(name, aClass.name) && Objects.equals(room, aClass.room) && Objects.equals(note, aClass.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, room, note);
    }
}