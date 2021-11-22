package com.demo;

import com.demo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("JPU");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx =em.getTransaction();

        Student s1 = new Student("Thaw Thaw", LocalDate.of(2000,3,22),"ISY");
        Student s2 = new Student("Ye",LocalDate.of(2000,8,29),"YGN");


        tx.begin();
        em.persist(s1);
        em.persist(s2);
        tx.commit();

        em.close();
        emf.close();
    }
}
