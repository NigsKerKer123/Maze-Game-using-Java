package game.source;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.Timer;

public class Time implements ActionListener{
	Timer timer;
	int time = 0;
	JLabel timelabel;
	Font font;
	
	public Time()
	{
		font = new Font("Arial", Font.BOLD, 100);
		timelabel = new JLabel();
		timelabel.setFont(font);
		timelabel.setHorizontalAlignment(JLabel.CENTER);
		timelabel.setBounds(0, 350, 600, 100);

		
		timer = new Timer(1000,this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		time++;
		System.out.println(time);
		timelabel.setText(""+time);
	}
	
	public int reset()
	{
		time = 0;
		return time;
	}
}
