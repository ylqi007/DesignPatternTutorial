package com.ylqi007.uml.implementation;

// 实现关系
public class PersonServiceBean implements PersonService {
    @Override
    public void delete(Integer id) {
        System.out.println("Implements PersonService.delete()");
    }
}

interface PersonService {
    void delete(Integer id);
}

