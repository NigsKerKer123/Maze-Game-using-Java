package game.source;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Monster implements ActionListener{
	JLabel monster;
	int Xvelocity = 1;
	int Yvelocity = 1;
	int monsterX = 300;
	int monsterY = 300;
	ImageIcon monsterIcon;
	Timer timer;
	
	public Monster()
	{
		monsterIcon = new ImageIcon(getClass().getResource("/images/monster.png"));
		monster = new JLabel();
		monster.setIcon(monsterIcon);
		
		timer = new Timer(10, this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(monsterX >= 500 || monsterX < 0)
		{
			Xvelocity = Xvelocity * -1;
		}
		if(monsterY >= 600 || monsterY < -10)
		{
			Yvelocity = Yvelocity * -1;
		}
		
		monsterX = monsterX + Xvelocity;
		monsterY = monsterY + Yvelocity;
		
		monster.setBounds(monsterX, monsterY, 112, 100);
	}
}
