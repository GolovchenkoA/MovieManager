package com.madhusudhan.jh.domain;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by головченко on 15.05.2016.
 */
public class SessionFactory {
    private static final org.hibernate.SessionFactory ourSessionFactory;
    private static final ServiceRegistry serviceRegistry;

    static {
        try {
            Configuration configuration = new Configuration();
            // Добавил через файл hibernate.cfg.xml   // Сущность которая описана через аннотации, а не hbm.xml
            //configuration.addAnnotatedClass(Trade.class);
            configuration.configure();

/*
            // Установка параметров вместо файла ibernate.cfg.xml
            Configuration configuration = new Configuration();
            configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyDialect")
            configuration.setProperty("hibernate.connection.username", user);
            configuration.setProperty("hibernate.connection.password", password);
            configuration.setProperty("hibernate.connection.url", "org.hibernate.dialect.MySQL5Dialect");
            configuration.setProperty("hibernate.order_updates", "true");
*/

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }
}
