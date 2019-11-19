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
public class Donate implements Bloodtype {

    public void Give(String donerblood, String receiverblood) {
        if (donerblood == "A+") {
            if (receiverblood == "A+" || receiverblood == "AB+") {
                System.out.println("You Can Donate");
            } else {
                System.out.println("You Can't Donate Blood");
            }
        } else if (donerblood == "A-") {
            if (receiverblood == "A-" || receiverblood == "A+" || receiverblood == "AB-" || receiverblood == "AB+") {
                System.out.println("You Can Donate");
            } else {
                System.out.println("You Can't Donate Blood");
            }
        } else if (donerblood == "B+") {
            if (receiverblood == "B+" || receiverblood == "AB+") {
                System.out.println("You Can Donate");
            } else {
                System.out.println("You Can't Donate Blood");
            }

        } else if (donerblood == "B-") {
            if (receiverblood == "B-" || receiverblood == "B+" || receiverblood == "AB-" || receiverblood == "AB+") {
                System.out.println("You Can Donate");
            } else {
                System.out.println("You Can't Donate Blood");
            }
        } else if (donerblood == "O+") {
            if (receiverblood == "O+" || receiverblood == "A+" || receiverblood == "B+" || receiverblood == "AB+") {
                System.out.println("You Can Donate");
            } else {
                System.out.println("You Can't Donate Blood");
            }
        } else if (donerblood == "O-") {
            System.out.println("You Can Donate");// Because O+ accpets all types of blood 

        } else if (donerblood == "AB+") {
            if (receiverblood == "AB+") {
                System.out.println("You Can Donate");// Because AB+ accpets only AB+
            } else {
                System.out.println("You Can't Donate Blood");
            }
        } else if (donerblood == "AB-") {
            if (receiverblood == "AB-" || receiverblood == "AB+") {
                System.out.println("You Can Donate");
            } else {
                System.out.println("You Can't Donate Blood");
            }

        }
    }

    public void Take(String donerblood, String receiverblood) {
        if (donerblood == "A+") {
            if (receiverblood == "A-" || receiverblood == "A+" || receiverblood == "O-" || receiverblood == "O+") {
                System.out.println("You Can Receive Blood");
            } else {
                System.out.println("You Can't Receive Blood");
            }
        } else if (donerblood == "A-") {
            if (receiverblood == "A-" || receiverblood == "O-") {
                System.out.println("You Can Receive Blood");
            } else {
                System.out.println("You Can't Receive Blood");
            }
        } else if (donerblood == "B+") {
            if (receiverblood == "B-" || receiverblood == "B+" || receiverblood == "O-" || receiverblood == "O+") {
                System.out.println("You Can Receive Blood");
            } else {
                System.out.println("You Can't Receive Blood");
            }
        } else if (donerblood == "B-") {
            if (receiverblood == "B-" || receiverblood == "O-") {
                System.out.println("You Can Receive Blood");
            } else {
                System.out.println("You Can't Receive Blood");
            }
        } else if (donerblood == "O+") {
            if (receiverblood == "O+" || receiverblood == "O-") {
                System.out.println("You Can Receive Blood");
            } else {
                System.out.println("You Can't Receive Blood");
            }
        } else if (donerblood == "O-") {
            if (receiverblood == "O-") {
                System.out.println("You Can Receive Blood");// Because O- accpets only O-
            } else {
                System.out.println("You Can't Receive Blood");
            }
        } else if (donerblood == "AB+") {
            System.out.println("You Can Receive Blood");// Because AB+ receive all types of blood

        } else if (donerblood == "AB-") {
            if (receiverblood == "AB-" || receiverblood == "A-" || receiverblood == "B-" || receiverblood == "O-") {
                System.out.println("You Can Receive Blood");
            } else {
                System.out.println("You Can't Receive Blood");
            }
        }

    }
}

class test {

    public static void main(String[] args) {
        Donate ob = new Donate();
        ob.Give("B-", "B+");
        ob.Take("AB-", "O+");

    }
}
