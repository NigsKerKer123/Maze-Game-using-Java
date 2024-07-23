package game.source;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class Audio {
	AudioClip soundtrack1;
	AudioClip soundtrack;
	AudioClip level4;
	AudioClip sword;
	AudioClip monster;
	AudioClip fireball;
	AudioClip win;
	AudioClip defeat;
	
	public Audio()
	{
	this.soundtrack1 = JApplet.newAudioClip(getClass().getResource("/audios/soundtrack1.wav"));
	this.soundtrack = JApplet.newAudioClip(getClass().getResource("/audios/soundtrack.wav"));
	this.level4 = JApplet.newAudioClip(getClass().getResource("/audios/level4.wav"));
	this.sword = JApplet.newAudioClip(getClass().getResource("/audios/sword.wav"));
	this.monster = JApplet.newAudioClip(getClass().getResource("/audios/monster.wav"));
	this.fireball = JApplet.newAudioClip(getClass().getResource("/audios/fireball.wav"));
	this.win = JApplet.newAudioClip(getClass().getResource("/audios/win.wav"));
	this.defeat = JApplet.newAudioClip(getClass().getResource("/audios/defeat.wav"));
	}
}
