package com.example.demo.service;

import com.example.demo.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService{
    @Autowired

    ClassRepository classRepository;

    @Override
    public void saveClass(Class c) {classRepository.save(c);
    }

    @Override
    public void deleteClass(Integer id) {
        classRepository.deleteById(id);
    }

    @Override
    public Class findById(Integer id) {
        return classRepository.findById(id).get();
    }

    @Override
    public List<Class> findAll() {
        return classRepository.findAll();
    }

    public List<Class> findAllByName(String name){
        return classRepository.findAllByName(name);
    }
}
