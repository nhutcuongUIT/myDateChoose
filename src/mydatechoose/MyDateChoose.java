/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydatechoose;
import java.awt.GridLayout;
import javax.swing.JFrame;
import com.toedter.calendar.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author minhtan
 */
public class MyDateChoose {
    private JFrame fr;
    JTextField txtDate; 
    JDateChooser date; 
    //private JDateChooser date;
    public MyDateChoose(){
        fr= new JFrame("Date choose trong Java");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,400);
        GridLayout fl=new GridLayout(3,1,5,5);
        fr.setLayout(fl);
        date=new JDateChooser(); 
        date.setFont(new Font("tahoma",Font.PLAIN,20));
        date.setBounds(112,24,269,44);
        
        fr.getContentPane().add(date); 
        date.setDateFormatString("yyyy-MM-dd");
        JButton btnGetDate = new JButton("Get Date");
        btnGetDate.setFont(new Font("Tahoma",Font.PLAIN,20));
        btnGetDate.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
                txtDate.setText(df.format(date.getDate()));
            }
            
        });
        fr.getContentPane().add(btnGetDate);
        txtDate = new JTextField();
        txtDate.setFont(new Font("Tahoma", Font.PLAIN,20));
        txtDate.setBounds(112,24,269,44);
        
        fr.getContentPane().add(txtDate);
        
        fr.setLocationRelativeTo(null);//Hien thi giua man hinh 
        fr.setVisible(true);
        
    }
 public static void main(String[] args) {
     new MyDateChoose();
    }
    
}
