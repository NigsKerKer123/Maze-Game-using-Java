package game.source;

public class Defeat_Controller {
	Sword sword;
	Monster monster;
	FireBall fireball;
	Levels level;
	Game game;
	Audio_Controller audio_Controller;
	
	public Defeat_Controller(Sword sword, Monster monster, FireBall fireball, Levels level, Game game, Audio_Controller audio_Controller)
	{
		this.sword = sword;
		this.monster = monster;
		this.fireball = fireball;
		this.level = level;
		this.game = game;
		this.audio_Controller = audio_Controller;
	}
	
	public void defeat()
	{
		sword.sword1.setVisible(false);
		sword.sword2.setVisible(false);
		sword.sword3.setVisible(false);
		sword.timer.stop();
		
		monster.monster.setVisible(false);
		monster.timer.stop();
		
		fireball.fireball1.setVisible(false);
		fireball.fireball2.setVisible(false);
		fireball.fireball3.setVisible(false);
		fireball.fireball4.setVisible(false);
		fireball.fireball5.setVisible(false);
		fireball.timer.stop();
		
		audio_Controller.defeat();
		audio_Controller.fireballStop();
		audio_Controller.level4Stop();
		audio_Controller.soundtrack1Stop();
		audio_Controller.soundtrackStop();
		audio_Controller.winStop();
		audio_Controller.monsterStop();
		audio_Controller.swordStop();
		
		level.currentLevel = level.lose;
		game.repaint();
	}
	
}
