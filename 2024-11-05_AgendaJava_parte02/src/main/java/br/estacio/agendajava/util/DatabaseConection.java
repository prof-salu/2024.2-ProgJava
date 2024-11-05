
package br.estacio.agendajava.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DatabaseConection {
    private static final EntityManagerFactory FACTORY = 
            Persistence.createEntityManagerFactory("agendaJava");
    
    public static EntityManager getEntityManager(){
        return FACTORY.createEntityManager();
    }
}
