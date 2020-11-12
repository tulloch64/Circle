public class Circle {
	/* Define the attribute radius below.*/
	private double radius;



	/**
	 * Construct a new Circle object.
	 */
	public  Circle(double radius)
	{ if(radius>0)
		this.radius = radius;
	else this.radius=0;
	System.out.printf("circle radius = %.2f %n" , radius);

	}


	/**
	 * Get the current radius of the circle.
	 */
	public double getRadius(){

		return this.radius;
	}


	/**
	 * Set the radius to a new value.
	 */
	public  void setRadius(double radius){
		this.radius =radius;

	}


	/**
	 * Calculate the area of the circle.
	 */
	public double area(){

		double area = Math.PI * this.radius * this.radius;
		System.out.printf("circle area = %.2f %n" , area);
		return area;

	}


	/**
	 * Calculate the circumference of the circle.
	 */
	public double circumference(){
		double circumference = 2* Math.PI * this.radius;
		System.out.printf("circle circumference = %.2f %n" , circumference);
		return circumference;

	}

	/**
	 *  main method
	 */
	public static void main(String[]args){

		Circle big= new Circle (2.0); 
		big.area();
		double c = big.circumference();

		big.setRadius(5.50);

		System.out.printf("circle radius = %.2f %n" , big.getRadius());


		double area1 = Math.PI * 5.50 * 5.50;
		System.out.printf("circle area = %.2f %n" , area1);

		double circumference1 = 2* Math.PI * 5.50;
		System.out.printf("circle circumference = %.2f %n" , circumference1);

		double R=0;
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter a radius: ");
		R = input.nextDouble();

		double radius = R;
		double area= Math.PI * R * R;
		double circumference = 2 * Math.PI * R;


		if(R==0) {
			System.out.printf("circle radius = %.2f %n" , radius );
			System.out.printf("circle area = %.2f %n" , area);
			System.out.printf("circle circumference = %.2f %n" , circumference);
		}
		else if(R>0) {
			System.out.printf("circle radius = %.2f %n" , radius );
			System.out.printf("circle area = %.2f %n" , area);
			System.out.printf("circle circumference = %.2f %n" , circumference);
		}

		else {
			System.out.printf("circle radius = %.2f %n" , 0.0 );
			System.out.printf("circle area = %.2f %n" , 0.0);
			System.out.printf("circle circumference = %.2f %n" , 0.0);
		}
	}






}
