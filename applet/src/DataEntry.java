/* Program 7 */
/* Demonstrate the usage of relevant controls using Grid Layout. */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="DataEntry.class" width=500 height=400>
   </applet> */

public class DataEntry extends Applet implements KeyListener,ActionListener
{
	Panel panel=new Panel();

	Label lblCustId=new Label("Customer ID:");
	Label lblCustName=new Label("Customer Name:");
	Label lblOrderDate=new Label(" Date of Order:");
	Label lblDeliveryDate=new Label("Date of delivery:");
	Label lblTotalPayment=new Label("Total Payment:");
	Label lblAmountPaid=new Label("Amount Paid:");
	Label lblBalance=new Label("Balance:");

	TextField txtCustId=new TextField(10);
	TextField txtCustName=new TextField(10);
	TextField txtOrderDate=new TextField(10);
	TextField txtDeliveryDate=new TextField(10);
	TextField txtTotalPayment=new TextField(10);
	TextField txtAmountPaid=new TextField(10);
	TextField txtBalance=new TextField(10);
	
	//Font f=new Font("Arial",Font.BOLD,34);
	
	String msg;

	public void init()
	{
	
		setBackground(Color.blue);
		panel.setLayout(new GridLayout(7,2));
		panel.add(lblCustId);
		panel.add(txtCustId);
		panel.add(lblCustName);
		panel.add(txtCustName);
		panel.add(lblOrderDate);
		panel.add(txtOrderDate);
		panel.add(lblDeliveryDate);
		panel.add(txtDeliveryDate);
		panel.add(lblTotalPayment);
		panel.add(txtTotalPayment);
		panel.add(lblAmountPaid);
		panel.add(txtAmountPaid);
		panel.add(lblBalance);
		panel.add(txtBalance);
		
		txtCustId.addKeyListener(this);
		txtCustName.addKeyListener(this);
		txtOrderDate.addKeyListener(this);
		txtDeliveryDate.addKeyListener(this);
		txtTotalPayment.addKeyListener(this);
		txtAmountPaid.addKeyListener(this);
		txtBalance.addKeyListener(this);

		add(panel);
		
		//msg="WELCOME TO FLOWER SHOP";
		
		Button button=new Button("Calculate");
		
		add(button);

		button.addActionListener(this);
	
	}
	
	public void keyTyped(KeyEvent e)
	{
	}

	public void keyPressed(KeyEvent e)
	{
		Graphics g=getGraphics();
		TextField text=(TextField)e.getSource();
		String str=text.getText();
		char ch=e.getKeyChar();
		str=str+ch;
	
		repaint();
		
		if(text==txtCustId && ((ch<='Z' && ch>='A') || (ch<='z' && ch>='a')))
		{
			g.drawString("Enter only numeric data in Customer ID field",50,250);
		}
		else
		if(text==txtCustName && (ch<='9' && ch>='0'))
		{
			g.drawString("Enter only alphabetic data in Customer Name field",50,250);
			e.consume();
		}
		else
		if(text==txtTotalPayment)
		{
			if((ch<='Z' && ch>='A') || (ch<='z' && ch>='a'))
			{
				g.drawString("Enter only numeric data in Total Payment field",50,250);
				e.consume();
			}
		}
		else
		if(text==txtAmountPaid)
		{
			if((ch<='Z' && ch>='A') || (ch<='z' && ch>='a'))
			{
				g.drawString("Enter only numeric data in Total Payment field",50,250);
				e.consume();
			}
		}
	}
	
	public void keyReleased(KeyEvent e)
	{
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int TotalPayment = Integer.parseInt(txtTotalPayment.getText());
		int AmountPaid = Integer.parseInt(txtAmountPaid.getText());
		txtBalance.setText((TotalPayment-AmountPaid+""));
	}

}	
	
			