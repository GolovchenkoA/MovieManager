package com.madhusudhan.jh.domain;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by головченко on 15.05.2016.
 */
public class BasicMovieManager {
    public void persistMovie(Movie movie) {
        Session session = com.madhusudhan.jh.domain.SessionFactory.getSession();
        Transaction tx = null;

         try{
            tx = session.beginTransaction();
            session.save(movie);
            session.getTransaction().commit();
        }catch (Exception e){
             tx.rollback();
            System.out.println("Ошибка сохранения в БД: ");
            e.printStackTrace();
        }
    }

    public void findMovie(int movieId) {
        Session session = com.madhusudhan.jh.domain.SessionFactory.getSession();
        session.beginTransaction();
        Movie movie = (Movie)session.load(Movie.class, movieId);
        System.out.println("Movie:"+movie);
        session.getTransaction().commit();
    }

    public void findAll(){
        Session session = SessionFactory.getSession();
        session.beginTransaction();
        List<Movie> movies = session.createQuery("from Movie").list();
        session.getTransaction().commit();
        System.out.println("All Movies:"+movies);
    }
}

