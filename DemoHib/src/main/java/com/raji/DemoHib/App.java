package com.raji.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Alien alien=new Alien();
       alien.setAid(12);
       alien.setAname("Raji");
       alien.setAcolor("blue");
       
       Configuration con=new Configuration();
         SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        session.save(alien);

    }
}
