package Connect4;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;


import ttt_gui.GameBoardInterface;
import ttt_gui.GamePlayerInterface;
import ttt_gui.Player;

public class Connect4Panel extends JPanel implements ActionListener {
	public JButton[] buttons ;
	public String[] btnName  = {"CLICK HERE"};
	public JLabel [][] gameBoard= new JLabel [6][7];
	private int col = 6;
	private int row = 7;
	private int [] tracker  = {5,5,5,5,5,5,5};
	String currPlayer = "Red";
	String player1 = "Red";
	String player2 = "Yellow";
	


	//MAKES PANEL & ADD BUTTONS
	public Connect4Panel() {
		buttons = new JButton[7];
		for(int i = 0; i<buttons.length; i++) {
				buttons[i] = new JButton(btnName[0]);
				buttons[i].addActionListener(this);
				add(buttons[i]);		
		}
		
		for(int i =0;i < col;i++) {
			for(int j=0;j<row;j++) {
				gameBoard[i][j] = new JLabel();
				gameBoard[i][j].setBorder(new LineBorder(Color.BLACK));
				gameBoard[i][j].setOpaque(true);
			
				add(gameBoard[i][j]);
				
			}
		}
		setLayout(new GridLayout(row,col));

	}	
	//ALLOWS BUTTON TO BE CLICKED AND DROP COLOR DOWN
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int rowInCol;
		if(buttons[0] == e.getSource()) {
			rowInCol = tracker[0];
			if(rowInCol==0) {buttons[0].setEnabled(false);}
			if(currPlayer.equals(player1)) {
				gameBoard[rowInCol][0].setBackground(Color.RED);
				currPlayer  ="Yellow";
			}else if(currPlayer.equals(player2)){
				gameBoard[rowInCol][0].setBackground(Color.YELLOW);
				currPlayer = "Red";
			}
			tracker[0]--;
		}
		else if (buttons[1] == e.getSource()) {
			System.out.println("1");
			rowInCol = tracker[1];
			if(rowInCol==0) {buttons[1].setEnabled(false);}
			if(currPlayer.equals(player1)) {
				gameBoard[rowInCol][1].setBackground(Color.RED);
				currPlayer  ="Yellow";
			}else if(currPlayer.equals(player2)){
				gameBoard[rowInCol][1].setBackground(Color.YELLOW);
				currPlayer = "Red";
			}
			tracker[1]--;
		}
		else if (buttons[2] == e.getSource()) {
			System.out.println("2");
			rowInCol = tracker[2];
			if(rowInCol==0) {buttons[2].setEnabled(false);}
			if(currPlayer.equals(player1)) {
				gameBoard[rowInCol][2].setBackground(Color.RED);
				currPlayer  ="Yellow";
			}else if(currPlayer.equals(player2)){
				gameBoard[rowInCol][2].setBackground(Color.YELLOW);
				currPlayer = "Red";
			}
			tracker[2]--;
		}
		else if (buttons[3] == e.getSource()) {
			System.out.println("3");
			rowInCol = tracker[3];
			if(rowInCol==0) {buttons[3].setEnabled(false);}
			if(currPlayer.equals(player1)) {
				gameBoard[rowInCol][3].setBackground(Color.RED);
				currPlayer  ="Yellow";
			}else if(currPlayer.equals(player2)){
				gameBoard[rowInCol][3].setBackground(Color.YELLOW);
				currPlayer = "Red";
			}
			tracker[3]--;
		}
		else if (buttons[4] == e.getSource()) {
			System.out.println("4");
			rowInCol = tracker[4];
			if(rowInCol==0) {buttons[4].setEnabled(false);}
			if(currPlayer.equals(player1)) {
				gameBoard[rowInCol][4].setBackground(Color.RED);
				currPlayer  ="Yellow";
			}else if(currPlayer.equals(player2)){
				gameBoard[rowInCol][4].setBackground(Color.YELLOW);
				currPlayer = "Red";
			}
			tracker[4]--;
		}
		else if (buttons[5] == e.getSource()) {
			System.out.println("5");
			rowInCol = tracker[5];
			if(rowInCol==0) {buttons[5].setEnabled(false);}
			if(currPlayer.equals(player1)) {
				gameBoard[rowInCol][5].setBackground(Color.RED);
				currPlayer  ="Yellow";
			}else if(currPlayer.equals(player2)){
				gameBoard[rowInCol][5].setBackground(Color.YELLOW);
				currPlayer = "Red";
			}
			tracker[5]--;
		}
		else if (buttons[6] == e.getSource()) {
			System.out.println("6");
			rowInCol = tracker[6];
			if(rowInCol==0) {buttons[6].setEnabled(false);}
			if(currPlayer.equals(player1)) {
				gameBoard[rowInCol][6].setBackground(Color.RED);
				currPlayer  ="Yellow";
			}else if(currPlayer.equals(player2)){
				gameBoard[rowInCol][6].setBackground(Color.YELLOW);
				currPlayer = "Red";
			}
			tracker[6]--;
		}	
	}//end of action listener 
	
	
	
}//end of code
	
	

	

