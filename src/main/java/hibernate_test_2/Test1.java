package hibernate_test_2;

import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov","Sales",600);
//            Detail detail = new Detail("Moskow","234","olejka@gmail.com");
//            employee.setDetail(detail);
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//            System.out.println("Done!");
            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
