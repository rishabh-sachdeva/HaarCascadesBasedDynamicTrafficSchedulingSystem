package javacv2;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
public class DisplayLight extends JFrame
{
	private static final long serialVersionUID = 1L;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JPanel myPanel2;
	
	public DisplayLight()
	{
		setLayout(new BorderLayout());
		myPanel2=new JPanel();
		myPanel2.setBackground(Color.yellow);
		button1= new JButton("LANE 1");
		button2= new JButton("LANE 2");
		button3= new JButton("LANE 2");
		button4= new JButton("LANE 2");
		button5= new JButton("LANE 3");
		button6= new JButton("LANE 3");
		button7= new JButton("LANE 4");
		button8= new JButton("LANE 4");
		
		myPanel2.add(button1);
		myPanel2.add(button2);
		myPanel2.add(button3);
		myPanel2.add(button4);
		myPanel2.add(button5);
		myPanel2.add(button6);
		myPanel2.add(button7);
		myPanel2.add(button8);
		this.add(myPanel2);		
	}
	public void DisplayLight1()
	{
		button1.setBackground(Color.green);
		button2.setBackground(Color.gray);
		button3.setBackground(Color.red);
		button4.setBackground(Color.gray);
		button5.setBackground(Color.red);
		button6.setBackground(Color.gray);
		button7.setBackground(Color.red);
		button8.setBackground(Color.gray);
		
	}
	public void DisplayLight2()
	{
		button1.setBackground(Color.red);
		button2.setBackground(Color.gray);
		button3.setBackground(Color.gray);
		button4.setBackground(Color.green);
		button5.setBackground(Color.red);
		button6.setBackground(Color.gray);
		button7.setBackground(Color.red);
		button8.setBackground(Color.gray);
	}
	public void DisplayLight3()
	{
		button1.setBackground(Color.red);
		button2.setBackground(Color.gray);
		button3.setBackground(Color.red);
		button4.setBackground(Color.gray);
		button5.setBackground(Color.gray);
		button6.setBackground(Color.green);
		button7.setBackground(Color.red);
		button8.setBackground(Color.gray);
	}
	public void DisplayLight4()
	{
		button1.setBackground(Color.red);
		button2.setBackground(Color.gray);
		button3.setBackground(Color.red);
		button4.setBackground(Color.gray);
		button5.setBackground(Color.red);
		button6.setBackground(Color.gray);
		button7.setBackground(Color.gray);
		button8.setBackground(Color.green);
	}
}
