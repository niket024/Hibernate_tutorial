import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="pgm3" width=500 height=500>
</applet>*/

public class pgm3 extends Applet 
{
	String msg="keys ->Welcome to Electronic Device";
	int x=20;	
	int y=100;
	public void init()
	{
		requestFocus();
		setBackground(Color.blue);
		setForeground(Color.yellow);
		addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent k)
			{
				showStatus("md");
				int key=k.getKeyCode();
				switch(key)
				{
					case KeyEvent.VK_UP:
						showStatus("move to up");
						break;
					case KeyEvent.VK_DOWN:
						showStatus("move to DOWN");
						break;
					case KeyEvent.VK_LEFT:
						showStatus("move to LEFT");
						break;
					case KeyEvent.VK_RIGHT:
						showStatus("move to RIGHT");												break;
				}
				repaint();
			}
			public void keyReleased(KeyEvent k)
			{
				showStatus("released");
			}
			public void keyTyped(KeyEvent k)
			{
				msg+=k.getKeyChar();
				repaint();
				showStatus("typing");
			}
		});
	}
	 public void paint(Graphics g)
	   {
		    g.drawString(msg,x,y);

	   }
}

