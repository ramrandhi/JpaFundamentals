package com.learnings.JpaBasics;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
    	EntityManager entityManager = entityManagerFactory.createEntityManager();
    	
    	Alien alien = entityManager.find(Alien.class, 3);
    	System.out.println(alien);
    	
//    	Alien alien = new Alien();
//    	alien.setAid(null);
//    	alien.setName("Lokesh");
//    	alien.setTech("angular");
    	
//    	entityManager.getTransaction().begin();
//        entityManager.persist(alien);
//        entityManager.getTransaction().commit();
//
//        entityManager.close();
//        entityManagerFactory.close();
    }
}
