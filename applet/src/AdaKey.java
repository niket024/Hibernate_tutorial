import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="AdaKey" width=800 height=600>
</applet>
*/

public class AdaKey extends Applet implements ActionListener, ItemListener
{
	String msg=" ";
	Image img;
	TextField t1,t2;
	Choice c1,c2;
	Button b1,b2;
	Label l1,l2,l3,l4;
  	public void init()
	{
		setLayout(null);
		setBackground(Color.blue);
		setForeground(Color.black);
    		setFont(new Font("SansSerif", Font.BOLD, 20));
   		img = getImage(getDocumentBase(),"images.jpg");
		b1 = new Button("Register");
		b2 = new Button("CLEAR");
		l1 = new Label("Model no.  ",Label.LEFT);
		l2 = new Label("Device Name ",Label.LEFT);
		l3 = new Label("Application ",Label.LEFT);
		l4 = new Label("Brand",Label.LEFT);
		t1 = new TextField(40);
		t2= new TextField(40);
		c1= new Choice();
		c1.addItem("Java");
		c1.addItem("Android");
		c1.addItem("Mac");
		c2= new Choice();
		c2.addItem("Sony");
		c2.addItem("HTC");
		c2.addItem("Samsung");
		c2.addItem("Apple");
		b1.setBounds(300,450,100,30);
		b2.setBounds(500,450,100,30);
		l1.setBounds(280,150,200,40);
		l2.setBounds(280,230,200,40);
		l3.setBounds(280,300,200,40);
		l4.setBounds(280,360,200,40);
		t1.setBounds(500,150,200,40);
		t2.setBounds(500,230,200,40);
		c1.setBounds(500,300,200,40);
		c2.setBounds(500,365,200,40);
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(c1);
		add(l4);
		add(c2);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		c1.addItemListener(this);
		c2.addItemListener(this);

		
		t2.addKeyListener(new KeyAdapter()
		{
			public void keyTyped(KeyEvent e) 
        			{ 
            				char c = e.getKeyChar() ;
					if ( (Character.isDigit(c)))
            				{
						e.consume() ;
						showStatus("Invalid Key Pressed");
               	           		}
					else 
						msg = "Name Valid";
					if (c == KeyEvent.VK_ENTER) 
					{
              					showStatus("Registered");
						msg="Registered";	
					}
	
							
        			
			} 
         	});
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("CLEAR"))
		{
			t1.setText(" ");
			t2.setText(" ");
			msg=" ";
		} 
		repaint();
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	public void paint(Graphics g) 
	{  
		Font font = new Font("Times New Roman",Font.BOLD,40);
		g.drawString("ELECTRONIC DEVICE",350,90);
		g.drawString("----------------------------------------------------------------------",170,100);
			
		g.drawImage(img,40,160,this);
		//setFont(new Font("Times New Roman",Font.BOLD,30));
		g.drawString(msg,350,560);
		g.fillRect(0,0,30, 800);
		g.fillRect(0,0,800, 30);
    		g.fillRect(30, 500, 970, 30);
		g.fillRect(770, 30, 30, 800);
    		g.fillRect(30, 580, 970, 30);
		g.setColor( new Color(20,60,10));
	}
}
