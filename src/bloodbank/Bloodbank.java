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
public class Bloodbank {

    public static void main(String[] args) {
        NewMember ob = new NewMember(); 
        ob.setUsername("Lolav-00");
        ob.setPassword("Password");
        
        
       Member ob1=new Member();
        ob1.setMemberName("Lolav Abdulaziz Jabar");
        ob1.setAge(18);
        ob1.setBloodtype("B+");
        ob1.setGender("Female");
        ob1.setPhoneNumber(3103067);
        ob1.setAddress("221B Baker Street");
        ob1.setEmail("lolav.313187006@uhd.edu.iq");
      

        System.err.println("   Become A Donor,Seller,or a Buyer!");
        System.out.println("");
        System.out.println("Username: "+ob.getUsername());
        System.out.println("Password: " + ob.getPassword());
        System.out.println("Member's Fullname: " + ob1.getMemberName());
        System.out.println("Age: " + ob1.getAge());
        System.out.println("Bloodtype: " + ob1.getBloodtype());
        System.out.println("Gender: " + ob1.getGender());
        System.out.println("Phone Number: " + ob1.getPhoneNumber());
        System.out.println("Address: " + ob1.getAddress());
        System.out.println("Email: " + ob1.getEmail());
        
        System.out.println("");
        System.out.println("      Welcome to RedBlood !");

        
////        
    }

}
