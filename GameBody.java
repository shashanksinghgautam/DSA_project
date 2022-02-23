import java.awt.Color;

import javax.swing.JFrame;

public class GameBody extends JFrame{

	GameBody(){
			
		this.add(new GameCode());
		this.setTitle("Snake Game");
		this.setBounds(10,10,905,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setBackground(Color.DARK_GRAY);
		this.setVisible(true);
		
		
	}
}