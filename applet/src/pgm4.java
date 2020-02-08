import java.awt.*;
import java.awt.event.*;
class sample extends pgm4 //implements ActionListener
{	
  sample (Frame parent,String title)
  {
   super(parent,title,false);
  setBackground(Color.white);
   setLayout(new FlowLayout());
   setSize(500,500);
 
 addWindowListener(new WindowAdapter()
     {
         public void windowClosing(WindowEvent e)
          {
            dispose();
          }
     });
   
}
public void paint(Graphics g)
{
g.setColor(Color.black);
g.setFont(new Font("Monotype Corsiva",Font.BOLD,26)); 
  g.drawString("Electronic Device",70,70);
  g.drawString("_______________________________________",10,80);
g.setFont(new Font("Monotype Corsiva",Font.BOLD,16)); 
  g.drawString("1.Laptop",10,100);
 g.drawString("2.Mobiles",10,130);
 g.drawString("3.Pc",10,150);
g.drawString("4. OTHER ACCESSERIES",10,190);
}
}
public class lab17 extends Frame implements ActionListener
{                      
  lab17 l;
  Label username,password,l2;
  TextField user,pass,t4;
  String s="",s1="",s2="",s3="";
  Button b;
  lab17()
  {
    super("WELCOME TO Electronic Device");
    setBackground(Color.pink);
    setForeground(Color.yellow);
    setLayout(null);
     l2=new Label(" ");
    l2.setBounds(150,80,99,30);
    setFont(new Font("Sanserif",Font.BOLD|Font.ITALIC,20));
    username=new Label("UserName:");
    username.setBounds(250,140,100,30);
    username.setBackground(Color.lightGray);
    password=new Label("Password:");
    password.setBounds(250,190,100,30);
    password.setBackground(Color.lightGray);
    setForeground(Color.black);
    user=new TextField(20);
    user.setBounds(360,140,100,30);
       pass=new TextField(20);
     pass.setBounds(360,190,100,30);
    pass.setEchoChar('?');
       b=new Button("ok");
    b.setBounds(400,230,60,30);
    add(l2);
    add(username);
    add(user);
    add(password);
    add(pass);
    add(b) ;
     addWindowListener(new WindowAdapter()
     {
         public void windowClosing(WindowEvent e)
          {
            System.exit(0);
          }
     });
    b.addActionListener(this);
   }                
public void actionPerformed(ActionEvent e)
 {
    if(e.getSource()==b)
   {
    s=user.getText();
    s="Welcome  "+s;
  sample d=new sample(l,"electronic Device");
 d.setVisible(true);  
   }
  repaint();
}
public void paint(Graphics g)
{
      g.setColor(Color.lightGray);
    g.fillRect(240,120,290,160); 
    g.setColor(Color.white);
    g.drawString(s,20,50);
    g.drawString(s1,40,100);
    g.drawString(s2,40,120);
    g.drawString(s3,40,140);
}
  public static void main(String args[])
{
 lab17 l=new lab17();
 l.setSize(520,500);
 l.setVisible(true);
} 
}
