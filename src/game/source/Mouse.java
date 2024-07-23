package game.source;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class Mouse implements MouseMotionListener, MouseListener{
	
	Levels level;
	Game game;
	Sword sword;
	Monster monster;
	FireBall fireball;
	Obstacle_Controller obstacle_Controller;
	Defeat_Controller defeat;
	Buttons buttons;
	Audio_Controller audio_Controller;
	Win_Controller win;
	Time time;
	
	int color;
	
	public Mouse(Game game, Levels level, Sword sword, Monster monster, FireBall fireball, 
			Obstacle_Controller obstacle_Controller, Defeat_Controller defeat, Buttons buttons, 
			Audio_Controller audio_Controller, Win_Controller win, Time time) {
		
		this.game = game;
		this.level = level;
		this.sword = sword;
		this.monster = monster;
		this.fireball = fireball;
		this.obstacle_Controller = obstacle_Controller;
		this.defeat = defeat;
		this.buttons = buttons;
		this.audio_Controller = audio_Controller;
		this.win = win;
		this.time = time;
		
		this.game.addMouseMotionListener(this);
		this.game.addMouseListener(this);
		
		this.sword.sword1.addMouseMotionListener(this);
		this.sword.sword2.addMouseMotionListener(this);
		this.sword.sword3.addMouseMotionListener(this);
		
		this.monster.monster.addMouseMotionListener(this);
		
		this.fireball.fireball1.addMouseMotionListener(this);
		this.fireball.fireball2.addMouseMotionListener(this);
		this.fireball.fireball3.addMouseMotionListener(this);
		this.fireball.fireball4.addMouseMotionListener(this);
		this.fireball.fireball5.addMouseMotionListener(this);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		//To get the position X and Y of the cursor and store in the varable
		int x = e.getX();
		int y = e.getY();
				
		//To get the RGB pixels in the image
		color = level.currentLevel.getRGB(x, y);
				
		//Guide to get the color in the images and display in the console
		System.out.println(color);
		
		if(e.getSource() == sword.sword1 || e.getSource() == sword.sword2 || e.getSource() == sword.sword3 
			|| e.getSource() == monster.monster
			|| e.getSource() == fireball.fireball1 || e.getSource() == fireball.fireball2 || e.getSource() == fireball.fireball3
			|| e.getSource() ==fireball.fireball4 || e.getSource() == fireball.fireball5 )
		{
			System.out.println("PATAY KA");
			defeat.defeat();
		}
		
		imageChanger();
	}
	
	public void imageChanger()
	{
		int goal = -14396006;
		int road1 = -7356629;
		int road2 = -12819382;
		int road3 = -3105287;
		int road4 = -1030143;
		
		if(level.currentLevel == level.level1)
		{
			if(color != road1 && color != goal)
			{
				System.out.println("PATAY KA");
				defeat.defeat();
			}
			if(color == goal)
			{
				level.currentLevel = level.level2;
				game.add(sword.sword1);
				game.add(sword.sword2);
				game.add(sword.sword3);
				game.repaint();
				audio_Controller.sword();
				obstacle_Controller.swordActivator();
			}
		}
		
		
		else if(level.currentLevel == level.level2)
		{
			if(color != road2 && color != goal)
			{
				System.out.println("PATAY KA");
				defeat.defeat();
			}
			if(color == goal)
			{
				level.currentLevel = level.level3;
				
				obstacle_Controller.monsterActivator();
				obstacle_Controller.swordDisabler();
				
				audio_Controller.swordStop();
				audio_Controller.monster();
				
				game.add(monster.monster);
				game.repaint();
			}
		}
		
		else if(level.currentLevel == level.level3)
		{
			if(color != road3 && color != goal)
			{
				System.out.println("PATAY KA");
				defeat.defeat();
			}
			if(color == goal)
			{
				level.currentLevel = level.level4;
				
				obstacle_Controller.fireBallActivator();
				obstacle_Controller.monsterDisabler();
				
				audio_Controller.soundtrack1Stop();
				audio_Controller.monsterStop();
				
				audio_Controller.fireball();
				audio_Controller.level4();
				
				game.add(fireball.fireball1);
				game.add(fireball.fireball2);
				game.add(fireball.fireball3);
				game.add(fireball.fireball4);
				game.add(fireball.fireball5);
				game.repaint();
			}
		}
		
		else if(level.currentLevel == level.level4)
		{
			if(color != road4 && color != goal)
			{
				System.out.println("PATAY KA");
				defeat.defeat();
			}
			if(color == goal)
			{
				System.out.println("you win");
				level.currentLevel = level.win;
				win.win();
				obstacle_Controller.fireBallDisabler();
				game.repaint();
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

			

	}
	
	//Method to back to main menu
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(level.currentLevel == level.lose)
		{
		level.currentLevel = level.intro;
		buttons.playBtn.setVisible(true);
		buttons.instruction.setVisible(true);
		audio_Controller.defeatStop();
		audio_Controller.soundtrack();
		time.reset();
		time.timelabel.setVisible(false);
		game.repaint();
		}
		
		if(level.currentLevel == level.win)
		{
		level.currentLevel = level.intro;
		buttons.playBtn.setVisible(true);
		buttons.instruction.setVisible(true);
		audio_Controller.winStop();
		audio_Controller.soundtrack();
		time.reset();
		time.timelabel.setVisible(false);
		game.repaint();
		}
		if(level.currentLevel == level.instruction)
		{
			level.currentLevel = level.intro;
			game.repaint();
			buttons.playBtn.setVisible(true);
			buttons.instruction.setVisible(true);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
