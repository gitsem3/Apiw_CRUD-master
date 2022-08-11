package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassRepository extends JpaRepository<Class, Integer> {
    List<Class> findAllByName(String name);
    List<Class> findAllByNameContainsIgnoreCase(String name);
    List<Class> findAllByNameAndRoom(String name, String room);
    List<Class> findAllByNameOrderByRoomAsc(String name); //Asc là ít - Desc là nhiều
}
