import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

/*<applet code="swing1" width=900 height=600>
</applet>*/
public class swing1 extends JApplet implements 
ActionListener
{
	JTextField t1,t2,t3,t4,t5;
	JLabel l1,jl1,jl2,jl3,jl4,jl5;
	JButton jb1,jb2;
	JComboBox jc;
	String total1;
	public void init()
	{
		Container contentPane=getContentPane();
		contentPane.setLayout(null);
		
		
		l1=new JLabel("ELECTRONIC DEVICE DETAILS");
		l1.setBounds(590,120,200,100);
		jl1=new JLabel("Model no");
		jl1.setBounds(450,150,100,100);
		jl2=new JLabel("Device name");
		jl2.setBounds(450,220,100,100);
		jl3=new JLabel("PRICE");
		jl3.setBounds(450,290,100,100);
		jl4=new JLabel("no of device");
		jl4.setBounds(450,360,100,100);
		jl5=new JLabel("TOTAL AMOUNT");
		jl5.setBounds(450,430,100,100);
		t1=new JTextField(15);
		t1.setBounds(630,190,150,30);
		//t2=new JTextField(15);
		jc=new JComboBox();
		jc.addItem("Mobile ");
		jc.addItem("Laptop");
		jc.addItem("PC");
		jc.addItem("Tablet");
		jc.addItem("other Accerries");
		jc.setBounds(630,260,150,30);
		t3=new JTextField(15);
		t3.setBounds(630,330,150,30);
		t4=new JTextField(15);
		t4.setBounds(630,400,150,30);
		t5=new JTextField(15);
		t5.setBounds(630,470,150,30);
		
		ImageIcon f=new ImageIcon("i.jpg");
		
	
		jb2=new JButton(f);
		contentPane.add(l1);
		contentPane.add(jl1);
		contentPane.add(t1);
		contentPane.add(jl2);
		contentPane.add(jc);
		contentPane.add(jl3);
		contentPane.add(t3);
		contentPane.add(jl4);
		contentPane.add(t4);
		contentPane.add(jl5);
		contentPane.add(t5);
		jb2.setText("CLEAR");
		jb2.addActionListener(this);
		jb2.setBounds(600,520,180,40);
		contentPane.add(jb2);
	}
		public void actionPerformed(ActionEvent  ae)
		{



			if(ae.getSource()==jb2)
			{
	                                                     
				//jc.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
			}
			
		}

}	




