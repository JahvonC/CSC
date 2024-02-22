//Program Name:        GeometryCalculator.java

//Author:                 Jahvon Capel

//Class:                   CSC 110AB

//Date Written:             1/12/24     

//Brief Description:        This program allows the user to select from am option of 4 different calculations and get results back based on choice.

 //Description of inputs:   1 input for type of calculation, then 1 - 2 inputs depending on choice.    

//Description of outputs:   Outputs will display the area or volume of chosen shape, or an error message if invalid data is input.




package geometryCalculator;

import java.util.Scanner;

public class GeometryCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Select an option to get started.");
		System.out.println("");
		System.out.println("1.   Calculate the area of a Circle");
		System.out.println("2.   Calculate the area of a Rectangle");
		System.out.println("3.   Calculate the area of a Triangle");
		System.out.println("4.   Calculate the volume of a cylinder");
		System.out.println("");
		
		
		
		System.out.print("Enter your choice (1-4):  ");
		int userChoice;
		userChoice = input.nextInt();
		
		
		
		
		
		
		switch(userChoice) {
		
		    case 1:
		    	double radius;
		    	double areaOfCircle;
		    	System.out.print("Enter circles radius:  ");
		    	radius = input.nextDouble();
		    	if (radius < 0) {
		    		System.out.println("Invalid Number");
		    		break;
		    	}
		    	areaOfCircle = Math.PI * (Math.pow(radius, 2));
		    	System.out.printf("The area is %.3f\n", areaOfCircle);
		    	System.out.println("Thank for using Geometry Calculator!");
		          break;
		   
		    case 2:
		    	double rectLength;
		    	double rectWidth;
		    	double areaOfRect;
		    	System.out.print("Enter rectangles length: ");
		    	rectLength = input.nextDouble();
		    	System.out.print("Enter rectangles width: ");
		    	rectWidth = input.nextDouble();
		    	if (rectLength < 0 || rectWidth < 0) {
		    		System.out.println("Negative lenght or width. Try again");
		    		break;
		    	}
		    	areaOfRect =  rectLength * rectWidth;
		    	System.out.printf("The area is %.3f\n" , areaOfRect);
		    	System.out.println("Thank for using Geometry Calculator!");
		          break;
		  
		    case 3:
		    	double base;
		    	double height;
		    	double areaOfTriangle;
		    	System.out.print("Enter base of triangle: ");
		    	base = input.nextDouble();
		    	System.out.print("Enter height of triangle: ");
		    	height = input.nextDouble();
		    	if (base < 0 || height < 0) {
		    		System.out.println("Invalid entry");
		    		break;
		    	}
		    	areaOfTriangle = ((0.5) * (base)) * height;
		    	System.out.printf("The area is %.3f\n" , areaOfTriangle);
		    	System.out.println("Thank for using Geometry Calculator!");
		          break;
		   
		    case 4:
		    	double cylinderRadius;
		    	double cylinderHeight;
		    	double volumeOfCylinder;
		    	System.out.print("Enter radius of cylinder: ");
		    	cylinderRadius = input.nextDouble();
		    	System.out.print("Enter height of cylinder: ");
		        cylinderHeight = input.nextDouble();
		        if (cylinderRadius < 0 || cylinderHeight < 0 ) {
		        	System.out.println("Invalid entry");
		        	break;
		        }
		        volumeOfCylinder = (Math.PI) * (Math.pow(cylinderRadius, 2)) * (cylinderHeight);
		        System.out.printf("The volume is %.3f\n" , volumeOfCylinder );
		    	System.out.println("Thank for using Geometry Calculator!");
		          break;
		   
		    default:
		    	 System.out.println("Invalid Choice. You may only enter 1, 2, 3, or 4");
		    	 break;
		
		}
		
		
	}
	
	
	
	/* OUTPUTS
	
	       
	   
	   1.)
	        
				Select an option to get started.
			
			1.   Calculate the area of a Circle
			2.   Calculate the area of a Rectangle
			3.   Calculate the area of a Triangle
			4.   Calculate the volume of a cylinder
			
			Enter your choice (1-4):  1
			Enter circles radius:  3.7
			The area is 43.008
			Thank for using Geometry Calculator!

	________________________________________________________
	
	2.)
				Select an option to get started.
			
			1.   Calculate the area of a Circle
			2.   Calculate the area of a Rectangle
			3.   Calculate the area of a Triangle
			4.   Calculate the volume of a cylinder
			
			Enter your choice (1-4):  2
			Enter rectangles length: 5.5
			Enter rectangles width: 3
			The area is 16.500
			Thank for using Geometry Calculator!

	_________________________________________________________
	
	3.)
				Select an option to get started.
			
			1.   Calculate the area of a Circle
			2.   Calculate the area of a Rectangle
			3.   Calculate the area of a Triangle
			4.   Calculate the volume of a cylinder
			
			Enter your choice (1-4):  4
			Enter radius of cylinder: 3.5
			Enter height of cylinder: 8
			The volume is 307.876
			Thank for using Geometry Calculator!

	_________________________________________________________
	
	4.)
			Select an option to get started.
		
		1.   Calculate the area of a Circle
		2.   Calculate the area of a Rectangle
		3.   Calculate the area of a Triangle
		4.   Calculate the volume of a cylinder
		
		Enter your choice (1-4):  9
		Invalid Choice. You may only enter 1, 2, 3, or 4
		
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 */
	
	
}
