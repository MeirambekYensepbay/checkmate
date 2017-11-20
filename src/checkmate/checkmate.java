package checkmate;
	
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.*;
	
	public class checkmate extends JFrame{
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
			bkil = new JLabel(bk);
			wkil = new JLabel(wk);
			wril1 = new JLabel(wr1);
			wril2 = new JLabel(wr2);
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
			getContentPane().add(r);
			
			if(count%2==0){
				wkil.addMouseListener(new MouseListener() {
						
						
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
							System.out.println("King choosed");
							King_change_pos(X,Y);
							count++;
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
						System.out.println("Rook choosed");
						rook_change_position(RX1, RY1);
						
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
						
					}
				});
				wril2.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						// TODO Auto-generated method stub
						System.out.println("Rook choosed");
						rook_change_position1(RX2, RY2);
						
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
						
					}
				});
			}
		}
		
		
		public void King_change_pos(int x, int y){
			this.X=x;
			this.Y=y;
			r.addMouseListener(new MouseListener() {
				@Override
				public void mouseReleased(MouseEvent m) {
					// TODO Auto-generated method stub
					int movX=m.getX()-x;
					int movY=m.getY()-y;
					
					System.out.println(x+" "+y);
					System.out.println(movX+" "+movY);
					System.out.println(m.getX()+" "+m.getY());
					move_king(x,y,movX,movY,m.getX(),m.getY());
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
			this.RX1=x;
			this.RY1=y;
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
					
					System.out.println(x+" "+y);
					System.out.println(movX+" "+movY);
					System.out.println(m1.getX()+" "+m1.getY());
					move_ladya(x,y,movX,movY);
				}
			});
			count++;
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
					
					move_ladya1(x,y,movX,movY);
				}
			});
			count++;
		}

		public void move_ladya(int x, int y, int movX, int movY){
			int cx=0;
			int cy=0;
			System.out.println(x+" "+y+" "+movX+" "+movY);
			if(Math.abs(x-movX)<50&&movX>=40){
				cx=movX-Math.abs(x-movX);
				if(RY1>movY)
					for(int i=RY1; i>=70; i-=50){
						if(i>=movY&&movY+50>=i&&movY>=40){
							cy=i-50;
						}
					}
				else
					for(int i=RY1; i<=520; i+=50){
						if(i>movY&&movY+50>i&&movY<=520){
							cy=i-50;
						}
					}
				RX1=cx;
				RY1=cy;
			}
			else if(Math.abs(y-movY)<50&&movY>=40){
				cy=movY-Math.abs(y-movY);
				if(RX1>movX)
					for(int i=RX1; i>=70; i-=50){
						if(i>=movX&&movX+50>=i&&movX>=40){
							cx=i-50;
						}
					}
				else
					for(int i=RX1; i<=520; i+=50){
						if(i>movX&&movX+50>i&&movX<=520){
							cx=i-50;
						}
					}
				RX1=cx;
				RY1=cy;
			}
			/*if(Math.abs(y-movX)<50){
				cy=movY-Math.abs(y-movY);
				RY1=cy;
			}*/
			wril1.setBounds(RX1, RY1, 50, 50);
			System.out.println(RX1+" "+RY1);
			repaint();
			check_r(RX1,RY1);
		}
		public void move_ladya1(int x, int y, int movX, int movY){
			int cx=0;
			int cy=0;
			System.out.println(x+" "+y+" "+movX+" "+movY);
			if(Math.abs(x-movX)<50&&movX>=40){
				cx=movX-Math.abs(x-movX);
				if(RY2>movY)
					for(int i=RY2; i>=70; i-=50){
						if(i>=movY&&movY+50>=i&&movY>=40){
							cy=i-50;
						}
					}
				else
					for(int i=RY2; i<=520; i+=50){
						if(i>movY&&movY+50>i&&movY<=520){
							cy=i-50;
						}
					}
				RX2=cx;
				RY2=cy;
			}
			else if(Math.abs(y-movY)<50&&movY>=40){
				cy=movY-Math.abs(y-movY);
				if(RX2>movX)
					for(int i=RX2; i>=70; i-=50){
						if(i>=movX&&movX+50>=i&&movX>=40){
							cx=i-50;
						}
					}
				else
					for(int i=RX2; i<=520; i+=50){
						if(i>movX&&movX+50>i&&movX<=520){
							cx=i-50;
						}
					}
				RX2=cx;
				RY2=cy;
			}
			/*if(Math.abs(y-movX)<50){
				cy=movY-Math.abs(y-movY);
				RY1=cy;
			}*/
			wril2.setBounds(RX2, RY2, 50, 50);
			System.out.println(RX2+" "+RY2);
			repaint();
			check_r(RX2,RY2);
		}

		public  void move_king(int x, int y, int movX, int movY, int fx,int fy){
			int cx = 0;
			int cy = 0;
			if(Math.abs(X-fx)<=50&&Math.abs(X-fx)>=0&&Math.abs(Y-fy)<=50&&Math.abs(Y-fy)>=0){
				
				if(fx>X-50&&fx<=X&&fx>=0&&fx<=470){
					System.out.println("1");
					cx=fx-Math.abs(Math.abs(X-fx)-50);
					X=cx;
				}
				if(fy>Y-50&&fy<=Y&&fy>=0&&fy<=470){
					System.out.println("2");
					cy=fy-Math.abs(Math.abs(Y-fy)-50);
					Y=cy;
				}
				if(fy<Y+100&&fy>Y){
					cy=fy-(Math.abs(Y-fy));
					Y=cy;
				}
				if(fx<X+100&&fx>X){
					cy=fy-(Math.abs(Y-fy));
					Y=cy;
				}
				
				
			/*	for(int i=Y-50; i<=Y+50; i+=50){
					for(int j=X-50; j<=X+50; j+=50){
						if(fy<=i){
							Y=i;
						}
						if(fx<=j){
							X=j;
						}
							
					}
				}*/
				}
				else {System.out.println("Wrong");}
				System.out.println(cx+" "+cy);
				wkil.setBounds(X, Y, 50, 50);
				check_r(X,Y);
			repaint();
		}
		public  void move_king_enemy(int x, int y, int movX, int movY, int fx,int fy){
			int cx = 0;
			int cy = 0;
				if(x==fx)
					y=y+movY;
				else if(y==fy)
					x=x+movX;
				bkil.setBounds(BX, BY, 50, 50);
			repaint();
		}
		public  void move_king_enemy(int x, int y){
			int cx = 0;
			int cy = 0;
			Random r = new Random();
			int a=r.nextInt()%10+10;
				if(a>3&&a<6)
					y=y+50;
				else if(a<=3)
					x=x+50;
				else if(a>6&&a<9){
					x=x+50;
					y=y+50;
				}
				BX=x;
				BY=y;
				bkil.setBounds(BX, BY, 50, 50);
			repaint();
		}
		public void check_r(int x, int y){
			boolean b = false;
			if(x==BX||y==BY){
				System.out.println("Check");
				b=true;
			}
			if(b)
				bot_step(x,y);
			
		} 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new checkmate();
		}
		
		public void bot_step(int q, int w){
			Random r = new Random();
				int rnd1 = 40 + (int)(Math.random() * ((510 - 40) + 1));
				int rnd2 = 70 + (int)(Math.random() * ((540 - 70) + 1));
				move_king_enemy(BX,BY,50,50,q,w);
				
		}
		public void bot_step(){
			move_king_enemy(BX,BY);
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
	
	
