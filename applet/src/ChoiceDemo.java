import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class TGSales extends Frame implements ActionListener, ItemListener
{
	String msg,msg1;
	Checkbox a,d,le,c,ap,w;
	CheckboxGroup cbg;
	Button b1,b2;
	TextArea textArea;
	int c1,c2,c3,c4,c5,c6;
	public TGSales()
	{
		super("Laptop Sales");
		setLayout(null);
		setSize(600,570);
		setVisible(true);

		setBackground(Color.blue);
		cbg=new CheckboxGroup();
		a=new Checkbox("Acer",cbg,false);
		c=new Checkbox("Compact",cbg,false);
		ap=new Checkbox("Apple",cbg,false);
		le=new Checkbox("Lenovo",cbg,false);
		d=new Checkbox("Dell",cbg,false);
		w=new Checkbox("Vaio",cbg,false);
		textArea = new TextArea("Comments please...");
		b1=new Button("Submit");
		b2=new Button("Exit");
		b1.setBounds(240,290,100,30);
		b2.setBounds(370,290,100,30);
		a.setBounds(50,140,100,40);
		ap.setBounds(50,180,100,40);
		c.setBounds(50,220,100,40);
		d.setBounds(50,260,100,40);
		w.setBounds(50,300,100,40);
		le.setBounds(50,340,100,40);
		textArea.setBounds(210,130,300,130);
	
		add(a);
		add(ap);
		add(c);
		add(le);	
		add(d);
		add(w);
		add(textArea);
		add(b1);
		add(b2);

		a.addItemListener(this);
		c.addItemListener(this);
		ap.addItemListener(this);
		le.addItemListener(this);
		d.addItemListener(this);
		w.addItemListener(this);
	
		b1.addActionListener(this);
		b2.addActionListener(this);


		MyWindowAdapter m= new MyWindowAdapter(this);
		addWindowListener(m);
	}
		
	class MyWindowAdapter extends WindowAdapter
	 {
		TGSales sales;
		public MyWindowAdapter(TGSales sales)
		 {
			this.sales = sales;
		}
		public void windowClosing(WindowEvent we) 
		{
			sales.setVisible(false);
		        System.exit(0);
		}

	}

	public void itemStateChanged(ItemEvent ie)
	{
		String s;
		s=cbg.getSelectedCheckbox().getLabel();
		if(s.equals("Acer"))
		{	c1=c1+1;
			msg="Acer";
		}
		else if(s.equals("Compact"))
		{	c3=c3+1;
			msg="Compact";
		}
		else if(s.equals("Apple"))
		{	c2=c2+1;
			msg="Apple";
		}
		else if(s.equals("Lenovo"))
		{	c4=c4+1;
			msg="Lenovo";
		}
		else if(s.equals("Dell"))
		{	c5=c5+1;
			msg="Dell";
		}
		else if(s.equals("Vaio"))
		{	c6=c6+1;
			msg="Vaio";
		}
		else 
			msg="Nothing";
		repaint();
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s;
		s= ae.getActionCommand();
		if(s.equals("Submit"))
			msg1="Thank You For Voting!";
		else if(s.equals("Exit"))
			dispose();
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Acer-"+c1,230,440);
		g.drawString("Apple-"+c2,230,460);
		g.drawString("Compact-"+c3,230,480);
		g.drawString("Lenovo-"+c4,230,500);
		g.drawString("Dell-"+c5,230,520);
		g.drawString("Vaio-"+c6,230,540);
		g.setFont(new Font("Times New Roman",Font.BOLD,28));
		g.drawString("You Chose-"+msg,200,370);
		g.drawString("Votes...",230,410);
		g.drawLine(160,140,160,370);
		g.drawLine(165,140,165,370);
		g.drawString("ELECTRONIC DEVICE",240,60);
		g.drawString(msg1,280,550);

	}
}
public class ChoiceDemo{
	public static void main(String args[])
	{
		TGSales ch=new TGSales();
	}
}