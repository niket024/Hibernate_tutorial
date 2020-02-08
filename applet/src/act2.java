import java.awt.*; 
import java.applet.*; 
import java.awt.event.*; 

/*
<applet code="act2" width=1000 height=600>
</applet>
*/

public class act2 extends Applet implements ActionListener 
{ 
	Button okButton; 
	Button wrongButton; 
	TextField nameField; 
	CheckboxGroup radioGroup; 
	Checkbox radio1; 
	Checkbox radio2; 
	Checkbox radio3; 

	private Image img,img1,img2;
	String msg=" ",f1;
	Double f;
	Button totalamt;
	Label tot,total;;
	Label mname,mno,amt,cname,no,device;
	TextField mnametxt,mnotxt,amttxt,cnametxt,notxt,devicetxt;
	public void init()  
	 { 
		setLayout(new FlowLayout(FlowLayout.CENTER)); 
		okButton = new Button("ORDER NOW"); 
		wrongButton = new Button("CANCEL"); 
		nameField = new TextField(" ORDER CONFIRM, Enjoy our services",35); 
		radioGroup = new CheckboxGroup(); 
		radio1 = new Checkbox("Java App", radioGroup,false); 
		radio2 = new Checkbox("Android App", radioGroup,true); 
		radio3 = new Checkbox("Mac App", radioGroup,false); 

		mno=new Label("Model number : ");
		mname=new Label("Mobile name ");
		cname=new Label("customer Name :- ");
		device=new Label(" Number of Device: ");
		amt=new Label("Amount : ");
		tot=new Label("Total");
		total=new Label();		
		mnametxt=new TextField(10);
		mnotxt=new TextField(8);
		cnametxt=new TextField(10);
		devicetxt=new TextField(6);
		amttxt=new TextField(6);
		totalamt=new Button("amount:");
		add(mno);
		add(mnotxt);
		add(mname);
		add(mnametxt);
		add(cname);
		add(cnametxt);
		add(device);
		add(devicetxt);
		add(amt);
		add(amttxt);	
	
		add(radio1); 
		add(radio2); 
		add(radio3);
		add(totalamt); 
		add(tot);
		add(total);
		totalamt.addActionListener(this);
		add(okButton);
		add(wrongButton);
		add(nameField);
		img=getImage(getDocumentBase(),"j.jpg");
		img1=getImage(getDocumentBase(),"a.jpg");
		img2=getImage(getDocumentBase(),"apple.jpg");
		totalamt.addActionListener(this);
		okButton.addActionListener(this);
		wrongButton.addActionListener(this); 
	} 
	public void paint(Graphics g) 
	{ 
		if (radio1.getState()) 
		{
			g.setColor(Color.red); 
			
			g.drawImage(img,150,200,this);
			g.setFont( new Font( "Serif", Font.BOLD, 28 ) );       
		}
		 else if (radio2.getState()) 
		{
			g.setColor(Color.blue); 
			
			g.drawImage(img1,150,200,this);
			g.setFont( new Font( "Serif", Font.BOLD + Font.ITALIC, 28 ) );
		}
		else
		 {
			g.setColor(Color.green); 
			
			g.drawImage(img2,150,200,this);
			g.setFont( new Font( "Monospaced", Font.ITALIC, 28 ) );
		}
		g.drawString(nameField.getText(),20,100); 
	} 
	public void actionPerformed(ActionEvent evt)  
	{ 
		 String str=evt.getActionCommand();
		f=Double.parseDouble (amttxt.getText());
		f=f*(Integer.parseInt(devicetxt.getText()));
		if(str.equals("T O T A L  A M O U N T :   Rs"))
		{
			total.setText(""+f);
		}
		repaint();
		if (evt.getSource() == okButton) 
		{ 
			nameField.setText("ORDER CONFIRM, Enjoy mobile services ");
			repaint(); 
		}
		 else if (evt.getSource() == wrongButton)  
		{ 
			wrongButton.setLabel("cancel"); 
			nameField.setText("ORDER CANCEL"); 
			repaint(); 
		} 
	}  
} 

              




