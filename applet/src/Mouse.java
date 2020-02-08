import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Mouse" width=500 height=500>
</applet>
*/
public class Mouse extends Applet implements MouseListener,MouseMotionListener
{
	int X=0,Y=20;
	String msg="MouseEvents";
public void init()
{
	addMouseListener(this);
	addMouseMotionListener(this);
	setBackground(Color.black);
	setForeground(Color.red);
}
public void mouseEntered(MouseEvent m)
{
	setBackground(Color.magenta);
	showStatus("Mouse Entered");
	repaint();
}
public void mouseExited(MouseEvent m) 
{
	setBackground(Color.black);
	showStatus("Mouse Exited");
	repaint();
}
public void mousePressed(MouseEvent m) 
{
	X=10;
	Y=20;
	msg="NEC";
	setBackground(Color.green);
	repaint();
}
public void mouseReleased(MouseEvent m) 
{
	X=10;
	Y=20;
	msg="Engineering";
	setBackground(Color.blue);
	repaint();
}
public void mouseMoved(MouseEvent m)
{
	X=m.getX();
	Y=m.getY();
	msg="College";
	setBackground(Color.white);
	showStatus("Mouse Moved");
	repaint();
}
public void mouseDragged(MouseEvent m)
{
	msg="Students";
	setBackground(Color.pink);
	showStatus("Mouse Clicked");
	repaint();
}
public void paint(Graphics g)
{
	g.drawString(msg,X,Y);
}
@Override
public void mouseClicked(MouseEvent e)
{
	// TODO Auto-generated method stub
	
}
}