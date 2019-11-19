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
public interface Bloodtype {
    
    public void Give(String donerblood, String receiverblood);
    public void Take(String donerblood, String receiverblood);
    
}
