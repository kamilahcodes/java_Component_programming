/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.gre.comp1549.dashboard;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ka5054d
 */
public class WelcomeDashboard extends JFrame {
      // private DashboardDemoMain me = new DashboardDemoMain();
    public WelcomeDashboard(){
    setTitle("Welcome Dashboard");
    setLayout(new FlowLayout());
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        JPanel panel = new JPanel();
        JButton btnWelcome = new JButton("Welcome");
        panel.add(btnWelcome);
        
        
        
        
        btnWelcome.addActionListener(new ActionListener() {//

            @Override
            public void actionPerformed(ActionEvent e) {
                DashboardDemoMain.getInstance().setVisible(true);
                
              
            }
        });
        
        
        
        
        add(panel);
        pack();
        setLocationRelativeTo(null); // display in centre of screen
        this.setVisible(true);
    
    }
    
}
