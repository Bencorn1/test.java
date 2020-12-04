package com.department;

public class Teacher extends Staff {
    boolean hasChalk;

    public Teacher(String idColor, boolean parkingSpace, boolean hasChalk) {
        super(idColor, parkingSpace);
        this.hasChalk = hasChalk;
    }

    public Teacher(String idColor) {
        this(idColor, false, false);
    }

    @Override
    public boolean getHasParkingSpace() {

        return true;
    }

    @Override
    public boolean punishesStudents() {

        return true;
    }

    @Override
    public String carTypes(String carName) {
        return ("The teacher's car type is: " + super.carTypes(carName));
    }

    @Override
    public boolean cleans() {

        return super.cleans();
    }
}


