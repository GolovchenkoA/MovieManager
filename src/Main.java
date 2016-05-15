import com.madhusudhan.jh.domain.*;
import com.madhusudhan.jh.domain.showroom.Car;
import com.madhusudhan.jh.domain.showroom.Showroom;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by головченко on 14.05.2016.
 */
public class Main {
/*    private static final SessionFactory ourSessionFactory;
    private static final ServiceRegistry serviceRegistry;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }*/

/*    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        try {
            System.out.println("querying all the managed entities...");
            final Map metadataMap = session.getSessionFactory().getAllClassMetadata();
            for (Object key : metadataMap.keySet()) {
                final ClassMetadata classMetadata = (ClassMetadata) metadataMap.get(key);
                final String entityName = classMetadata.getEntityName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    System.out.println("  " + o);
                }
            }
        } finally {
            session.close();
        }
    }*/

    public static void main(String[] args) {


        ////////////////////////////////////////////////////////
        //BasicMovieManager movieManager = new BasicMovieManager();

            // Сохранить сущность
/*            Movie movie = new Movie();
            //movie.setTitle("title2");
            movie.setDirector("DirectorFIO");
            movie.setSynopsis("movie describe");

            movieManager.persistMovie(movie);*/

        // Чтение сущности Movie
/*       movieManager.findMovie(2);
        movieManager.findAll();*/

        ///////////////////////////////////////////////////////////////
/*
        // Сохранить сущность Trade
        BasicTradeManager tradeManager = new BasicTradeManager();
        Trade trade = new Trade();
        trade.setQuantity(2);

        tradeManager.persistTrade(trade);
*/

        //////////////////////////////////////////////////////////
 /*       // Создаем новый курс (составной Primary Key)
       BasicCourseManager courseManager = new BasicCourseManager();

        Course course = new Course();
        CoursePK coursePk = new CoursePK();
        coursePk.setTitle("Computer Science");
        coursePk.setTutor("Prof. Harry Barry");
        course.setId(coursePk);
        course.setTotalStudents(20);
        course.setRegisteredStudents(12);
        courseManager.persist(course);


        // Находим все курсы
        courseManager.findAll();
*/

        //  Showromm Entity
        Showroom showroom = new Showroom();
        List<Car> cars = new LinkedList<>();

        cars.add(new Car("BMW","black"));
        cars.add(new Car("BMW","red"));
        showroom.setCars(cars);
        showroom.setManager("Иннокентий");
        showroom.setLocation("Русь");


        Session session = com.madhusudhan.jh.domain.SessionFactory.getSession();
        session.beginTransaction();
        session.save(showroom);
        session.getTransaction().commit();


    }
}
