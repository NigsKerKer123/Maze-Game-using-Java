package game.source;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Buttons implements ActionListener{
	JButton playBtn;
	JButton instruction;
	
	ImageIcon playIcon;
	ImageIcon instructionIcon;
	
	Levels level;
	Game game;
	Mouse mouse;
	Sword sword;
	Monster monster;
	FireBall fireball;
	Obstacle_Controller obstacle_Controller;
	Defeat_Controller defeat;
	Audio_Controller audio_Controller;
	Win_Controller win;
	Time time;
	
	public Buttons(Game game, Levels level, Sword sword, Monster monster, FireBall fireball, Obstacle_Controller obstacle_Controller, 
			Defeat_Controller defeat, Audio_Controller audio_Controller, Win_Controller win, Time time) throws IOException
	{
		this.game = game;
		this.level = level;
		this.sword = sword;
		this.monster = monster;
		this.fireball = fireball;
		this.obstacle_Controller = obstacle_Controller;
		this.defeat = defeat;
		this.audio_Controller = audio_Controller;
		this.win = win;
		this.time = time;
		
		playIcon = new ImageIcon(getClass().getResource("/images/play_button.png"));
		playBtn = new JButton(playIcon);
		playBtn.setOpaque(false);
		playBtn.setContentAreaFilled(false);
		playBtn.setBorderPainted(false);
		playBtn.setFocusable(false);
		playBtn.setBounds(220, 550, 170, 50);
		playBtn.addActionListener(this);
		
		instructionIcon = new ImageIcon(getClass().getResource("/images/instructionBtn.png"));
		instruction = new JButton(instructionIcon);
		instruction.setOpaque(false);
		instruction.setContentAreaFilled(false);
		instruction.setBorderPainted(false);
		instruction.setFocusable(false);
		instruction.setBounds(150, 480, 320, 50);
		instruction.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		mouse = new Mouse(game, level, sword, monster, fireball, obstacle_Controller, defeat, this, audio_Controller, win, time);
		if(e.getSource() == playBtn)
		{
			System.out.println("push");
			level.currentLevel = level.level1;
			playBtn.setVisible(false);
			instruction.setVisible(false);
			game.repaint();
			
			time.timer.start();
			
			audio_Controller.soundtrackStop();
			audio_Controller.soundtrack1();
		}
		else if(e.getSource() == instruction)
		{
			level.currentLevel = level.instruction;
			playBtn.setVisible(false);
			instruction.setVisible(false);
			game.repaint();
		}
	}
}
