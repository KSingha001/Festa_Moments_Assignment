package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Insert Student");
            System.out.println("2. Get All Students");
            System.out.println("3. Get Student By ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> insertStudent();
                case 2 -> getAllStudents();
                case 3 -> getStudentById();
                case 4 -> updateStudent();
                case 5 -> deleteStudent();
                case 6 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    // ================= INSERT =================
    public static void insertStudent() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        sc.nextLine(); // clear buffer
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        Student s = new Student(name, email, course);
        session.save(s);

        tx.commit();
        session.close();

        System.out.println("✅ Student added successfully!");
    }

    // ================= SELECT ALL =================
    public static void getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Student> students = session.createQuery("from Student", Student.class).list();

        System.out.println("\n📋 Student List:");
        for (Student s : students) {
            System.out.println(s.getId() + " | " + s.getName() + " | " + s.getCourse());
        }

        session.close();
    }

    // ================= SELECT BY ID =================
    public static void getStudentById() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        Student s = session.get(Student.class, id);

        if (s != null) {
            System.out.println("Student Found:");
            System.out.println(s.getId() + " | " + s.getName() + " | " + s.getCourse());
        } else {
            System.out.println("❌ Student not found!");
        }

        session.close();
    }

    // ================= UPDATE =================
    public static void updateStudent() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        System.out.print("Enter ID to update: ");
        int id = sc.nextInt();

        Student s = session.get(Student.class, id);

        if (s != null) {
            sc.nextLine();

            System.out.print("Enter new name: ");
            s.setName(sc.nextLine());

            System.out.print("Enter new course: ");
            s.setCourse(sc.nextLine());

            session.update(s);

            tx.commit();
            System.out.println("✅ Student updated successfully!");
        } else {
            System.out.println("❌ Student not found!");
        }

        session.close();
    }

    // ================= DELETE =================
    public static void deleteStudent() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        System.out.print("Enter ID to delete: ");
        int id = sc.nextInt();

        Student s = session.get(Student.class, id);

        if (s != null) {
            session.delete(s);
            tx.commit();
            System.out.println("✅ Student deleted successfully!");
        } else {
            System.out.println("❌ Student not found!");
        }

        session.close();
    }
}