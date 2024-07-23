package game.source;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Levels {
	BufferedImage intro;
	BufferedImage level1;
	BufferedImage level2;
	BufferedImage level3;
	BufferedImage level4;
	BufferedImage lose;
	BufferedImage win;
	BufferedImage instruction;
	BufferedImage currentLevel;
	
	public Levels() throws IOException
	{
		intro = ImageIO.read(getClass().getResource("/images/intro.jpg"));
		level1 = ImageIO.read(getClass().getResource("/images/level1.jpg"));
		level2 = ImageIO.read(getClass().getResource("/images/level2.jpg"));
		level3 = ImageIO.read(getClass().getResource("/images/level3.jpg"));
		level4 = ImageIO.read(getClass().getResource("/images/level4.jpg"));
		lose = ImageIO.read(getClass().getResource("/images/lose.jpg"));
		win = ImageIO.read(getClass().getResource("/images/Win.jpg"));
		instruction = ImageIO.read(getClass().getResource("/images/instruction.jpg"));
		currentLevel = intro;
	}
}
