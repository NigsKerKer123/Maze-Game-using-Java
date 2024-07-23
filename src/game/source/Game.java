package game.source;

import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Game extends JComponent{
	Levels level;
	Buttons button;
	
	public Game(Levels level) throws IOException
	{
		this.level = level;
	}
	
	public static void main(String[] args) throws IOException {
		//Creating window frame
		JFrame window = new JFrame("Fantasy World Escape Maze by kerker");
		
		Time time = new Time();
		Audio audio = new Audio();
		FireBall fireball = new FireBall();
		Monster monster = new Monster();
		Sword sword = new Sword();
		Levels level = new Levels();
		Game game = new Game(level);
		Obstacle_Controller obstacle_Controller = new Obstacle_Controller(sword, monster, fireball);
		Audio_Controller audio_Controller = new Audio_Controller(audio);
		Defeat_Controller defeat = new Defeat_Controller(sword, monster, fireball, level, game, audio_Controller);
		Win_Controller win = new Win_Controller(level, audio_Controller, game, time);
		Buttons button = new Buttons(game, level, sword, monster, fireball, obstacle_Controller, defeat, audio_Controller, win, time);
		
		//adding the game object to the frame
		window.add(game);
		game.add(button.playBtn);
		game.add(button.instruction);
		
		//To fit the images to the frame
		window.pack();
		
		//To put the frame in the center
		window.setLocationRelativeTo(null);
		
		//To disable the resizable frame
		window.setResizable(false);
		
		//To close the frame properly
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//to display the frame
		window.setVisible(true);
		
		audio_Controller.soundtrack();
	}
	
	public Dimension getPreferredSize()
	{
		//Setting the frames size
		return new Dimension(600,700);
	}
	
	public void paintComponent(Graphics g)
	{
		//To draw the images in the window
		g.drawImage(level.currentLevel, 0, 0, null);
	}
}
