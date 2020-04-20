import java.io.FileWriter; 
import java.io.IOException; 
import java.awt.*;  
import java.awt.event.*;
import java.io.IOException;  
public class Resumebuilder extends Frame {  

public static void main(String[] args) throws IOException {  
    Frame f=new Frame("Resume"); 
    Panel Profile=new Panel();
    Panel Qualification = new Panel();
    Panel Projects = new Panel();
    Panel Achievements = new Panel();
    Panel Hobbies = new Panel();
    Font myfont=new Font("TimesRoman",Font.BOLD,17);
    Font myfont1= new Font("",Font.PLAIN,17);
    Button b=new Button("Submit");  
    b.setBounds(30,770,60,30);
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;  
    final TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
    final TextArea ta1,ta6,ta8,ta9;
    l1=new Label("First Name ");  
    l1.setBounds(50,150, 110,30);
    l1.setFont(myfont);
    l1.setForeground(new Color(232,243,249));
    tf1=new TextField();  
    tf1.setBounds(250,150, 150,30);
    tf1.setFont(myfont1);

    l2=new Label("Last Name ");
    l2.setBounds(50,200, 110,30);
    l2.setFont(myfont);
    l2.setForeground(new Color(232,243,249));
    tf2=new TextField();  
    tf2.setBounds(250,200, 150,30);
    tf2.setFont(myfont1);

    l3=new Label("Address");  
    l3.setBounds(50,250, 110,30);
    l3.setFont(myfont);
    l3.setForeground(new Color(232,243,249));
    tf3=new TextField();  
    tf3.setBounds(250,250, 150,30);  
    tf3.setFont(myfont1);
    
    l4=new Label("Contact No. ");  
    l4.setBounds(50,300, 110,30);
    l4.setFont(myfont);
    l4.setForeground(new Color(232,243,249));
    tf4=new TextField();  
    tf4.setBounds(250,300, 150,30);
    tf4.setFont(myfont1);
    
    l5=new Label("E-Mail");
    l5.setBounds(50,350, 110,30);
    l5.setFont(myfont);
    l5.setForeground(new Color(232,243,249));
    tf5=new TextField();  
    tf5.setBounds(250,350, 150,30);
    tf5.setFont(myfont1);
   
    l6=new Label("Qualification");  
    l6.setBounds(500,100, 110,30);
    l6.setFont(myfont);
    l6.setForeground(new Color(232,243,249));
    ta6=new TextArea();  
    ta6.setBounds(500,150, 340,100);  
    ta6.setFont(myfont1);
    
    l7=new Label("Hobbies");  
    l7.setBounds(50,450, 110,30);
    l7.setFont(myfont);
    l7.setForeground(new Color(232,243,249));
    ta1=new TextArea();  
    ta1.setBounds(250,450, 150,270);  
    ta1.setFont(myfont1);
    
    l8=new Label("Projects");  
    l8.setBounds(500,330, 110,30);
    l8.setFont(myfont);
    l8.setForeground(new Color(232,243,249));
    ta8=new TextArea();  
    ta8.setBounds(500,380, 340,100);  
    ta8.setFont(myfont1);
    
    l9=new Label("Achievements");  
    l9.setBounds(500,560, 110,30);
    l9.setFont(myfont);
    l9.setForeground(new Color(232,243,249));
    ta9=new TextArea();  
    ta9.setBounds(500,610, 340,100);  
    ta9.setFont(myfont1);
    
    l10=new Label("PERSONAL PROFILE  ");
    l10.setBounds(50,100, 190,30);
    l10.setFont(myfont);
    l10.setForeground(new Color(79,100,115));
    l10.setBackground(new Color(199, 205, 245));
    
    
    f.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we)
        {
        System.exit(0);
        }
       });

    b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
            String txt1= tf1.getText();
            String txt2= tf2.getText();
            String txt3= tf3.getText();
            String txt4= tf4.getText();
            String txt5= tf5.getText();
            String txt6= ta6.getText();
            String txt7= ta1.getText();
            String txt8= ta8.getText();
            String txt9= ta9.getText();
            String str = "First Name : "+ txt1 + ".\nLast Name : "+ txt2 + ".\nAddress : "+ txt3 + ".\nContact No. : "+ txt4 +".\nE-Mail : "+ txt5 +".\nQualifications : "+ txt6 +".\nHobbies : "+ txt7 +".\nProjects : "+ txt8 +".\nAchievements : "+ txt9 +".\n";
            try {
                FileWriter fw=new FileWriter("Textfile/resume.txt"); 
                for (int i = 0; i < str.length(); i++) 
                {                fw.write(str.charAt(i));
                 System.out.print(str.charAt(i));
                }
                fw.flush();
                fw.close();
                } catch (Exception e1) {
                // e1.printStackTrace();
                System.out.println(e);
                System.out.println(e1);
                  }
                          }});  
    
    f.add(l1); f.add(l2);f.add(l3); f.add(l4); f.add(l5); f.add(l6); f.add(l7); f.add(l8); f.add(l9); f.add(l10);  
    f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4); f.add(tf5); f.add(ta6); f.add(ta1); f.add(ta8); f.add(ta9);
    f.add(b);
    Profile.setBounds(30,80,400,320 );
    Profile.setBackground(new Color(199, 205, 245));
    Qualification.setBounds(470,80,400,200 );
    Qualification.setBackground(new Color(199, 205, 245));
    Projects.setBounds(470,310,400,200 );
    Projects.setBackground(new Color(199, 205, 245));
    Achievements.setBounds(470,540,400,200 );
    Achievements.setBackground(new Color(199, 205, 245));
    Hobbies.setBounds(30,430,400,310 );
    Hobbies.setBackground(new Color(199, 205, 245));
    f.setBackground(new Color(97,122,141));
    f.add(Profile);
    f.add(Qualification);
    f.add(Projects);
    f.add(Achievements);
    f.add(Hobbies);
    f.setSize(920,840);  
    f.setLayout(null);  
    f.setVisible(true);   
}  

}  