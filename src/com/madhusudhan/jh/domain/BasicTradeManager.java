package com.madhusudhan.jh.domain;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by головченко on 15.05.2016.
 */
public class BasicTradeManager {

    public void persistTrade(Trade trade) {
        Session session = com.madhusudhan.jh.domain.SessionFactory.getSession();
        session.beginTransaction();
        session.save(trade);
        session.getTransaction().commit();
    }

    public void findTrade(int tradeId) {
        Session session = com.madhusudhan.jh.domain.SessionFactory.getSession();
        session.beginTransaction();
        Trade trade = (Trade)session.load(Trade.class, tradeId);
        System.out.println("Trade:"+trade);
        session.getTransaction().commit();
    }

    public void findAll(){
        Session session = SessionFactory.getSession();
        session.beginTransaction();
        List<Trade> trades = session.createQuery("from Trade").list();
        session.getTransaction().commit();
        System.out.println("All Trades:"+trades);
    }
}
