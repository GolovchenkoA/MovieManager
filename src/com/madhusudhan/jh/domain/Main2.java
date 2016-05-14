package com.madhusudhan.jh.domain;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * Created by головченко on 15.05.2016.
 */
public class Main2 {

    public static void main(String[] args) {
        AnnotationConfiguration configuration = new AnnotationConfiguration();
        configuration.addAnnotatedClass(Movie_.class);
        configuration.configure("hibernate.cfg.xml");

        new SchemaExport(configuration).create(true,true);
    }
}
