import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="tabpane" width=600 height=200>
</applet>
*/

public class tabpane extends JApplet
 {
	public void init()
	 {
		Container cp=getContentPane();
		JTabbedPane jtp = new JTabbedPane();
		jtp.addTab("Mobile", new mobPanel());
		jtp.addTab("Laptop", new lapPanel());
		jtp.addTab("Billing", new billPanel());
		cp.add(jtp);
	}
}
// Make the panels that will be added to the tabbed pane.
class mobPanel extends JPanel
 {
	public mobPanel()
	 {
		final String[] colheads={"class","fare details"};
		final Object[][] data={
			{"Samsung","10000"},
			{"Nokia","20000"},
			{"Blackberry","30000"},
			{"Sony","15000"}
			};
		JTable tb=new JTable(data,colheads);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(tb,v,h);
		add(jsp,BorderLayout.CENTER);
	}
}

class lapPanel extends JPanel
 {
	public lapPanel()
	 {
		final String[] colheads={"class","fare details"};
		final Object[][] data={
			{"HP","35000"},
			{"Sumsung","55000"},
			{"Dell","40000"},
			{"Sony","50000"}
			};
		JTable tb=new JTable(data,colheads);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jspN=new JScrollPane(tb,v,h);
		add(jspN,BorderLayout.CENTER);
	}
}


class billPanel extends JPanel implements ActionListener
 {
	JTextField notxt;
	JLabel l1;
	JCheckBox m,l;
	public billPanel() 
	{
		JLabel pname=new JLabel("customer name");

		JLabel no=new JLabel("no of device ");
		l1=new JLabel("                                                          ");
		JTextField passtxt= new JTextField(15);
		notxt= new JTextField(15);
		m= new JCheckBox("Mobile");
		l=new JCheckBox("Laptop");
		JButton b1=new JButton("ok");
		b1.addActionListener(this);
		add(pname);
		add(passtxt);
		add(no);
		add(notxt);
		add(m);
		add(l);
		add(b1);
		add(l1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("ok"))
		{
			if(l.isSelected())
				l1.setText(notxt.getText()+"mobile device");
			else
				l1.setText(notxt.getText()+"laptop device");

		}
	}
}



