package com.nik.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.nik.util.Util;

public class Manager2 {
	public static void main(String[] args) 
    {
        Session session = Util.getSession();
        session.beginTransaction();
        
        //Add subscription
        SubscriptionEntity subOne = new SubscriptionEntity();
        subOne.setSubscriptionName("Entertainment");
         
        SubscriptionEntity subTwo = new SubscriptionEntity();
        subTwo.setSubscriptionName("Horror");
         
        Set<SubscriptionEntity> subs = new HashSet<SubscriptionEntity>();
        subs.add(subOne);
        subs.add(subTwo);
         
        //Add readers
        ReaderEntity readerOne = new ReaderEntity();
        readerOne.setEmail("demo-user1@mail.com");
        readerOne.setFirstName("demo");
        readerOne.setLastName("user");
         
        ReaderEntity readerTwo = new ReaderEntity();
        readerTwo.setEmail("demo-user2@mail.com");
        readerTwo.setFirstName("demo");
        readerTwo.setLastName("user");
         
        Set<ReaderEntity> readers = new HashSet<ReaderEntity>();
        readers.add(readerOne);
        readers.add(readerTwo);
         
        readerOne.setSubscriptions(subs);
        readerTwo.setSubscriptions(subs);
 
        session.save(readerOne);
        session.save(readerTwo);
         
        session.getTransaction().commit();
        session.close();
    }
}
