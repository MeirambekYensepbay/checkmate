package checkmate;
	
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.*;
	public class checkmate extends JFrame{
		boolean move_true=true;
		boolean move_true1=true;
		JLabel sts;
		String status="Step";
		int count = 2;
		public int X=3*50+40;
		public int Y=7*50+70;
		public int RX1=0*50+40;
		public int RY1=7*50+70;
		public int RX2=7*50+40;
		public int RY2=7*50+70;
		public int BX=4*50+40;
		public int BY=0*50+70;
		
		MyPanel r;
		JLabel bkil;
		JLabel wkil;
		JLabel wril1;
		JLabel wril2;
		checkmate() {
			setSize(500,600);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			r = new MyPanel();
			ImageIcon bk = new ImageIcon("C:\\Users\\Yensepbay\\workspace\\checkmate\\src\\checkmate\\Black_king.png");
			ImageIcon wk = new ImageIcon("C:\\Users\\Yensepbay\\workspace\\checkmate\\src\\checkmate\\white_king.png");
			ImageIcon wr1 = new ImageIcon("C:\\Users\\Yensepbay\\workspace\\checkmate\\src\\checkmate\\white_rook.png");
			ImageIcon wr2 = new ImageIcon("C:\\Users\\Yensepbay\\workspace\\checkmate\\src\\checkmate\\white_rook.png");
			
			sts = new JLabel(status);
			bkil = new JLabel(bk);
			wkil = new JLabel(wk);
			wril1 = new JLabel(wr1);
			wril2 = new JLabel(wr2);
			sts.setBounds(20, 10, 100, 50);
			wkil.setBounds(X, Y, 50, 50);
			wril1.setBounds(RX1, RY1, 50, 50);
			wril2.setBounds(RX2, RY2, 50, 50);
			setResizable(false);
			setVisible(true);
			bkil.setBounds(BX, BY, 50, 50);
			
			add(bkil);
			add(wkil);
			add(wril1);
			add(wril2);
			add(sts);
			getContentPane().add(r);
			
				event();
				
			System.out.println(BX+" "+BY);
			
		}
		
		
		public void King_change_pos(int x, int y){
			this.X=x;
			this.Y=y;
			r.addMouseListener(new MouseListener() {
				@Override
				public void mouseReleased(MouseEvent m) {
					// TODO Auto-generated method stub
				
					int provx=(m.getX()-40)/50;
					int provy=(m.getY()-70)/50;
					
						move_king((X-40)/50,(Y-70)/50,provx,provy);
					
					
				}
				@Override
				public void mousePressed(MouseEvent m) {
					// TODO Auto-generated method stub
					
				}
	
				@Override
				public void mouseExited(MouseEvent m) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent m) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent m) {
					// TODO Auto-generated method stub
					
				}
			});
			
		}
	
		public void rook_change_position(int x, int y){
			r.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent m1) {
				
				}
				
				@Override
				public void mousePressed(MouseEvent m1) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent m1) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent m1) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent m1) {
					// TODO Auto-generated method stub
					// TODO Auto-generated method stub.
					
					int provx=(m1.getX()-40)/50;
					int provy=(m1.getY()-70)/50;

					move_ladya(provx,provy);
				}
			});
		}
		public void rook_change_position1(int x, int y){
			this.RX2=x;
			this.RY2=y;
			r.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent m1) {
					
				}
				
				@Override
				public void mousePressed(MouseEvent m1) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent m1) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent m1) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent m1) {
					// TODO Auto-generated method stub
					// TODO Auto-generated method stub
					int movX=m1.getX();
					int movY=m1.getY();
					
					move_ladya1(movX,movY);
				}
			});
		}

		public void move_ladya(int movX, int movY){

			if((RX1-40)/50==movX||(RY1-70)/50==movY){
				RX1=movX*50+40;
				RY1=movY*50+70;
				wril1.setBounds(RX1, RY1, 50, 50);
				repaint();
				count++;
				bot_step(BX,BY);
				check_r(RX1,RY1);
			}
			else System.out.println("Error " + RX1 + " " + RY1);
		}
		public void move_ladya1(int movX, int movY){

			if((RX2-40)/50==movX||(RY2-70)/50==movY){
				RX2=movX*50+40;
				RY2=movY*50+70;
				wril2.setBounds(RX2, RY2, 50, 50);
				repaint();
				count++;
				bot_step(BX,BY);
				/*check_r(RX2,RY2);*/
			}
			else System.out.println("Error " + RX2 + " " + RY2);
		}

		public void move_king(int x, int y, int movX, int movY){
			if(((x-movX==0&&Math.abs(y-movY)==1)||((y-movY==0&&Math.abs(x-movX)==1))&&Math.abs((Math.abs(x-movX)-Math.abs(y-movY)))==1)||(Math.abs(x-movX)==1&&Math.abs(y-movY)==1)){
				X=movX*50+40;
				Y=movY*50+70;
				wkil.setBounds(X, Y, 50, 50);
				repaint();
				count++;
				bot_step(BX,BY);
				check_r(X,Y);
				//return true;
			}
			else{
				//return false;
			}
		}
		
		/*public  void move_king_enemy(int x, int y, int movX, int movY, int fx,int fy){
			int cx = 0;
			int cy = 0;
				if(x==fx)
					y=y+movY;
				else if(y==fy)
					x=x+movX;
				bkil.setBounds(BX, BY, 50, 50);
			repaint();
		}
		*/
		public  void move_king_enemy(int x, int y){
			
			Random r = new Random();
			while(move_true){
				double rand = Math.random()*8;
				System.out.println("rand "+(int)rand+" x "+x);
				if(((x-(int)rand==0)||(Math.abs(x-(int)rand)==1))){

					System.out.println("rand "+(int)rand);
					while(move_true1){
						double rand1 = Math.random()*8;
						System.out.println("rand1 "+(int)rand1+" y "+y);
						/*if(((x-(int)rand==0)&&(Math.abs(y-(int)rand1)==1||(Math.abs(x-(int)rand)==1))&&(y-(int)rand1==0||(Math.abs(x-(int)rand)==1)&&Math.abs(y-(int)rand1)==1)&&Math.abs((Math.abs(x-(int)rand)-Math.abs(y-(int)rand1)))==1)){*/
						if((x+1==(int)rand||x-1==(int)rand||x==(int)rand)&&(y+1==(int)rand1||y-1==(int)rand1)||y==(int)rand1){
							
							BX=(int)rand*50+40;
							BY=(int)rand1*50+70;
							bkil.setBounds(BX, BY, 50, 50);
							repaint();
							count++;
							event();
							move_true1=false;
							
						}
					}
					move_true=false;
				}
			}
				
		}
		public void check_r(int x, int y){
			boolean b = false;
			if(x==BX||y==BY){
				System.out.println("Check");
				b=true;
				status="check";
			}
			if(b==true)
				bot_step(x,y);
			
		} 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new checkmate();
		}
		
	
		public void bot_step(int x, int y){
			status="black";
			repaint();
			move_true=true;
			move_true1=true;
			move_king_enemy((BX-40)/50,(BY-70)/50);
			System.out.println(BX+" "+BY);
		}
		public void event(){
				status="White";
				repaint();
				wkil.addMouseListener(new MouseListener() {
				
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
						
					System.out.println("King choosed");
					King_change_pos(X,Y);
					
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
		
				wril1.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					// TODO Auto-generated method stub
					status="Root choosed";
					System.out.println("Rook choosed");
					rook_change_position(RX1, RY1);
				}
			});
				wril2.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent arg0) {
					// TODO Auto-generated method stub
				
					
				}
				
				@Override
				public void mousePressed(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent arg0) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent arg0) {
					// TODO Auto-generated method stub
					System.out.println("Rook choosed");
					rook_change_position1(RX2, RY2);
				}
			});
			
		}
	}
	
	class MyPanel extends JPanel{
	public void paint(Graphics g){
			for(int i=0; i<8;i++)
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
	}