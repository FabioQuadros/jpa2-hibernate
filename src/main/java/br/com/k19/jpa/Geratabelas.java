/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.k19.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Fabio
 */
public class Geratabelas {
    
    private static EntityManager manager;
    private static EntityManagerFactory factory;
    
    
    public static void main(String[] args) {
        
        Editora e = new Editora();
        e.setNome("Fabio Guedes");
        e.setEmail("fabinho-guedes1@live.com");

        factory = Persistence.createEntityManagerFactory("livraria-pu");
        manager = factory.createEntityManager();
        
        manager.getTransaction().begin();
        manager.persist(e);
        manager.getTransaction().commit();
        
        System.out.println("Seu id é: "+e.getId());
        System.out.println("Seu nome é: "+e.getNome());
        System.out.println("Seu email é: "+e.getEmail()+"\n");
        manager.close();
        
    }
   
}
