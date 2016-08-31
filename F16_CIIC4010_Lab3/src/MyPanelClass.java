import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;
		int xPlugin = 25  ;
		int yPlugin =  50 ;

		//Paint the background
		g.setColor(Color.BLACK);
		g.fillRect(x1, y1, width+1, height+1);

		//Draw Rectangle
		g.setColor(Color.WHITE);
		g.fillRect(x1+25, y1+25, 350, 200);

		//Draw Red Stripes
		g.setColor(Color.RED);
		g.fillRect(x1+25, y1+25, 350, 40);                     
		g.fillRect(x1+25, y1+(25+80), 350, 40);                      
		g.fillRect(x1+25, y1+(25+160), 350, 40);

		//Draw Triangle
		g.setColor(Color.BLUE);
		Polygon triangle = new Polygon();                     
		triangle.addPoint(x1+25, y1+25);//upperLeftPoint                     
		triangle.addPoint(x1+25, y1+225);//bottomLeftPoint                       
		triangle.addPoint(x1+150, y1+125);//centerRightPoint
		g.fillPolygon(triangle);
		
		//Draws a second Polygon
		Polygon p2 = new Polygon();
		p2.addPoint(x1 + 25+xPlugin, y1 + 73+yPlugin);                     
		p2.addPoint(x1 + 41+xPlugin, y1 + 73+yPlugin);                       
		p2.addPoint(x1 + 47+xPlugin, y1 + 58+yPlugin);                       
		p2.addPoint(x1 + 53+xPlugin, y1 + 73+yPlugin);                       
		p2.addPoint(x1 + 69+xPlugin, y1 + 73+yPlugin);                        
		p2.addPoint(x1 + 56+xPlugin, y1 + 83+yPlugin);
		p2.addPoint(x1 + 61+xPlugin, y1 + 98+yPlugin);
		p2.addPoint(x1 + 47+xPlugin, y1 + 88+yPlugin);
		p2.addPoint(x1 + 34+xPlugin, y1 + 98+yPlugin);
		p2.addPoint(x1 + 38+xPlugin, y1 + 83+yPlugin);
		g.setColor(Color.WHITE);
		g.fillPolygon(p2);   



		/**            //Draw a border
                       g.setColor(Color.RED);
                       g.drawRect(x1, y1, width, height);

                       //Draw an innerBorder
                       g.setColor(Color.YELLOW);
                       g.drawRect(x1+10, y1+10, width-20, height-20);

                       //Draws a line from leftUpperCorner to rightBottomCorner
                       g.setColor(Color.WHITE);
                       g.drawLine(x1, y1, x2, y2);

                       //Draws second line from rightUpperCorner to leftBottonCorner
                       g.setColor(Color.ORANGE);
                       g.drawLine(x2, y1, x1, y2);

                       //Draws an Oval
                       g.setColor(Color.RED);
                       g.fillOval(65, 50, 55, 55);

                       //Draws a Polygon
                       Polygon p = new Polygon();
                       p.addPoint(x1 + 5, y1 + 25);
                       p.addPoint(x1 + 20, y1 + 10);
                       p.addPoint(x1 + 35, y1 + 25);
                       p.addPoint(x1 + 25, y1 + 25);
                       p.addPoint(x1 + 25, y1 + 45);
                       p.addPoint(x1 + 15, y1 + 45);
                       p.addPoint(x1 + 15, y1 + 25);
                       g.setColor(Color.YELLOW);
                       g.fillPolygon(p);
		 **/
		
	                    

	}
}