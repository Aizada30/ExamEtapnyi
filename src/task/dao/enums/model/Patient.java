package task.dao.enums.model;

import task.dao.enums.Gender;

public class Patient {

    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Gender gender;
    private int age;


    public Patient(long id, String firstName, String lastName, String phoneNumber, Gender gender, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n     Patient : " +
                "\n     ID : " + id +
                "\nFIRST NAME : " + firstName +
                "\nLAST NAME : " + lastName +
                "\nPHONE NUMBER : " + phoneNumber +
                "\nGENDER : " + gender +
                "\nAGE : " + age ;
    }
}
