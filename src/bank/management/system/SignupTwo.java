package bank.management.system;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton syes,sno,eno,eyes;
    JComboBox religionbox,categorybox,incomebox,qualibox,occupationbox;
    String formno;
    
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails=new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel religion=new JLabel("Religion: ");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        religionbox = new JComboBox(valReligion);
        religionbox.setBackground(Color.white);
        religionbox.setBounds(300,140,400,30);
        add(religionbox);
        
        JLabel category=new JLabel("Category: ");
        category.setFont(new Font("Raleway",Font.BOLD,20));
        category.setBounds(100,190,200,30);
        add(category);
        
        String valCategory[]={"General","OBC","SC","ST","Other"};
        categorybox = new JComboBox(valCategory);
        categorybox.setBackground(Color.white);
        categorybox.setBounds(300,190,400,30);
        add(categorybox);
        
        JLabel income=new JLabel("Income: ");
        income.setFont(new Font("Raleway",Font.BOLD,20));
        income.setBounds(100,240,200,30);
        add(income);
        
        String valIncome[]={"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        incomebox = new JComboBox(valIncome);
        incomebox.setBackground(Color.white);
        incomebox.setBounds(300,240,400,30);
        add(incomebox);
        
        JLabel educational=new JLabel("Educational ");
        educational.setFont(new Font("Raleway",Font.BOLD,20));
        educational.setBounds(100,290,200,30);
        add(educational);
        
        JLabel qualification=new JLabel("Qualification: ");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String valquali[]={"Non-Graduate","Graduate","Post Graduation","Doctrate","Other"};
        qualibox = new JComboBox(valquali);
        qualibox.setBackground(Color.white);
        qualibox.setBounds(300,315,400,30);
        add(qualibox);
        
        JLabel occupation=new JLabel("Occupation: ");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,365,200,30);
        add(occupation);
        
        String valoccupation[]={"Salaried","Self Employed","Bussiness","Student","Retired","Other"};
        occupationbox = new JComboBox(valoccupation);
        occupationbox.setBackground(Color.white);
        occupationbox.setBounds(300,365,400,30);
        add(occupationbox);
        
        JLabel pan=new JLabel("Pan Number: ");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,415,200,30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,415,400,30);
        add(panTextField);
        
        JLabel aadhar=new JLabel("Aadhar Number: ");
        aadhar.setFont(new Font("Raleway",Font.BOLD,20));
        aadhar.setBounds(100,465,200,30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,465,400,30);
        add(aadharTextField);
        
        JLabel senior=new JLabel("Senior Citizen: ");
        senior.setFont(new Font("Raleway",Font.BOLD,20));
        senior.setBounds(100,515,200,30);
        add(senior);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300,515,100,30);
        syes.setBackground(Color.white);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setBounds(450,515,100,30);
        sno.setBackground(Color.white);
        add(sno);
        
        ButtonGroup seniorgroup=new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
        
        JLabel existing=new JLabel("Existing Account: ");
        existing.setFont(new Font("Raleway",Font.BOLD,20));
        existing.setBounds(100,565,200,30);
        add(existing);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,565,100,30);
        eyes.setBackground(Color.white);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setBounds(450,565,100,30);
        eno.setBackground(Color.white);
        add(eno);
        
        ButtonGroup existinggroup=new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);
        
        
        next=new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(630, 625, 80, 30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String religion=(String)religionbox.getSelectedItem();
        String category=(String)categorybox.getSelectedItem();
        String income=(String)incomebox.getSelectedItem();
        String quali=(String)qualibox.getSelectedItem();
        String occupation=(String)occupationbox.getSelectedItem();
        String span=panTextField.getText();
        String saadhar=aadharTextField.getText();
        
        String senior="";
        if(syes.isSelected()){
            senior="Yes";
        }else if(sno.isSelected()){
            senior="No";
        }
        
        String exiting="";
        if(eyes.isSelected()){
            exiting="Yes";
        }else if(eno.isSelected()){
            exiting="No";
        }
        
        
        try{
            if(span.equals("")){
                JOptionPane.showMessageDialog(null, "Pan is Required");
            }else{
                Conn c=new Conn();
                String query="insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+quali+"','"+occupation+"','"+span+"','"+saadhar+"','"+senior+"','"+exiting+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String args[]) {
     
        new SignupTwo("");
        
    }
}
