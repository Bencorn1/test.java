package com.department;

public class Staff {
    private String idColor;
    private boolean hasParkingSpace;


    public Staff(String idColor, boolean parkingSpace) {
        this.idColor = idColor;
        this.hasParkingSpace = parkingSpace;
    }

    public void setIdColor(String idColor) {

        this.idColor = idColor;
    }

    public String getIdColor() {

        return idColor;
    }

    public void setHasParkingSpace(boolean hasParkingSpace) {

        this.hasParkingSpace = hasParkingSpace;
    }

    public boolean getHasParkingSpace() {

        return hasParkingSpace;
    }

    public boolean punishesStudents(){
        System.out.println("Punishes Naughty Students");
        return false;
    }

    public String carTypes(String carName){
        return carName;
    }

    public boolean cleans(){
        System.out.println("Cleans the surroundings");
        return false;
    }
}




















//    private String idCard;
//    protected String staffName;
//    private boolean hasParkingSpace;
//
//
//    public void setIdCard(String idCard) {
//        this.idCard = idCard;
//    }
//    public String getIdCard() {
//        return idCard;
//    }
//    public void setStaffName(String staffName) {
//        this.staffName = staffName;
//    }
//    public String getStaffName() {
//        return staffName;
//    }
//    public void setHasParkingSpace(Boolean parkingSpace) {
//        this.hasParkingSpace = parkingSpace;
//    }
//    public Boolean getHasParkingSpace(){
//        return hasParkingSpace;
//    }




  /*
    The setter for the idCard, staffName, hasParkingSpace was used to change some of the properties of the object while
    their getters were used for returning some of the properties of the objects.

     */

// I am declaring all the properties assigned to the model department staffs.

// Making this the parent class in which all other child class inherits properties from.