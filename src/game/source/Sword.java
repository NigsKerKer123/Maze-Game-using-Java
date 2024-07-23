package game.source;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Sword implements ActionListener{
	JLabel sword1;
	JLabel sword2;
	JLabel sword3;
	int Xvelocity1 = 3;
	int Xvelocity2 = 1;
	int Xvelocity3 = 2;
	int sword1X = 0;
	int sword2X = 200;
	int sword3X = 100;
	ImageIcon swordIcon;
	Timer timer;
	
	public Sword()
	{
		swordIcon = new ImageIcon(getClass().getResource("/images/sword1.png"));
		sword1 = new JLabel();
		sword1.setIcon(swordIcon);
		
		sword2 = new JLabel();
		sword2.setIcon(swordIcon);
		
		sword3 = new JLabel();
		sword3.setIcon(swordIcon);
		
		timer = new Timer(20, this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(sword1X >= 300 || sword1X <= -10)
		{
			Xvelocity1 = Xvelocity1 * -1;
		}
		
		if(sword2X >= 300 || sword2X <= -30)
		{
			Xvelocity2 = Xvelocity2 * -1;
		}
		
		if(sword3X >= 300 || sword3X <= -30)
		{
			Xvelocity3 = Xvelocity3 * -1;
		}
		
		sword1X = sword1X + Xvelocity1;
		sword2X = sword2X + Xvelocity2;
		sword3X = sword3X + Xvelocity3;
		
		sword1.setBounds(sword1X, 160, 280, 50);
		sword2.setBounds(sword2X, 300, 280, 50);
		sword3.setBounds(sword3X, 440, 280, 50);
	}
}
