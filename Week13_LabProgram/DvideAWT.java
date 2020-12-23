import java.awt.event.*;
import java.awt.*;
class SampleDialog extends Dialog implements ActionListener 
{
	DvideAWT bld;
	SampleDialog(Frame parent, String title) 
	{
		super(parent, title, false); 
		bld=(DvideAWT)parent;
		setLayout(new FlowLayout());
		setSize(500, 300);
		
		Button b;
		add(b = new Button("OK"));
		b.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae) 
	{
		dispose();
	}
	public void paint(Graphics g)
	{
	   Color c = new Color(0,0,0);
	   g.setColor(c);
	   g.drawString(bld.msg, 5, 50);
	}
}

class DvideAWT extends Frame implements ActionListener 
{

    Button b1;
    TextField t1, t2;
    
     String click="",msg="";

    public DvideAWT()
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
		//Color c = new Color(0,0,0);
		//Color redd = new Color(255,0,0);
		
		if(t1.getText().equals("")||t2.getText().equals(""))
		{
			//g.setColor(redd);
			msg = "Fields cannot be empty" ;
			
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
					//g.setColor(c);
					msg = "Result of :"+a+"/"+b+" = "+div;
					
				}				
			}
			catch(NumberFormatException ex1)
			{
				//g.setColor(redd);
				msg = "Enter valid nos";
				
			}
			
			catch(ArithmeticException ex2)
			{
				//g.setColor(redd);
				msg = "Division by zero not possible";
				
			}
			
		}
			SampleDialog d = new SampleDialog(this, "Dialog");
			
			d.setVisible(true);
	}
	   

    public static void main(String args[]) 
    {
        DvideAWT t = new DvideAWT();
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

