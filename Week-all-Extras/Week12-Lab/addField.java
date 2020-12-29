import java.awt.event.*;
import java.awt.*;

class addField extends Frame implements ActionListener 
{

    Button b1;
    TextField t1, t2;
    
     String click="";

    public addField()
    {
        setLayout(new FlowLayout());
		t1 = new TextField(12);
        add(t1);
        b1 = new Button("/");
        add(b1);
		t2 = new TextField(12);
        add(t2);
		b1.addActionListener(this);
		addWindowListener(new MyWindowAdapter());
	}
    public void actionPerformed(ActionEvent ae) 
    {
		if(ae.getActionCommand().equals("/"))
		{
			click = ae.getActionCommand();
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		int a,b;
		Color c = new Color(0,0,0);
		Color redd = new Color(255,0,0);
		g.setColor(c);
		g.drawString("============",100,50);
		if(t1.getText().equals("")||t2.getText().equals(""))
		{
			g.setColor(redd);
			g.drawString("Fields cannot be empty",100,100);
			g.setColor(c);
			g.drawString("=============",100,150);
		}
		else
		{
			
			
			
			
			try
			{
				a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
				int div = a/b;
				if(click.equals("/"))
				{
					g.setColor(c);
					g.drawString("Result of :"+a+"/"+b+" = "+div,100,100);
					g.drawString("=============",100,150);
				}				
			}
			catch(NumberFormatException ex1)
			{
				g.setColor(redd);
				g.drawString("Enter valid nos",100,100);
				g.setColor(c);
				g.drawString("=============",100,150);
			}
			
			catch(ArithmeticException ex2)
			{
				g.setColor(redd);
				g.drawString("Division of zero not possible, do not enter zero in second field",100,100);
				g.setColor(c);
				g.drawString("=============",100,150);
			}
		}
	}
	   

    public static void main(String args[]) 
    {
        addField t = new addField();
		t.setSize(new Dimension(1000, 1000));
		t.setTitle("DIVISION OF NUMBERS");
		t.setVisible(true);
	}
}
class MyWindowAdapter extends WindowAdapter
{
	 public void windowClosing(WindowEvent we)
	 {
		 System.exit(0);
	 }
}

