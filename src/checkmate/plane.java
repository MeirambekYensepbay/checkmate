package checkmate;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class plane extends JPanel{
	int x;
	int y;
	plane(int x, int y){
		this.x=x;
		this.y=y;
		if((x+y)%2==0){
			setBackground(new Color(250,250,206));
		}
		else 
			setBackground(Color.white);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<8; i++)
			for(int j=0; j<8; j++)
				
	}
	

}
