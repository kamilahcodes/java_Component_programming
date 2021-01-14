/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.dashboard.controls;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author ka5054d
 */
public class PetrolBar extends BarDrawPanel implements SetValueIF{
    private int value;
    
    
    // the bar itself
    private JLabel lblTitle;
    
    public PetrolBar(){
        setPreferredSize(new Dimension(210,40));
        
        setLayout(new BorderLayout());
        // set the style of the border
        setBorder(new BevelBorder(BevelBorder.LOWERED));

        // position the label above the bar 
        lblTitle = new JLabel();
        
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        add(lblTitle, BorderLayout.NORTH);
        
    
      
        
    
    
    
    }

   
    
    public void setLabel(String label) {
        lblTitle.setText(label);
    }
}
    
