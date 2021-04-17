//TURTLE GRAPHICS - COMPUTER PROGRAMMING SPRING 2013 FINAL PROJECT

import java.util.Scanner;

public class TurtleGraphics {
		public char grid[][];
		int row=25, column=50;
		boolean go=true;

public TurtleGraphics(){
	new Scanner(System.in);
	grid=new char[50][100];
	for(int i=0; i<50; i++){
		for(int j=0; j<100; j++){
			grid[i][j]='.';
		}		
		grid[25][50]='#';
	}
}

public void move(){
	
		Scanner in=new Scanner(System.in);
		{
			char move=' ';
			while(go){
			move=in.next().charAt(0);
			switch(move){
			case 'h':{
				menu();
			}
			break;
			
			case 'w':{
				up();
			}
			break;
			
			case 's':{
				down();
			}
			break;
			
			case 'a':{
				left();
			}
			break;
			
			case 'd':{
				right();
			}
			case 'e':{
				upright();
			}
			break;
			case 'z':{
				downleft();
			}
			break;
			case 'c':{
				downright();
			}
			break;
			case 'q':{
				upleft();
			}
			break;
			case 'b':{
				square();
			}
			break;
			case 't':{
				triangle();
			}
			case 'j':{
				octagon();
			}
			break;
			case 'r':{
				rose();
			}
			case 'x':{
				clearscreen();
			}
			break;
			case 'o':{
				exit();
			}
			break;
			}	
		}
	}
	
}
public void menu(){	
		System.out.println("To move up press 'w'");
		System.out.println("To move down press 's'");
		System.out.println("To move left press 'a'");
		System.out.println("To move right press 'd'");
		System.out.println("To make a square press 'b'");
		System.out.println("To make a triangle press 't'");
		System.out.println("To make a octagon press 'j'");
		System.out.println("To make a rose press 'r'");
		System.out.println("To clear screen press 'x'");
		System.out.println("NOTE: You must make a move before the screen clears its previous data.");
		System.out.println("To exit press 'e'");
}
public void up(){
	if(row!=0){
		grid[row][column]='*';
		row--;
		grid[row][column]='#';
		print();
	}
}
public void down(){
	if(row!=49){
		grid[row][column]='*';
		row++;
		grid[row][column]='#';
		print();
	}
}
public void right(){
	if(column!=99){
		grid[row][column]='*';
		column++;
		grid[row][column]='#';
		print();
	}	
}
public void left(){
	if(column!=0){
		grid[row][column]='*';
		column--;
		grid[row][column]='#';
		print();
	}
}
public void	upright(){
	if(row!=99){
		grid[row][column]='*';
		row--;
		column++;
		grid[row][column]='#';
		print();
	}	
}

public void	downleft(){
	if(column!=0 && row!=0){
		grid[row][column]='*';
		column--;
		row++;
		grid[row][column]='#';
		print();
	}
}

public void	downright(){
	if(row!=0){
		grid[row][column]='*';
		row++;
		column++;
		grid[row][column]='#';
		print();
	}	
}

public void	upleft(){
	if(column!=0){
		grid[row][column]='*';
		column--;
		row--;
		grid[row][column]='#';
		print();
	}
}
public void square(){
	Scanner in=new Scanner(System.in);
	System.out.println("You wish to make a square. Enter a side length:");
	int ans=in.nextInt();
	for(int a=25, b=50; a<25+ans && b<50+ans; a++){grid[a][b]='*';}
	for(int c=25, d=50; c<25+ans && d<50+ans; d++){grid[c][d]='*';}
	for(int e=25+ans, f=50+ans; e>=25 && f>=50; f--){grid[e][f]='*';}
	for(int g=25+ans, h=50+ans; g>=25 && h>=50; g--){grid[g][h]='*';}

	print();
}
public void triangle(){
	Scanner in=new Scanner(System.in);
	System.out.println("You wish to make a triangle. Enter the desired height:");
	int height=in.nextInt();
	for(int a=25, b=50; a<25+height && b<50+height; a++, b++){grid[a][b]='*';}
	for(int c=25, d=50; c<25+height && d<50+height; c++, d--){grid[c][d]='*';}
	for(int e=25+height, f=50+height; e>=25 && f>=40; f--){grid[e][f]='*';}

	print();
}
public void octagon(){
	d(); d(); d(); d(); d();
	c(); c(); c(); c(); c();
	s(); s(); s(); s(); s();
	z(); z(); z(); z(); z(); 
	a(); a(); a(); a(); a();
	q(); q(); q(); q(); q();
	w(); w(); w(); w(); w();
	e(); e(); e(); e(); e();
		
	print();
}
public void rose(){
	w(); e(); w(); q(); w(); d(); w(); q(); e(); d(); c(); e(); d(); e(); d(); s();
	d(); s(); z(); s(); z(); c(); s(); z(); q(); a(); s(); z(); q(); a(); z(); a();
	d(); c(); d(); e(); c(); s(); d(); e(); c(); s(); z(); c(); s(); c(); s(); a();
	s(); a(); q(); a(); q(); z(); a(); q(); e(); w(); a(); q(); e(); w(); q(); w();
	a(); q(); a(); z(); q(); w(); a(); z(); q(); w(); e(); q(); w(); q(); w(); d();
	w(); d(); c(); d(); c(); e(); d(); c(); z(); s(); d(); c(); z(); s(); c(); s(); 
	s(); z(); s(); c(); z(); a(); s(); c(); z(); a(); q(); z(); a(); z(); a(); w();
	a(); w(); e(); w(); e(); q(); w(); e(); c(); d(); w(); e(); c(); d(); e(); d();	
	
	print();
}
public void w(){
	grid[row][column]='*';
	row--;
	grid[row][column]='#';
}
public void s(){
	grid[row][column]='*';
	row++;
	grid[row][column]='#';
}
public void d(){
	grid[row][column]='*';
	column++;
	grid[row][column]='#';
}
public void a(){
	grid[row][column]='*';
	column--;
	grid[row][column]='#';
}
public void q(){
	grid[row][column]='*';
	column--;
	row--;
	grid[row][column]='#';
}
public void e(){
	grid[row][column]='*';
	row--;
	column++;
	grid[row][column]='#';
}
public void c(){
	grid[row][column]='*';
	row++;
	column++;
	grid[row][column]='#';
}
public void z(){
	grid[row][column]='*';
	column--;
	row++;
	grid[row][column]='#';
}
public void clearscreen(){
	new Scanner(System.in);
	grid=new char[50][100];
	for(int i=0; i<50; i++){
		for(int j=0; j<100; j++){
			grid[i][j]='.';
		}		
				
	}
}
public void exit(){
	System.out.println("GAME OVER!");
	go=false;
}
public void print(){
	for(int m=0; m<50; m++){
		for(int n=0; n<100; n++){
			System.out.print(grid[m][n]);
			}
		System.out.println();
	}
	
	System.out.println("Press 'h' for key commands");
	move();
}

	public static void main(String[] args) {
		System.out.println("IN THE BEGINNING, THERE WAS NOTHING...");
		System.out.println("THEN THEIR WERE TURTLE GRAPHICS!!!!");
		System.out.println("(enter 42 to proceed)");
		Scanner in=new Scanner(System.in);
		int life=in.nextInt();
		if(life==42){
			TurtleGraphics turtle=new TurtleGraphics();
			turtle.print();
			turtle.move();
		}
		
		System.out.println("You failed the test of life.");
	}

}
