/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodbank;

/**
 *
 * @author lolavaziz
 */
public class Member {

    // New Memeber Registration//
    protected String memberName;// Member's Fullname(Person/Organazation/Charity)// 
    protected int age;
    protected String gender;
    protected String bloodtype;
    protected long phoneNumber;
    protected String address;
    protected String email;

    public String getMemberName() {
        return memberName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public void setMemberName(String memberName) {
        if (memberName.equals("")) {
            System.out.println("Please Enter your Name");
        } else {
            this.memberName = memberName;
        }
    }

    public void setAge(int age) {
        if (age < 17 || age > 65) {
            System.out.println("You are not Eligible");
        } else {
            this.age = age;
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
