import java.awt.*;
import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class ComputerGraphics extends Applet {
  public void paint(Graphics g){
	  //scene
	  g.setColor(new Color(228, 218, 186));
	  g.fillRect(0, 0, 282, 179);

	  //House Roof

	 g.setColor(new Color(127, 127, 127));
	  	  int[] xPoints = {96, 142, 142, 101};
	  	  int[] yPoints = {62, 17,29, 67};
	  	  int zPoints = 4;
	  g.fillPolygon(xPoints, yPoints, zPoints);

	  g.setColor(new Color(127, 127, 127));
	  	  	  int[] x1Points = {181, 142, 142, 186};
	  	  	  int[] y1Points = {67, 29,17, 63};
	  	  	  int z1Points = 4;
	  g.fillPolygon(x1Points, y1Points, z1Points);


	 // Top Roof Pillar
      g.drawLine(106,63,106, 90);
      g.setColor(Color.BLACK);
      g.drawLine(177,64,177, 90);
      g.setColor(Color.BLACK);
      g.drawLine(106,90,177, 90);
      g.setColor(Color.BLACK);

   //window
      g.setColor(Color.black);
      g.fillRect(129, 57, 24, 20);
      g.setColor(new Color(112, 146, 190));//light blue
      g.fillRect(131, 58, 10, 19);
      g.setColor(new Color(112, 146, 190));
      g.fillRect(142, 58, 10, 19);
      g.setColor(new Color(72, 0, 0));//dark brown
      g.fillRect(128, 77, 27, 3);


      //Main roof
	  g.setColor(new Color(127, 127, 127));
	  int[] aPoints = {76, 57, 76};
	  int[] bPoints = {78, 108, 108};
	  int cPoints = 3;
	  g.fillPolygon(aPoints, bPoints, cPoints);

	  g.setColor(new Color(127, 127, 127));
	  int[] ePoints = {207, 227, 207};
	  int[] fPoints = {78, 108, 108};
	  int gPoints = 3;
	  g.fillPolygon(ePoints, fPoints, gPoints);

	  // set Color for Down Roof
	  g.setColor(new Color(127, 127, 127));
	  g.fillRect(76, 78, 131, 29);


	  //front roof
	  g.setColor(new Color(200, 191, 231));
	  int[] iPoints = {98, 106, 106};
	  int[] jPoints = {102, 88, 102};
	  int kPoints = 3;
	  g.fillPolygon(iPoints, jPoints, kPoints);

	    g.setColor(new Color(200, 191, 231));
	  	int[] lPoints = {186, 177, 177};
	  	int[] mPoints = {102, 88, 102};
	  	int nPoints = 3;
	  	g.fillPolygon(lPoints, mPoints, nPoints);

	  	g.setColor(new Color(200, 191, 231));
        g.fillRect(106, 88, 71, 14);

        //House front
		g.setColor(Color.white);
        g.fillRect(106, 102, 71, 79);

         //House door
		 g.setColor(Color.black);
		 g.fillRect(114, 111, 22, 41);


		 g.setColor(new Color(185, 122, 87));//light brown
		 g.fillRect(116, 113, 18, 37);

		//window
		 g.setColor(Color.black);
		 g.fillRect(147, 111, 21, 17);
	     g.setColor(new Color(112, 146, 190));//light blue
		 g.fillRect(149, 112, 8, 16);
		 g.setColor(new Color(112, 146, 190));
		 g.fillRect(158, 112, 8, 16);
		 g.setColor(new Color(72, 0, 0));//dark brown
         g.fillRect(144, 128, 27, 3);


       //Left side of Main House
		g.setColor(Color.white);
        g.fillRect(67, 107, 38, 45);

        //window at left side
        g.setColor(new Color(86, 53, 35));
		g.fillRect(72, 111, 26, 3);

		g.setColor(Color.black);
		g.fillRect(72, 117, 27, 27);

		g.setColor(new Color(112, 146, 190));//light blue
		g.fillRect(74, 117, 11, 11);

		g.setColor(new Color(112, 146, 190));
		g.fillRect(88, 117, 11, 11);

		g.setColor(new Color(112, 146, 190));
		g.fillRect(74, 132, 11, 10);

		g.setColor(new Color(112, 146, 190));
		g.fillRect(88, 132, 9, 10);


       //Right side of Main House
		g.setColor(Color.white);
        g.fillRect(179, 108, 37, 43);

        g.setColor(new Color(86, 53, 35));
		g.fillRect(183, 112, 28, 3);

        //window at right side
        g.setColor(Color.black);
		g.fillRect(184, 117, 27, 27);

	    g.setColor(new Color(112, 146, 190));//light blue
		g.fillRect(185, 117, 10, 11);

		g.setColor(new Color(112, 146, 190));//light blue
		g.fillRect(198, 117, 11, 11);

		g.setColor(new Color(112, 146, 190));//light blue
		g.fillRect(185, 132, 11, 10);

		g.setColor(new Color(112, 146, 190));//light blue
		g.fillRect(199, 132, 10, 10);

      //Bars at House Front
		g.setColor(new Color(86, 53, 35));// Deep Brown
		g.fillRect(106, 151, 71, 5);

		g.setColor(new Color(86, 53, 35));// Deep Brown
		g.fillRect(178, 151, 38, 5);

		g.setColor(new Color(86, 53, 35));// Deep Brown
		g.fillRect(68, 151, 38, 5);

	    g.setColor(new Color(86, 53, 35));// Deep Brown
		g.fillRect(217, 146, 7, 10);

		g.setColor(new Color(86, 53, 35));// Deep Brown
		g.fillRect(217, 138, 7, 8);

		g.setColor(new Color(86, 53, 35));// Deep Brown
		g.fillRect(57, 138, 6, 18);


		   //Trees
		g.setColor(new Color(181,230,29)); //Light Green
		int[] oPoints = {74, 59, 95};
		int[] pPoints = {139, 157, 157};
		int qPoints = 3;
	  	g.fillPolygon(oPoints, pPoints, qPoints);

	  	//Left Tree
	  	g.setColor(new Color(181,230,29)); //Light Green
		int[] rPoints = {57, 44, 66};
		int[] sPoints = {108, 138, 138};
		int tPoints = 3;
	  	g.fillPolygon(rPoints, sPoints, tPoints);

	    //Right Tree
	    g.setColor(new Color(181,230,29)); //Light Green
	    int[] uPoints = {223, 211, 235};
		int[] vPoints = {107, 137, 137};
		int wPoints = 3;
	  	g.fillPolygon(uPoints, vPoints, wPoints);

	  	//Ground Floor
	    g.setColor(new Color(227, 209, 121));// Light Brown
	    g.fillRect(43, 158, 52, 10);

	    g.setColor(new Color(227, 209, 121));// Light Brown
	    g.fillRect(95, 158, 144, 10);

  }
  }