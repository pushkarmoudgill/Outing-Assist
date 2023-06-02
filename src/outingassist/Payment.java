/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outingassist;

/**
 *
 * @author acer
*/
 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener{
    JButton b1,b2;
    
    Payment(){
        setBounds(450,110,800,600);
        setLayout(null);
        getContentPane().setBackground(Color.GRAY);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("outingassist/icons/pay1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(539,627, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,800,600);
        add(l1);
      /*  b1 = new JButton("Pay");
        b1.setBounds(420,0,80,40);
        b1.addActionListener(this);
        l1.add(b1);*/
        
        b2 = new JButton("Back");
        b2.setBounds(690,0,80,40);
        b2.addActionListener(this);
        l1.add(b2);
    }
    
    public void actionPerformed(ActionEvent ae){
       /* if(ae.getSource()==b1){
            this.setVisible(false);
            new Paytm().setVisible(true);*/
         if(ae.getSource()==b2){
            this.setVisible(false);
        }}
    
    
    public static void main(String[] args){
        new Payment().setVisible(true);
    }
}

