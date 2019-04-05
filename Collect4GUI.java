/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collect4gui;

import javax.swing.JFrame;

/**
 *
 * @author cansu
 */
public class Collect4GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      GUI obj= new GUI();
      
      obj.setBounds(0,0,500,500);
      obj.setResizable(false);
      obj.setVisible(true);
      obj.setTitle("COLLECT4");
      obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      RegisterFrame reg = new RegisterFrame();
      
      reg.setBounds(0,0,500,500);
      reg.setResizable(false);
      reg.setVisible(false);
      reg.setTitle("COLLECT4");
      reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    
    
}
}