package checkmate;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;

import org.w3c.dom.css.Rect;

public class board extends JFrame{ 
	
	
	static char a[][] = {{'0','0','0','2','0','0','0','0'},
			  			 {'0','0','0','0','0','0','0','0'},
			  			 {'0','0','0','0','0','0','0','0'},
			  			 {'0','0','0','0','0','0','0','0'},
			  			 {'0','0','0','0','0','0','0','0'},
			  			 {'0','0','0','0','0','0','0','0'},
			  			 {'0','0','0','0','0','0','0','0'},
			  			 {'3','0','0','0','4','0','0','1'}};
	
	static int eKx;
	static int eKy;
	
	static int XM;
	static int YM;
	
	static int stepCount=0;
	/*public static double rnd(final double max)
    {
		return Math.random() * max;
    }*/
	static void bot_step(){
		System.out.println(eKx +" bs1 "+eKy);
		move_king(eKx, eKy, eKx+1, eKy+1);
		System.out.println(eKx +" bs1 "+eKy);
		eKx=eKx+1;
		eKy=eKy+1;
		System.out.println(eKx +" bs2 "+eKy);
		check(XM,YM);
	}
	static void eat(){
		if(a[eKx][eKy]=='2'||a[eKx][eKy]=='3'){
		}
	}
	static boolean check(int x, int y){
		if(x==eKx||y==eKy){
			return true;
		}       
		else return false;
	}
	static void printBoard(){
		Scanner input = new Scanner(System.in);
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();	
		}
		while(true){
			stepCount++;
			if(stepCount%2==1){
				System.out.println(stepCount+" choose your figure coordinate:");
				int x=input.nextInt();
				int y=input.nextInt();
				figure(x,y);
			} 	
			else{
				System.out.println("Bot step"+stepCount);
				bot_step();
			}

			printBoard();
		}
	}
	public static void figure(int fcx, int fcy){
		Scanner input = new Scanner(System.in);
			System.out.println("it's you figure:"+a[fcx][fcy]);
			System.out.println("input step coordinate:");
			
			int fcmx=input.nextInt();
			int fcmy=input.nextInt();
			
			if(a[fcx][fcy]=='1'||a[fcx][fcy]=='3'){
				move_ladya(fcx,fcy,fcmx,fcmy);
			}
			if(a[fcx][fcy]=='4'){
				move_king(fcx,fcy,fcmx,fcmy);
			}
	
	}
	public static void move_ladya(int x, int y, int movX, int movY){
		char b[][] = new char[8][8];
		if(x==movX||y==movY){
			b[x][y]=a[x][y];
			a[x][y]=a[movX][movY];
			a[movX][movY]=b[x][y];
			check(movX,movY);
			XM=movX;
			YM=movY;
		}
		else System.out.println("Error "+x+" "+movX+" "+y+" "+movY);
	}
	public static void move_king(int x, int y, int movX, int movY){
		char b[][] = new char[8][8];
		System.out.println(eKx +" MV1 "+eKy);
		if(((x-movX==0&&Math.abs(y-movY)==1)||((y-movY==0&&Math.abs(x-movX)==1))&&Math.abs((Math.abs(x-movX)-Math.abs(y-movY)))==1)||(Math.abs(x-movX)==1&&Math.abs(y-movY)==1)){
			/*b[x][y]=a[x][y];
			a[x][y]=a[movX][movY];
			a[movX][movY]=b[x][y];*/
			a[movX][movY]=a[x][y];
			a[x][y]='8';
			System.out.println(eKx +" mv2 "+eKy);
		}
		else System.out.println("Error");
	}
	
	public static void main(String[] args){
		
		eKy=3;
		printBoard();
	}
	public static void rect(Graphics gr){
		gr.fillRect(25, 25, 15, 15);
		gr.setColor(new Color(250,200,250));
	}
}
