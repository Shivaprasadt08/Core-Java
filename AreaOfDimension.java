class AreaOfDimension {
    static double circle_area(int r) {
        final double pi = 3.142;
        return pi * r * r;
    }

    static int square_area(int length, int width) {
        return length * width;
    }

    static int parallelogram_area(int b, int l) {
        return b * l;
    }

    static double triangle_area(int base, int height) {
        return 0.5 * base * height;
    }

    static double trapezoid_area(int base, int h1, int h2) {
        return 0.5 * (base + h1) * h2;
    }

    static int rectangle_area(int w, int b) {
        return w * b;
    }

    static double ellipse_area(int a, int b) {
        final double pi = 3.142;
        return pi * a * b;
    }

    static double sector_area(double t, int r) {
        return 0.5 * t * r * r;
    }

    public static void main(String[] args) {
        System.out.println("The area of circle is " + circle_area(5));
        System.out.println("The area of square is " + square_area(5, 8));
        System.out.println("The area of parallelogram is " + parallelogram_area(5, 3));
        System.out.println("The area of triangle is " + triangle_area(5, 10));
        System.out.println("The area of trapezoid is " + trapezoid_area(5, 3, 4));
        System.out.println("The area of rectangle is " + rectangle_area(5, 12));
        System.out.println("The area of ellipse is " + ellipse_area(5, 12));
        System.out.println("The area of sector is " + sector_area(50.5, 2));
    }
}