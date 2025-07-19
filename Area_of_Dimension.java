class Area_of_Dimension
	{
	static double circle_area()
	{
	int r = 5;
	final double pi = 3.142;
	double res = pi * r * r;
	
	return res;
	}

	static int square_area()
	{
	int length = 5;
	int width = 8;
	int res = length * width;
	
	return res;
	}
	
	static int parallelogram_area()
	{
	int b = 5;
	int l = 3;
	int res = b * l;
	
	return res;
	}

	static double triangle_area()
	{
	int base = 5;
	int height = 10;
	double res = 0.5 * (base * height);
	
	return res;
	}

	static double trapezoid_area()
	{
	int base = 5;
	int h1 = 3;
	int h2 = 4;
	double res = 0.5 * (base + h1) * h2;
	
	return res;
	}

	static int rectangle_area()
	{
	int w = 5;
	int b = 12;
	
	int res = w * b;
	
	return res;
	}

	static double ellipse_area()
	{
	int a = 5;
	int b = 12;
	final double pi = 3.142;
	
	double res = pi * a * b;
	
	return res;
	
	}

	static double sector_area()
	{
	double t = 50.5;
	int r = 2;
	double res = 0.5 * (t * r * r);
	
	return res;
	}

	public static void main(String[] args){
	
	System.out.println("The area of circle is " + circle_area());
	System.out.println("The area of square is " + square_area());
	System.out.println("The area of parallelogram is " + parallelogram_area());
	System.out.println("The area of triangle is " + triangle_area());
	System.out.println("The area of trapezoid_area is " + trapezoid_area());
	System.out.println("The area of rectangle_area is " + rectangle_area());
	System.out.println("The area of ellipse_area is " + ellipse_area());
	System.out.println("The area of sector_area is " + sector_area());

	
	}
}