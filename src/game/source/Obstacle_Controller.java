package game.source;

public class Obstacle_Controller {
	Sword sword;
	Monster monster;
	FireBall fireball;

	public Obstacle_Controller(Sword sword, Monster monster, FireBall fireball) {
		this.sword = sword;
		this.monster = monster;
		this.fireball = fireball;
	}

	public void swordDisabler()
	{
		sword.sword1.setVisible(false);
		sword.sword2.setVisible(false);
		sword.sword3.setVisible(false);
		sword.timer.stop();
	}
	
	public void monsterDisabler()
	{
		monster.monster.setVisible(false);
		monster.timer.stop();
	}
	
	public void fireBallDisabler()
	{
		fireball.fireball1.setVisible(false);
		fireball.fireball2.setVisible(false);
		fireball.fireball3.setVisible(false);
		fireball.fireball4.setVisible(false);
		fireball.fireball5.setVisible(false);
		
		fireball.fireballY1 = 0;
		fireball.fireballY2 = 0;
		fireball.fireballY3 = 0;
		fireball.fireballY4 = 0;
		fireball.fireballY5 = 0;
		
		fireball.timer.start();
	}
	
	public void swordActivator()
	{
		sword.sword1.setVisible(true);
		sword.sword2.setVisible(true);
		sword.sword3.setVisible(true);
		sword.timer.start();
	}
	
	public void monsterActivator()
	{
		monster.monster.setVisible(true);
		monster.timer.start();
	}
	
	public void fireBallActivator()
	{
		fireball.fireball1.setVisible(true);
		fireball.fireball2.setVisible(true);
		fireball.fireball3.setVisible(true);
		fireball.fireball4.setVisible(true);
		fireball.fireball5.setVisible(true);
		
		fireball.fireballY1 = 0;
		fireball.fireballY2 = 50;
		fireball.fireballY3 = 100;
		fireball.fireballY4 = 200;
		fireball.fireballY5 = 300;
		
		fireball.timer.start();
	}
}
