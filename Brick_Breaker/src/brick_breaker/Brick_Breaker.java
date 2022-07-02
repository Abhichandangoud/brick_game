/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package brick_breaker;

import javax.swing.JFrame;

/**
 *
 * @author C ABHICHANDAN GOUD
 */
public class Brick_Breaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        JFrame obj=new JFrame();
        GamePlay gameplay=new GamePlay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Block Breaker");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);
    }
    
}
