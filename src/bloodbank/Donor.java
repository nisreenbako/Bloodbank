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
public class Donor extends Member {

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight <= 50) {
            System.out.println("You are not Eligible");
        } else {
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Donor ob3 = new Donor();
        ob3.setWeight(54);
        System.out.println("Weight: " + ob3.getWeight());

    }
}
