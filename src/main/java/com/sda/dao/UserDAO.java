package com.sda.dao;
import com.sda.model.User;

import com.sda.db.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDAO {

    public void create (User user){
        try(Session session = HibernateUtils.getSessionFactory().openSession()){

            Transaction transaction = session.beginTransaction();
            session.persist(user);
            transaction.commit();
        }

    }
}
