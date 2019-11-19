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
public class Buyer extends Member {

    private int packetNumber;

    public int getPacketNumber() {
        return packetNumber;
    }

    public void setPacketNumber(int packetNumber) {
        this.packetNumber = packetNumber;
    }

    public static void main(String[] args) {
        Buyer ob5 = new Buyer();

        ob5.setPacketNumber(10);

        System.out.println("Packet Number: " + ob5.getPacketNumber());

    }
}
