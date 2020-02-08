import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="g" width=700 height=600>
</applet>*/

public class g extends Applet implements ActionListener,ItemListener
{
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	TextField t1,t2,t3,t4,t5,t6,t7;
	Checkbox android,java,mac,wp;
	CheckboxGroup cbg;
	Choice processor,laptop,mobile;
	Button b1,b2;
	String total1;

	public void init()
	{ 
		//super(f);
		setLayout(new GridLayout(13,2));
		setBackground(Color.blue);
		setForeground(Color.black);
		setFont(new Font("TimesNewRomen",Font.BOLD,14));
		l1=new Label("Device Name");
		add(l1);
		t1=new TextField(10);	
		add(t1);
		l2=new Label("Model no ");
		add(l2);
		t2=new TextField(10);
		add(t2);

		mobile=new Choice();
		l3=new Label("MOBILE");
		add(l3);
		mobile.add("--select--");
		mobile.add("NOKIA");
		mobile.add("Samsung");
		mobile.add("Micromax");
		mobile.add("Sony");
		mobile.add("Blackberry");
		add(mobile);
		
		cbg = new CheckboxGroup();
		android = new Checkbox("Android",cbg,true);
		java = new Checkbox("Java",cbg,false);
		mac = new Checkbox("Mac",cbg,false);
		wp= new Checkbox("Windows Phone",cbg,false);
		
		add(android);
		add(java);
		add(mac);
		add(wp);
			
		laptop=new Choice();
		l4=new Label("Laptop  ");
		add(l4);
		laptop.add("--select--");
		laptop.add("Sony");
		laptop.add("HP");
		laptop.add("Samsung");
		laptop.add("Dell");
		laptop.add("Lenovo");
		add(laptop);
		
		processor=new Choice();
		
		l8=new Label("Processor");
		add(l8);
		processor.add("Select");
		processor.add("intel i3");
		processor.add("intel i5");
		processor.add("intel i7");
	
		add(processor);
		processor.addItemListener(this);
		processor.select("Select Processor");

		l6=new Label("DEVICE  ");
		add(l6);
		t5=new TextField(10);
		add(t5);
		
		l7=new Label("AMOUNT  ");
		add(l7);
		t6=new TextField(10);
		add(t6);
		t6.addActionListener(this);
		
		t7=new TextField(10);
		add(t7);

		b1=new Button("SUBMIT");
		b2=new Button("CLEAR");
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	
	}

	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
        	int num1=Integer.parseInt(t5.getText());
        	int num2=Integer.parseInt(t6.getText());
        	int prod=num1*num2;
        	t7.setText(Integer.toString(prod));
		if(str.equals("CLEAR"))
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			

		} 
		if(ae.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
		}

	}
	public void itemStateChanged(ItemEvent ie)
	{

		if (ie.getSource() == processor) 
		{	
			String selection = processor.getSelectedItem();
      			if (selection.equals("intel i3"))
        			t6.setText("40000");
      			else if (selection.equals("intel i5"))
        			t6.setText("55000");
      			else if (selection.equals("intel i7"))
        			t6.setText("70000");
			
                }
	}
	public void paint(Graphics g) 
	{  
		Font font = new Font("Comic Sans MS",Font.BOLD,20);
		g.setColor( new Color(112,56,56) );
    		g.setFont(font);

		setVisible(true);
	}	 

	
}
       










