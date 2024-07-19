package _99_extra.pong;

import java.util.Random;
import processing.core.PApplet;
import java.awt.event.KeyEvent;

public class Pong extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	Random ran = new Random();
	Random gen =new Random ();

	
	@Override
	public void settings() {
		size(WIDTH, HEIGHT);

	}

	@Override
	public void setup() {

	}
	int ballx = gen.nextInt(760)+20;
	int bally = gen.nextInt(400)+20;
	int xSpeed = 2;
	int ySpeed = 2;
	int xSpeedtoo = 3;
	int ySpeedtoo = 3;
	int ellipseX = ballx;
	int ellipseY = bally;
	int ellipsex = 400;
	int ellipsey = 300;

	int touchCount = 0;
	boolean ballSpeed2 = false;
	boolean ballSpeed3 = false;
	boolean ballSpeed4 = false;
	boolean ballSpeed5 = false;
	boolean ballSpeed6 = false;
	boolean ballSpeed7 = false;
	boolean ballTwoSpeed4 = false;
	boolean ballTwoSpeed5 = false;
	boolean ballTwoSpeed6 = false;
	boolean ballTwoSpeed7 = false;
	boolean checkOne = true;
	boolean checkTwo = true;

	@Override

	public void draw() {
		background(120, 120, 120);
		fill(200,200,200);
		textSize(40);
	text(touchCount, 30,30);
		
		if (checkOne) {
		System.out.println(ballx);
		checkOne = false;
		} 
		
		
		if (checkTwo) {
			System.out.println(bally);
			checkTwo = false;
			} 
		if (mousePressed) {
		println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " +
		 mouseY + "\n");
 }
		
		if (ellipseX > WIDTH) {
			xSpeed = -xSpeed;
			System.out.println("a");

		}
		if (ellipseX < 0) {
			xSpeed = -xSpeed;
			System.out.println("ahh");	
		}
			if (ellipseY < 0) {
				System.out.println("b");
				ySpeed = -ySpeed;
			}
			if (ellipseY > HEIGHT) {
				System.out.println("you lost");
				System.exit(0);
			}
			
			
			
			if (ellipsex > WIDTH) {
				xSpeedtoo = -xSpeedtoo;
			}
			if (ellipsex < 0) {
				xSpeedtoo = -xSpeedtoo;

			}
			if (ellipsex < WIDTH) {
				xSpeedtoo = -xSpeedtoo;				

			}
			if (ellipsey > HEIGHT) {
				if (touchCount < 101) {
					ySpeedtoo = -ySpeedtoo;
				} else {
					System.out.println("you lost too");
					System.exit(0);
				}
			}
			

			// in draw method
			
			fill(0, 0, 200);
			stroke(0, 0, 200);
			int rectX = mouseX-50;
			int rectY = 560;
			rect(rectX, rectY, 100, 30);
			 if(ellipseX < rectX + 100 && ellipseX > rectX && ellipseY < rectY + 30 && ellipseY > rectY ){
				 ySpeed = -ySpeed;
			touchCount++;
			 }
			 if(ellipsex < rectX + 100 && ellipsex > rectX && ellipsey < rectY + 30 && ellipseY > rectY ){
				 ySpeedtoo = -ySpeedtoo;
				 touchCount++;
				 }
			 
		

			fill(200, 200, 0); // in draw method
			stroke(200, 200, 0); // in draw method
			ellipseX += xSpeed;
			ellipseY += ySpeed;

			ellipse(ellipseX, ellipseY, 20, 20);// first circle
			ellipsex += xSpeedtoo;
			ellipsey += ySpeedtoo;

			if (touchCount >= 100) {
				ellipse(ellipsex, ellipsey, 20, 20);// second circle
		}
		
			if (touchCount >= 2 && touchCount < 4 && ballSpeed2 == false) {
				if(xSpeed < 0) {
				xSpeed = -2;
				ySpeed = -2;
				}
				if(xSpeed > 0) {
					xSpeed = 2;
					ySpeed = 2;
					}
				System.out.println("ball one speed " + xSpeed);
				ballSpeed2 = true;
			}

			if (touchCount >= 5 && touchCount < 14 && ballSpeed3 == false) {
				if(xSpeed < 0) {
					xSpeed = -3;
					ySpeed = -3;
					}
				if(xSpeed > 0) {
				xSpeed = 3;
				ySpeed = 3;
				}
				println("ball one speed " + xSpeed);
				ballSpeed3 = true;
			}
			if (touchCount >= 15 && touchCount < 29 && ballSpeed4 == false) {
				if(xSpeed < 0) {
				xSpeed = -4;
				ySpeed = -4;
				}
				if(xSpeed > 0) {
					xSpeed = 4;
					ySpeed = 4;
				}
				println("ball one speed " + xSpeed);
				ballSpeed4 = true;
			}
			if (touchCount >= 30 && touchCount < 49 && ballSpeed5 == false) {
				if(xSpeed < 0) {
				xSpeed = -5;
				ySpeed = -5;
				}
				if(xSpeed > 0) {
					xSpeed = 5;
					ySpeed = 5;
					}
				println("ball one speed " + xSpeed);
				ballSpeed5 = true;
			}
			if (touchCount >= 50 && touchCount < 74 && ballSpeed6 == false) {
				if(xSpeed < 0) {
				xSpeed = -6;
				ySpeed = -6;
				}
				if(xSpeed > 0) {
					xSpeed = 6;
					ySpeed = 6;
					}
				println("ball one speed " + xSpeed);
				ballSpeed6 = true;
			}
			if (touchCount >= 75 && touchCount < 169 && ballSpeed7 == false) {
				if(xSpeed < 0) {
				xSpeed = -7;
				ySpeed = -7;
				}
				if(xSpeed > 0) {
					xSpeed = 7;
					ySpeed = 7;
					}
				println("ball one speed " + xSpeed);
				ballSpeed7 = true;
			}
			if (touchCount >= 170 && touchCount < 209 && ballTwoSpeed4 == false) {
				if(xSpeedtoo > 0) {
				xSpeedtoo = 4;
				ySpeedtoo = 4;
				}
				if(xSpeedtoo < 0) {
					xSpeedtoo = -4;
					ySpeedtoo = -4;
					}
				println("ball two speed " + xSpeedtoo);
				ballTwoSpeed4 = true;
			}
			if (touchCount >= 210 && touchCount < 249 && ballTwoSpeed5 == false) {
				if(xSpeedtoo > 0) {
					xSpeedtoo = 5;
					ySpeedtoo = 5;
					}
				if(xSpeedtoo < 0) {
					xSpeedtoo = -5;
					ySpeedtoo = -5;
					}
				println("ball two speed " + xSpeedtoo);
				ballTwoSpeed5 = true;
			}
			if (touchCount >= 250 && touchCount < 299 && ballTwoSpeed6 == false) {
				if(xSpeedtoo > 0) {
				xSpeedtoo = 6;
				ySpeedtoo = 6;
				}
				if(xSpeedtoo < 0) {
					xSpeedtoo = -6;
					ySpeedtoo = -6;
					}
				println("ball two speed " + xSpeedtoo);
				ballTwoSpeed6 = true;
			}
			if (touchCount >= 300 && ballTwoSpeed7 == false) {
				if(xSpeedtoo > 0) {
				xSpeedtoo = 7;
				ySpeedtoo = 7;
				}
				if(xSpeedtoo < 0) {
					xSpeedtoo = -7;
					ySpeedtoo = -7;
					}
				println("ball two speed " + xSpeedtoo);
				ballTwoSpeed7 = true;
			}
			fill(110, 0, 0);
			stroke(110, 0, 0);
		
	}

	

	public static void main(String[] args) {
		PApplet.main(Pong.class.getName());

	}
}