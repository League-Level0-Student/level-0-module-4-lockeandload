package _02_boolean._3_game_over;

import java.util.Random;
import javax.swing.JOptionPane;

public class GameOver {

	public static void main(String[] args) {

		boolean gameOver = false;
		Random gen =new Random ();
		// 1. Ask the user if the game is over and save their answer.

		int num = gen.nextInt(2)+1;
		System.out.println(num);

while(!gameOver) {
		
			String areUStraght = JOptionPane.showInputDialog("are u straght?");
		
		if(areUStraght.equals("yes")) {
				 gameOver = true;
		}
}
		// 2. If they answer "yes" change gameOver to true.

		// 3. Surround steps 1-2 in a while loop that runs as long as
		//    gameOver is false. Hint: Use the ! operator.

		// 4. Tell the user the game is over outside the while loop.
		if(num==1) {
			JOptionPane.showMessageDialog(null, "roses are red,\nviolets are blue,\nyour city is gone,\nI'm thomas, the thermonuclear bomb");
		}
		if(num==2) {
			JOptionPane.showMessageDialog(null, "roses are red,\nviolets are blue,\nYou sure are fast,\nbut I am too");
		}













	}

}