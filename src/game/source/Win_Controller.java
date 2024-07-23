package game.source;

public class Win_Controller{
	Levels level;
	Audio_Controller audio_Controller;
	Game game;
	Time time;
	
	public Win_Controller(Levels level, Audio_Controller audio_Controller, Game game, Time time) {
		this.level = level;
		this.audio_Controller = audio_Controller;
		this.game = game;
		this.time = time;
	}
	
	public void win()
	{
		level.currentLevel = level.win;
		game.repaint();
		audio_Controller.win();
		audio_Controller.defeatStop();
		audio_Controller.fireballStop();
		audio_Controller.level4Stop();
		audio_Controller.soundtrack1Stop();
		audio_Controller.soundtrackStop();
		audio_Controller.monsterStop();
		audio_Controller.swordStop();
		
		time.timer.stop();
		game.add(time.timelabel);
		time.timelabel.setVisible(true);
	}
}
