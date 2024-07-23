package game.source;

public class Audio_Controller {
	Audio audio;
	public Audio_Controller(Audio audio) {
		this.audio = audio;
	}
	
	public void soundtrack()
	{
		audio.soundtrack.loop();
	}
	
	public void soundtrack1()
	{
		audio.soundtrack1.loop();
	}
	
	public void level4()
	{
		audio.level4.loop();
	}
	
	public void sword()
	{
		audio.sword.loop();
	}
	
	public void monster()
	{
		audio.monster.loop();
	}
	
	public void fireball()
	{
		audio.fireball.loop();
	}
	
	public void defeat()
	{
		audio.defeat.play();
	}
	
	public void win()
	{
		audio.win.play();
	}
	
	//Stop
	public void soundtrackStop()
	{
		audio.soundtrack.stop();
	}
	
	public void soundtrack1Stop()
	{
		audio.soundtrack1.stop();
	}
	
	public void level4Stop()
	{
		audio.level4.stop();
	}
	
	public void swordStop()
	{
		audio.sword.stop();
	}
	
	public void monsterStop()
	{
		audio.monster.stop();
	}
	
	public void fireballStop()
	{
		audio.fireball.stop();
	}
	
	public void defeatStop()
	{
		audio.defeat.stop();
	}
	
	public void winStop()
	{
		audio.win.stop();
	}
}
