/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.dashboard.controls;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

/**
 *
 * @author ka5054d
 */
public class PetrolDial extends DialDrawPanel{
    
    private JLabel lblValue; //the label that appears below the dial
    private JLabel lblTitle; // the label which always appears above the dial
  //maybe add panels later and put this on a panel

    public PetrolDial(){
        
       
        setLayout(new BorderLayout(50,50));
        
        // set the style of the border
        setBorder(new BevelBorder(BevelBorder.LOWERED));

        lblTitle = new JLabel();
        lblValue = new JLabel();
        
        lblValue.setHorizontalAlignment(JLabel.CENTER);
       
        add(lblValue, BorderLayout.SOUTH);
        
        
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add(lblTitle, BorderLayout.NORTH);
        
        
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        lblValue.setBorder(border);
        lblTitle.setBorder(border);
        
       
       

        
        
        

    }    
       
   
    public void setLabel(int label) {
         
        lblValue.setText(Integer.toString(label));
    }
     
    public void setLabel(String label) {
         
        lblTitle.setText(label);
    }
    

    
     
    
}
