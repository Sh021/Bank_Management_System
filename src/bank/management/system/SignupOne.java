package bank.management.system;



import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    
    Long random;
    JTextField nameTextField,PincodeTextField,StateTextField,cityTextField,addressTextField,emailTextField,FnameTextField;
    JButton next;
    JRadioButton male,female,married,unmarried,other;
    JDateChooser dateChooser;
    
    SignupOne(){
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 1");
        
        Random ran=new Random();
        random=(Math.abs(ran.nextLong()%9000L+1000L));
        
        JLabel formno=new JLabel("APPLICATION FORM NO. " + random );
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails=new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name=new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel Fname=new JLabel("Father's Name: ");
        Fname.setFont(new Font("Raleway",Font.BOLD,20));
        Fname.setBounds(100,190,200,30);
        add(Fname);
        
        FnameTextField = new JTextField();
        FnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        FnameTextField.setBounds(300,190,400,30);
        add(FnameTextField);
        
        JLabel dob=new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,200,30);
        add(dateChooser);
        
        JLabel gender=new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.white);
        add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(450,290,80,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        JLabel email=new JLabel("Email: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel Mstatus=new JLabel("Marital Status: ");
        Mstatus.setFont(new Font("Raleway",Font.BOLD,20));
        Mstatus.setBounds(100,390,200,30);
        add(Mstatus);
        
        married=new JRadioButton("Married");
        married.setBounds(300,390,80,30);
        married.setBackground(Color.white);
        add(married);
        
        unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        other=new JRadioButton("Other");
        other.setBounds(600,390,80,30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup Mstatusgroup=new ButtonGroup();
        Mstatusgroup.add(married);
        Mstatusgroup.add(unmarried);
        Mstatusgroup.add(other);
        
        JLabel address=new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city=new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel State=new JLabel("State: ");
        State.setFont(new Font("Raleway",Font.BOLD,20));
        State.setBounds(100,540,200,30);
        add(State);
        
        StateTextField = new JTextField();
        StateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        StateTextField.setBounds(300,540,400,30);
        add(StateTextField);
        
        JLabel Pincode=new JLabel("Pincode: ");
        Pincode.setFont(new Font("Raleway",Font.BOLD,20));
        Pincode.setBounds(100,590,200,30);
        add(Pincode);
        
        PincodeTextField = new JTextField();
        PincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
        PincodeTextField.setBounds(300,590,400,30);
        add(PincodeTextField);
        
        next=new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(630, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno=""+random;
        String name=nameTextField.getText();
        String fname=FnameTextField.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender="";
        if(male.isSelected()){
            gender="Male";
        }else if(female.isSelected()){
            gender="Female";
        }
        String email=emailTextField.getText();
        String marital="";
        if(married.isSelected()){
            marital="Married";
        }else if(unmarried.isSelected()){
            marital="Unmarried";
        }else if(other.isSelected()){
            marital="Other";
        }
        String address=addressTextField.getText();
        String city=cityTextField.getText();
        String state=StateTextField.getText();
        String pin=PincodeTextField.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else{
                Conn c=new Conn();
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                c.s.executeUpdate(query);
                
                 setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
           
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String args[]) {
     
        new SignupOne();
        
    }
}
