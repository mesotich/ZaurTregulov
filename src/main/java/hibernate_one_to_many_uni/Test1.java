package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            Department department = new Department("HR",300,1500);
//            Employee emp1 = new Employee("Andrey","Smornov",800);
//            Employee emp2 = new Employee("Sergey","Ivanov",850);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.save(department);
//            session.getTransaction().commit();
//            System.out.println("Done!");
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//            session.getTransaction().commit();
//            System.out.println("Done!");
            session = factory.getCurrentSession();
            session.beginTransaction();
            Department department = session.get(Department.class, 2);
            session.delete(department);
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
