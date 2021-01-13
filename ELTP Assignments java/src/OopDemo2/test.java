package OopDemo2;

import OopDemo2.pls.traning.canvas.GameConsole;
import OopDemo2.pls.traning.shapes.circle;
import OopDemo2.pls.traning.shapes.square;
import OopDemo2.pls.traning.shapes.triangle;

public class test {

	public static void main(String[] args) {
		
		GameConsole g=new GameConsole();

		//for circle
		
		g.drawShape(new circle()); //anonymous object
		
		//for triangle
		
		g.drawShape(new triangle());
		
		// for square
		
		g.drawShape(new square());
		
	}

}
