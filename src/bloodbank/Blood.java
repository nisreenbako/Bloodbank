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
public class Blood {

    String bloodtype;

    public void bloodtype() {

        System.out.println("Your Bloodtype is...");
    }
}

class BloodtypeA extends Blood {

    public void bloodtype() {
        super.bloodtype();

        bloodtype = "A-";

        if (bloodtype == "A+") {
            System.out.println("A+");
        } else {
            System.out.println("A-");
        }

    }
}

class BloodtypeB extends Blood {

    public void bloodtype() {
        super.bloodtype();
        bloodtype = "B+";
        if (bloodtype == "B+") {
            System.out.println("B+");
        } else {
            System.out.println("B-");
        }

    }
}

class BloodtypeO extends Blood {

    public void bloodtype() {
        super.bloodtype();

         bloodtype = "o-";
        if (bloodtype == "o+") {
            System.out.println("o+");
        } else {
            System.out.println("o-");
        }

    }
}

class BloodtypeAB extends Blood {

    public void bloodtype() {
        super.bloodtype();

         bloodtype = "AB+";
        if (bloodtype == "AB+") {
            System.out.println("AB+");
        } else {
            System.out.println("AB-");
        }
    }

}

class result {

    public static void main(String[] args) {
        Blood ob = new BloodtypeA();
        ob.bloodtype();

    }
}
