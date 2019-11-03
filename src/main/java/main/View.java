/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



/**
 *
 * @author rhyze
 */
public class View extends JFrame {
    JLabel judul = new JLabel("Penyewaan Motor");
    JLabel login = new JLabel("Login : ");
    JTextField loginA = new JTextField();
    JLabel pass = new JLabel("Password : ");
    JPasswordField passA = new JPasswordField();
    JButton button = new JButton("Masuk");
    
    public View() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(600, 500);
        
        add (judul);
        judul.setBounds(250, 5, 150, 90);
        add (login);
        login.setBounds(100, 100, 90, 20);
        add (loginA);
        loginA.setBounds(200, 100, 90, 20);
        add (pass);
        pass.setBounds(100, 130, 90, 20);
        add (passA);
        passA.setBounds(200, 130, 90, 20);
        add (button);
        button.setBounds(250, 180, 90, 20);
    }
}
