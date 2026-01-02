package com.telusko;


import jakarta.persistence.*;

@Entity            // This annotation is required for informing hibernate that this is the class's data that we need to have in database
@Table(name="chessGrandmasters") //This field names the table name to be chessGrandMasters
public class Student {


    @Id  // Making one field to primary key is required.
    private int rollNo;
    @Column(name="grandmasters_name")
    private String sName;
    private int sage;


    @OneToOne
    private Laptop laptop;

    @Transient //if we want a data to be used only in our code and not in database
    //we can use transient , this does not generate a column for this field
    private int rating;


    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }



    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }


}
