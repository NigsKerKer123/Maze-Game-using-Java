package game.source;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Labels {
	ImageIcon intro;
	JLabel labelIntro;
	
	public Labels()
	{
		intro = new ImageIcon("C:\\Users\\ANYABORGER\\eclipse-workspace\\Game_Demo_SIERAS\\src\\images\\intro.jpg");
		labelIntro = new JLabel(intro);
		labelIntro.setSize(600,700);
	}
	
}
