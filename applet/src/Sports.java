import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Sports" width=400 height=200>
</applet>
*/
public class Sports extends Applet implements ActionListener,ItemListener
{
	Label l;
	Choice ch;
	List l1,l2;
	Button b;
	Frame frameWindow;
	public void init()
	{
		l=new Label("Type of Cricket");
		ch=new Choice();
		ch.add("Test Match");
		ch.add("One Day Match");
		l1=new List();
		l1.add("Border-gavaskar trophy");
		l1.add("Ashes");
		l2=new List();
		l2.add("Champions trophy");
		l2.add("World Cup");
		b=new Button("Continue");
		add(l);
		add(ch);
		add(l1);
		add(l2);
		add(b);
		l1.addItemListener(this);
		ch.addItemListener(this);
		b.addActionListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	 {
		repaint();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(l1.getSelectedIndex()==0)
		{
			frameWindow=new Frame();
			frameWindow.setSize(500,500);
			frameWindow.setVisible(true);
		}
	}
	public void paint(Graphics g)
	 {
		if(ch.getSelectedItem()== "Test Match")
		 {
			l2.hide();
			l1.show();	
		}
		else 
		{
			l1.hide();
			l2.show();
		}
	}
}
		
	