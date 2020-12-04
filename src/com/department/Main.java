package com.department;

import java.security.Principal;

public class Main {
    public static void main(String[] args) {
        Staff tola = new Staff("blue", true);

        /**
         *
         */
        Engine engine = new Engine();

        Car car1 = new Car(engine);

        tola.setIdColor("green");
        tola.setHasParkingSpace(true);
        String idColor = tola.getIdColor();
        boolean hasParkingSpace = tola.getHasParkingSpace();
        System.out.println(idColor);
        System.out.println(hasParkingSpace);


        Principals principal = new Principals("orange", true);
        principal.setIdColor("brown");
        System.out.println(principal.getIdColor());

        Teacher teacher = new Teacher("Pink");
        Teacher teacher1 = new Teacher("White",true,true);
        teacher.setIdColor("pink");
        System.out.println(teacher.getIdColor());
        System.out.println(teacher.getHasParkingSpace());

        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff("red", false);
        nonAcademicStaff.setIdColor("red");
        System.out.println(nonAcademicStaff.getIdColor());
        System.out.println(nonAcademicStaff.getHasParkingSpace());

        System.out.println(principal.punishesStudents());

        System.out.println(nonAcademicStaff.punishesStudents());

        System.out.println(teacher.punishesStudents());

        System.out.println(principal.carTypes("Volvo"));

        System.out.println(teacher.carTypes("Toyota"));

        System.out.println(nonAcademicStaff.carTypes("Honda"));

        System.out.println(principal.cleans());

        System.out.println(nonAcademicStaff.cleans());

        System.out.println(teacher.cleans());



    }
}

















////    public static void main(String[] args) {
////     Principal principal = new Principal();
////     System.out.println(principal.getIdCard());
////     System.out.println(principal.getHasParkingSpace());
////     System.out.println(principal.getStaffName());
////    }
//
////    public static void main(String[] args) {
////        Teachers teachers = new Teachers();
////        System.out.println(teachers.getIdCard());
////        System.out.println(teachers.getHasParkingSpace());
////        System.out.println(teachers.getStaffName());
////     }
//
//    public static void main(String[] args) {
//        Non_Academic_Staff non_academic_staff = new Non_Academic_Staff();
//        System.out.println(non_academic_staff.getIdCard());
//        System.out.println(non_academic_staff.getHasParkingSpace());
//        System.out.println(non.getStaffName());
//    }

