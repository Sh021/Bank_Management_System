package bank.management.system;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    
    JTextField panTextField,aadharTextField;
    JButton submit,cancel;
    JRadioButton saving,fixed,current,recurring;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JComboBox religionbox,categorybox,incomebox,qualibox,occupationbox;
    String formno;
    
    SignupThree(String formno){
        this.formno=formno;
        setLayout(null);
        
        setTitle("ACCOUNT DETAILS FORM - PAGE 3");
        
        JLabel accountDetails=new JLabel("Page 3: Account Details");
        accountDetails.setFont(new Font("Raleway",Font.BOLD,22));
        accountDetails.setBounds(290,40,400,30);
        add(accountDetails);
        
        JLabel account=new JLabel("Account Type ");
        account.setFont(new Font("Raleway",Font.BOLD,22));
        account.setBounds(100,100,200,30);
        add(account);
        
        saving=new JRadioButton("Saving Account");
        saving.setFont(new Font("Raleway",Font.BOLD,16));
        saving.setBounds(100,140,200,30);
        saving.setBackground(Color.white);
        add(saving);
        
        fixed=new JRadioButton("Fixed Deposit Account");
        fixed.setFont(new Font("Raleway",Font.BOLD,16));
        fixed.setBounds(400,140,200,30);
        fixed.setBackground(Color.white);
        add(fixed);
        
        current=new JRadioButton("Current Account");
        current.setFont(new Font("Raleway",Font.BOLD,16));
        current.setBounds(100,170,200,30);
        current.setBackground(Color.white);
        add(current);
        
        recurring=new JRadioButton("Recurring Deposite Account");
        recurring.setFont(new Font("Raleway",Font.BOLD,16));
        recurring.setBounds(400,170,300,30);
        recurring.setBackground(Color.white);
        add(recurring);
        
        ButtonGroup accountgroup=new ButtonGroup();
        accountgroup.add(saving);
        accountgroup.add(fixed);
        accountgroup.add(current);
        accountgroup.add(recurring);
        
        JLabel card=new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,230,200,30);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-XXXX");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(300,230,300,30);
        add(number);
        
        JLabel msg=new JLabel("Your 16 Digit Card Number");
        //msg.setFont(new Font("Raleway",Font.BOLD,16));
        msg.setBounds(100,250,300,30);
        add(msg);
       
        JLabel pin=new JLabel("PIN: ");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,290,200,30);
        add(pin);
        
        JLabel msg2=new JLabel("Your 4 Digit Password");
        //msg2.setFont(new Font("Raleway",Font.BOLD,16));
        msg2.setBounds(100,310,300,30);
        add(msg2);
        
        JLabel code=new JLabel("XXXX");
        code.setFont(new Font("Raleway",Font.BOLD,22));
        code.setBounds(300,290,200,30);
        add(code);
        
        JLabel service=new JLabel("Service Required: ");
        service.setFont(new Font("Raleway",Font.BOLD,22));
        service.setBounds(100,365,200,30);
        add(service);
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway",Font.BOLD,15));
        c1.setBounds(100,410,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway",Font.BOLD,15));
        c2.setBounds(350,410,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway",Font.BOLD,15));
        c3.setBounds(100,440,200,30);
        add(c3);
        
        c4=new JCheckBox("Email & SMS Alert");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway",Font.BOLD,15));
        c4.setBounds(350,440,200,30);
        add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway",Font.BOLD,15));
        c5.setBounds(100,470,200,30);
        add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway",Font.BOLD,15));
        c6.setBounds(350,470,200,30);
        add(c6);
        
        c7=new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge.");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,600,600,30);
        add(c7);
        
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(100, 650, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        submit=new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(630, 650, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String acounttype="";
        if(saving.isSelected()){
            acounttype="Saving Account";
        }else if(fixed.isSelected()){
            acounttype="Fixed Account";
        }else if(current.isSelected()){
            acounttype="Current Account";
        }else if(recurring.isSelected()){
            acounttype="Recurring Deposit Account";
        }
        Random random=new Random();
        String cardnumber=""+Math.abs((random.nextLong()%90000000L)+5040936000000000L);
        
        String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
        
        String facility="";
        if(c1.isSelected()){
            facility=facility+" ATM CARD";
        }else if(c2.isSelected()){
            facility=facility+" Internet Banking";
        }else if(c3.isSelected()){
            facility=facility+" Mobile Banking";
        }else if(c4.isSelected()){
            facility=facility+" Email & SMS Alert";
        }else if(c5.isSelected()){
            facility=facility+" Cheque Book";
        }else if(c6.isSelected()){
            facility=facility+" E-Statement";
        }
        
        try{
            if(acounttype.equals("")){
                JOptionPane.showMessageDialog(null, "Account Type is Required");
            }else{
                Conn c=new Conn();
                String query="insert into signupthree values('"+formno+"','"+acounttype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                String query1="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                c.s.executeUpdate(query);
                c.s.executeUpdate(query1);
                
                JOptionPane.showMessageDialog(null, "Card Number: "+cardnumber+"\nPin Number: "+pinnumber);
            }
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String args[]) {
     
        new SignupThree("");
        
    }
}
