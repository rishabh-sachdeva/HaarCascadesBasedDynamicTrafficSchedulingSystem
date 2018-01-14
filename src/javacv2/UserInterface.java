package javacv2;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ActionListener;
@SuppressWarnings("serial")
public class UserInterface extends JFrame implements ActionListener
{
	JPanel myPanel;
	JButton myButton;
	JLabel myLabel;
	UserInterface()
	{
		myPanel=new JPanel();
		myPanel.setBackground(Color.cyan);
		ImageIcon image = new ImageIcon ("sgsitslogo.jpg");
		JLabel label = new JLabel (image); // add the image to the label
		myPanel.add(label); //add the label to the frame
		myButton= new JButton("CLICK HERE TO SWITCH ON THE CAMERA AND START THE SYSTEM");
		JLabel lbl1 = new JLabel("COMPUTER ENGINEERING DEPARTMENT,SGSITS,INDORE");
		JLabel lbl2 = new JLabel("DEVELOPED BY: RISHABH SACHDEVA");
		JLabel lbl3 = new JLabel("GUIDED BY: Prof. K.P.SINGH");
		myButton.setBackground(Color.WHITE);
		myPanel.add(lbl1);
		myPanel.add(lbl2);
		myPanel.add(lbl3);
		lbl2.setForeground(Color.black);
		lbl2.setFont(new Font("Courier New", Font.ITALIC, 11));
		lbl3.setFont(new Font("Courier New", Font.ITALIC, 11));
		myButton.addActionListener(this);
		myLabel = new JLabel();
		myPanel.add(myLabel);
		this.add(myPanel);	
		myPanel.add(myButton);

		this.add(myPanel);	

	}
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource().equals(myButton))
		{
			myLabel.setText("SYSTEM IS LOADING");
			try {
				javacv2.ClickandCall();
			} catch (Exception e) {
				System.out.println("ClickandCall not responding");
			}
		}
	}
	public static void main(String args[])
	{
		UserInterface first = new UserInterface();
		first.setTitle("DTMS USING HAAR CASCADES");
		first.setSize(450,1000);
		first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		first.setVisible(true);
		//lightup();
	}

}
