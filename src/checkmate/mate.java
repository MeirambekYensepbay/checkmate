package checkmate;

import java.awt.*;

import javax.swing.*;

public class mate extends JFrame{
	JPanel p1;
	
	mate(Graphics g){
		
		
		setSize(700, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		ImageIcon bk = new ImageIcon("C:\\Users\\Yensepbay\\workspace\\checkmate\\src\\checkmate\\Black_king.png");
		ImageIcon wk = new ImageIcon("C:\\Users\\Yensepbay\\workspace\\checkmate\\src\\checkmate\\white_king.png");
		ImageIcon wr1 = new ImageIcon("C:\\Users\\Yensepbay\\workspace\\checkmate\\src\\checkmate\\white_rook.png");
		ImageIcon wr2 = new ImageIcon("C:\\Users\\Yensepbay\\workspace\\checkmate\\src\\checkmate\\white_rook.png");
	
		JLabel bkil = new JLabel(bk);
		JLabel wkil = new JLabel(wk);
		JLabel wril1 = new JLabel(wr1);
		JLabel wril2 = new JLabel(wr2);
		
		int x=3*50+40,y=7*50+70;
		
		wkil.setBounds(x, y, 50, 50);
		wril1.setBounds(0*50+40, 7*50+70, 50, 50);
		wril2.setBounds(7*50+40, 7*50+70, 50, 50);
		bkil.setBounds(4*50+40, 0*50+70, 50, 50);
		
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				if((i+j)%2==0){
					g.setColor(new Color(206,206,206));
					g.fillRect(i*50+40, j*50+70, 50, 50);
				}
				else{
					g.setColor(Color.WHITE);
					g.fillRect(i*50+40, j*50+70, 50, 50);
				}
			}
		}
		add(bkil);
		add(wkil);
		add(wril1);
		add(wril2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mate(null);
	}

}
