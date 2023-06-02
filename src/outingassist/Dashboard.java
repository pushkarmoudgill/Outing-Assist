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

public class Dashboard extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
    String username;
    
    Dashboard(String username){
          this.username = username;
      setExtendedState(JFrame.MAXIMIZED_BOTH);
      setLayout(null);
      
      
      JPanel p1 = new JPanel();
      p1.setLayout(null);
      p1.setBounds(0,0,1366,70);
      p1.setBackground(new Color(135,206,235));
      add(p1);
      
      JLabel l3 = new JLabel("Service Platform For You");
      l3.setFont(new Font("TimesRoman",Font.BOLD,25));
      l3.setForeground(Color.YELLOW);
      l3.setBounds(5,10,300,40);
      p1.add(l3);
      
      JPanel p2 = new JPanel();
      p2.setLayout(null);
      p2.setBounds(0,65,250,1100);
      p2.setBackground(new Color(135,206,235));
      add(p2);
      
      b1 = new JButton("Add Personal Details");
      b1.setBackground(new Color(0,114,160));
      b1.setFont(new Font("TimesRoman",Font.BOLD,15));
      b1.setForeground(Color.WHITE);
      b1.setMargin(new Insets(0,0,0,50));
      b1.setBounds(0,0,250,30);
      b1.addActionListener(this);
      p2.add(b1);
      
      b2 = new JButton("Update Personal Details");
      b2.setBackground(new Color(0,114,160));
      b2.setFont(new Font("TimesRoman",Font.BOLD,15));
      b2.setForeground(Color.WHITE);
      b2.setMargin(new Insets(0,0,0,30));
      b2.setBounds(0,50,250,30);
      b2.addActionListener(this);
      p2.add(b2);
      
      b3 = new JButton("View Details");
      b3.setBackground(new Color(0,114,160));
      b3.setFont(new Font("TimesRoman",Font.BOLD,15));
      b3.setForeground(Color.WHITE);
      b3.setMargin(new Insets(0,0,0,130));
      b3.setBounds(0,100,250,30);
      b3.addActionListener(this);
      p2.add(b3);
      
      b4 = new JButton("Delete Personal Details");
      b4.setBackground(new Color(0,114,160));
      b4.setFont(new Font("TimesRoman",Font.BOLD,15));
      b4.setForeground(Color.WHITE);
      b4.setMargin(new Insets(0,0,0,33));
      b4.setBounds(0,150,250,30);
      b4.addActionListener(this);
      p2.add(b4);
      
      b5 = new JButton("Check Package");
      b5.setBackground(new Color(0,114,160));
      b5.setFont(new Font("TimesRoman",Font.BOLD,15));
      b5.setForeground(Color.WHITE);
      b5.setMargin(new Insets(0,0,0,110));
      b5.setBounds(0,200,250,30);
      b5.addActionListener(this);
      p2.add(b5);
      
      b6 = new JButton("Book Package");
      b6.setBackground(new Color(0,114,160));
      b6.setFont(new Font("TimesRoman",Font.BOLD,15));
      b6.setForeground(Color.WHITE);
      b6.setMargin(new Insets(0,0,0,120));
      b6.setBounds(0,250,250,30);
      b6.addActionListener(this);
      p2.add(b6);
      
      b7 = new JButton("View Package");
      b7.setBackground(new Color(0,114,160));
      b7.setFont(new Font("TimesRoman",Font.BOLD,15));
      b7.setForeground(Color.WHITE);
      b7.setMargin(new Insets(0,0,0,120));
      b7.setBounds(0,300,250,30);
      b7.addActionListener(this);
      p2.add(b7);
      
     /* b8 = new JButton("View Hotels");
      b8.setBackground(new Color(0,0,102));
      b8.setFont(new Font("Tahoma",Font.PLAIN,20));
      b8.setForeground(Color.WHITE);
      b8.setMargin(new Insets(0,0,0,130));
      b8.setBounds(0,280,250,30);
      b8.addActionListener(this);
      p2.add(b8);*/
      
      b9 = new JButton("Book Hotel");
      b9.setBackground(new Color(0,114,160));
      b9.setFont(new Font("TimesRoman",Font.BOLD,15));
      b9.setForeground(Color.WHITE);
      b9.setMargin(new Insets(0,0,0,140));
      b9.setBounds(0,350,250,30);
      b9.addActionListener(this);
      p2.add(b9);
      
      b10 = new JButton("View Booked Hotel");
      b10.setBackground(new Color(0,114,160));
      b10.setFont(new Font("TimesRoman",Font.BOLD,15));
      b10.setForeground(Color.WHITE);
      b10.setMargin(new Insets(0,0,0,70));
      b10.setBounds(0,400,250,30);
      b10.addActionListener(this);
      p2.add(b10);
      
     /* b11 = new JButton("Destinations");
      b11.setBackground(new Color(0,0,102));
      b11.setFont(new Font("Tahoma",Font.PLAIN,20));
      b11.setForeground(Color.WHITE);
      b11.setMargin(new Insets(0,0,0,125));
      b11.setBounds(0,400,250,30);
      b11.addActionListener(this);
      p2.add(b11);*/
      
      b12 = new JButton("Payment");
      b12.setBackground(new Color(0,114,160));
      b12.setFont(new Font("TimesRoman",Font.BOLD,15));
      b12.setForeground(Color.WHITE);
      b12.setMargin(new Insets(0,0,0,155));
      b12.setBounds(0,450,250,30);
      b12.addActionListener(this);
      p2.add(b12);
      
      b13 = new JButton("Calculator");
      b13.setBackground(new Color(0,114,160));
      b13.setFont(new Font("TimesRoman",Font.BOLD,15));
      b13.setForeground(Color.WHITE);
      b13.setMargin(new Insets(0,0,0,145));
      b13.setBounds(0,500,250,30);
      b13.addActionListener(this);
      p2.add(b13);
      
      b14 = new JButton("Logout");
      b14.setBackground(new Color(0,114,160));
      b14.setFont(new Font("TimesRoman",Font.BOLD,15));
      b14.setForeground(Color.WHITE);
      b14.setMargin(new Insets(0,0,0,145));
      b14.setBounds(0,550,250,30);
      b14.addActionListener(this);
      p2.add(b14);
      
      
    /* b15 = new JButton("About");
      b15.setBackground(new Color(0,0,102));
      b15.setFont(new Font("Tahoma",Font.PLAIN,20));
      b15.setForeground(Color.WHITE);
      b15.setMargin(new Insets(0,0,0,180));
      b15.setBounds(0,560,250,30);
      b15.addActionListener(this);
      p2.add(b15);*/
      
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("outingassist/icons/home.jpg"));
      Image i2 = i1.getImage().getScaledInstance(1366,768,Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel l1 = new JLabel (i3);
      l1.setBounds(0,0,1366,768);
      add(l1);
        
      JLabel l4 = new JLabel("Outing Assist");
      l4.setBounds(500,70,1000,70);
      l4.setForeground(Color.YELLOW);
      l4.setFont(new Font("TimesRoman",Font.BOLD,65));
      l1.add(l4);
      
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b13){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){}
        }else if(ae.getSource()==b14){
            int a=JOptionPane.showConfirmDialog(null,"Do you really want to Logout","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
        }else if(ae.getSource()==b1){
            new AddCustomer(username).setVisible(true);
        }else if(ae.getSource()==b2){
            new  UpdateCustomer(username).setVisible(true);
        }else if(ae.getSource()==b3){
            new ViewCustomer(username).setVisible(true);
        }else if(ae.getSource()==b5){
            new CheckPackage().setVisible(true);
        }else if(ae.getSource()==b6){
            new BookPackage(username).setVisible(true);
        }else if(ae.getSource()==b7){
            new ViewPackage(username).setVisible(true);
        }else if(ae.getSource()==b11){
            new Destinations().setVisible(true);
        }else if(ae.getSource()==b8){
            new CheckHotels().setVisible(true);
        }else if(ae.getSource()==b9){
            new BookHotel(username).setVisible(true);
        }else if(ae.getSource()==b10){
            new ViewBookedHotel(username).setVisible(true);
        }else if(ae.getSource()==b12){
            new Payment().setVisible(true);
        }else if(ae.getSource()==b15){
            new About().setVisible(true);
        }else if(ae.getSource()==b4){
            new DeleteCustomer(username).setVisible(true);
        }
        
        
    }
    
    public static void main(String[] args){
        new Dashboard("").setVisible(true);
    }
}
