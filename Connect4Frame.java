package Connect4;
import javax.swing.JFrame;



public class Connect4Frame extends JFrame {
	public Connect4Frame() {
		
		
		Connect4Panel panel = new Connect4Panel();
		add(panel);
		setVisible(true);
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
