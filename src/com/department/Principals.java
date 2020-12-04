package com.department;

import com.department.Staff;

public class Principals extends Staff {

    public Principals(String idColor,boolean hasParkingSpace) {

        super(idColor, hasParkingSpace);
    }
    @Override
    public String getIdColor() {

        return "black";
    }

    @Override
    public boolean punishesStudents() {

        return true;
    }

    @Override
    public String carTypes(String carName) {
        return ("The principal's car type is: "+ super.carTypes(carName));
    }

    @Override
    public  boolean cleans() {

        return super.cleans();
    }
}
