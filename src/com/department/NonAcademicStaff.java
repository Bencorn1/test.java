package com.department;

public class NonAcademicStaff extends Staff {


    public NonAcademicStaff(String idColor, boolean parkingSpace) {

        super(idColor, parkingSpace);
    }

    @Override
    public void setHasParkingSpace(boolean hasParkingSpace) {

        super.setHasParkingSpace(false);
    }

    public NonAcademicStaff(String idColor) {

        this(idColor, false);
    }

    @Override
    public  boolean punishesStudents() {

        return super.punishesStudents();
    }

    @Override
    public String carTypes(String carName) {
        return ("The NonAcademicStaff's car type is: "+ super.carTypes(carName));
    }

    @Override
    public boolean cleans() {

        return true;
    }

}












//    final String idCard = "Yellow";
//    final Boolean hasParkingSpace = false;
//    public String staffName;
//
//    Non_Academic_Staff() {
//        setIdCard();
//        setHasParkingSpace();
//    }
//
//    private void setIdCard() {
//        super.setIdCard(idCard);
//    }
//
//    private Boolean hasParkingSpace() {
//        return false;
//    }
//
//    private void setHasParkingSpace() {
//        super.setHasParkingSpace(hasParkingSpace);
//    }
//
//    public void setStaffName(String staffName) {
//        super.setStaffName(staffName);
//    }
//
//    public String getStaffName() {
//        return staffName;
//    }
//}
