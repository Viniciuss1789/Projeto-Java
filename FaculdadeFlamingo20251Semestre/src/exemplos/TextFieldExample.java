package exemplos;

import javax.swing.*;  
import java.awt.event.*;

public class TextFieldExample implements ActionListener {  
	
    JTextField tf1, tf2, tf3;  
    JButton b1, b2, b3, b4;  

    TextFieldExample() {  
 
        JFrame f = new JFrame();         
        
        tf1 = new JTextField();  
        tf1.setBounds(75, 50, 150, 20);          
        tf2 = new JTextField();  
        tf2.setBounds(75, 100, 150, 20);          
        tf3 = new JTextField();  
        tf3.setBounds(75, 150, 150, 20);  

        tf3.setEditable(false);  
 
        b1 = new JButton("+");  
        b1.setBounds(50, 200, 50, 50);          
        b2 = new JButton("-");  
        b2.setBounds(100, 200, 50, 50);
        b3 = new JButton("*");
        b3.setBounds(150, 200, 50, 50);
        b4 = new JButton("/");
        b4.setBounds(200, 200, 50, 50);
  
        b1.addActionListener(this);  
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
 
        f.add(tf1);  
        f.add(tf2);  
        f.add(tf3);  
        f.add(b1);  
        f.add(b2);
        f.add(b3);
        f.add(b4);
  
        f.setSize(300, 300);  
        f.setLayout(null);  
 
        f.setVisible(true);  
    }  
  
    public void actionPerformed(ActionEvent e) {  
 
        String s1 = tf1.getText();  
        String s2 = tf2.getText();         
 
        int a = Integer.parseInt(s1);  
        int b = Integer.parseInt(s2);          

        int c = 0;          
 
        if (e.getSource() == b1) {  
            c = a + b; 
        } else if (e.getSource() == b2) {  
            c = a - b; 
        } else if (e.getSource() == b3) {  
            c = a * b; 
        } else if (e.getSource() == b4) {  
            c = a / b;
        }         
 
        String result = String.valueOf(c);          
  
        tf3.setText(result);  
    }  
    public static void main(String[] args) {  
 
        new TextFieldExample();  
    }  
}