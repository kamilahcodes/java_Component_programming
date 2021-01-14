/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author ka5054d
 */
public class DateView extends JPanel {
    private JLabel datelbl;
    
    
    
    
    public DateView(){
        setLayout(new BorderLayout());
        
        // set the style of the border
        setBorder(new BevelBorder(BevelBorder.LOWERED));

        
        
        
        
        datelbl = new JLabel();
        datelbl.setHorizontalAlignment(JLabel.CENTER);
        add(datelbl, BorderLayout.NORTH);
    
    
    
    }
    public void printDate(String date){
        
        datelbl.setText(date);
      
    }
}