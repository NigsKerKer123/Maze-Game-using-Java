package game.source;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class FireBall implements ActionListener{
	JLabel fireball1;
	JLabel fireball2;
	JLabel fireball3;
	JLabel fireball4;
	JLabel fireball5;
	
	int Xvelocity1 = 1;
	int Xvelocity2 = 1;
	int Xvelocity3 = 1;
	int Xvelocity4 = 1;
	int Xvelocity5 = 1;
	
	int Yvelocity1 = 1;
	int Yvelocity2 = 1;
	int Yvelocity3 = 1;
	int Yvelocity4 = 1;
	int Yvelocity5 = 1;
	
	int fireballX1 = 50;
	int fireballX2 = 200;
	int fireballX3 = 300;
	int fireballX4 = 400;
	int fireballX5 = 500;
	
	int fireballY1 = 0;
	int fireballY2 = 50;
	int fireballY3 = 100;
	int fireballY4 = 200;
	int fireballY5 = 300;
	
	int fireballWidth = 47;
	int fireballHeight = 91;
	
	ImageIcon fireballIcon;
	Timer timer;
	
	public FireBall()
	{
		fireballIcon = new ImageIcon(getClass().getResource("/images/fireball.png"));
		
		fireball1 = new JLabel();
		fireball1.setIcon(fireballIcon);
		
		fireball2 = new JLabel();
		fireball2.setIcon(fireballIcon);
		
		fireball3 = new JLabel();
		fireball3.setIcon(fireballIcon);
		
		fireball4 = new JLabel();
		fireball4.setIcon(fireballIcon);
		
		fireball5 = new JLabel();
		fireball5.setIcon(fireballIcon);
		
		timer = new Timer(15, this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Fireball 1
		if(fireballY1 == 700)
		{
			fireballY1 = -20;
		}
		if(fireballX1 == 300 || fireballX1 == 49)
		{
			Xvelocity1 = Xvelocity1 * -1;
		}
		
		//Fireball 2
		if(fireballY2 == 700)
		{
			fireballY2 = -20;
		}
		
		
		//Fireball 3
		if(fireballY3 == 700)
		{
			fireballY3 = -20;
		}
		if(fireballX3 == 300 || fireballX3 == 100)
		{
			Xvelocity3 = Xvelocity3 * -1;
		}
		
		//Fireball 4
		if(fireballY4 == 700)
		{
			fireballY4 = -20;
		}
		if(fireballX4 == 500 || fireballX4 == 399)
		{
			Xvelocity4 = Xvelocity4 * -1;
		}
		
		
		//Fireball 5
		if(fireballY5 == 700)
		{
			fireballY5 = -20;
		}
		
		if(fireballX5 == 500 || fireballX5 == 100)
		{
			Xvelocity5 = Xvelocity5 * -1;
		}
		
		fireballX1 = fireballX1 + Xvelocity1;
		fireballY1 = fireballY1 + Yvelocity1;
		
		fireballY2 = fireballY2 + Yvelocity2;
		
		fireballX3 = fireballX3 + Xvelocity3;
		fireballY3 = fireballY3 + Yvelocity3;
		
		fireballX4 = fireballX4 + Xvelocity4;
		fireballY4 = fireballY4 + Yvelocity4;
		
		fireballX5 = fireballX5 + Xvelocity5;
		fireballY5 = fireballY5 + Yvelocity5;
		
		fireball1.setBounds(fireballX1, fireballY1, fireballWidth, fireballHeight);
		fireball2.setBounds(fireballX2, fireballY2, fireballWidth, fireballHeight);
		fireball3.setBounds(fireballX3, fireballY3, fireballWidth, fireballHeight);
		fireball4.setBounds(fireballX4, fireballY4, fireballWidth, fireballHeight);
		fireball5.setBounds(fireballX5, fireballY5, fireballWidth, fireballHeight);
	}
}
