class Demo1 {
    // Area of a square
    double sqcArea() {
        int r = 8;
        return r * r;
    }
    
    // Area of a triangle (0.5 * base * height)
    double triangleArea() {
        int base = 10, height = 5;
        return 0.5 * base * height;
    }
    
    // Area of a parallelogram (base * height)
    double parallelogramArea() {
        int base = 12, height = 6;
        return base * height;
    }
    
    // Area of a rectangle (length * breadth)
    double rectangleArea() {
        int length = 15, breadth = 7;
        return length * breadth;
    }
    
    // Area of a sector (0.5 * r^2 * theta), assuming theta in radians
    double sectorArea() {
        int r = 5;
        double theta = Math.PI / 4; // 45 degrees in radians
        return 0.5 * r * r * theta;
    }
    
    // Area of a trapezoid (0.5 * (base1 + base2) * height)
    double trapezoidArea() {
        int base1 = 10, base2 = 6, height = 4;
        return 0.5 * (base1 + base2) * height;
    }
    
    // Area of an ellipse (pi * a * b)
    double ellipseArea() {
        int a = 7, b = 5;
        return Math.PI * a * b;
    }
    
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        
        System.out.println("Square Area: " + d1.sqcArea());
        System.out.println("Triangle Area: " + d1.triangleArea());
        System.out.println("Parallelogram Area: " + d1.parallelogramArea());
        System.out.println("Rectangle Area: " + d1.rectangleArea());
        System.out.println("Sector Area: " + d1.sectorArea());
        System.out.println("Trapezoid Area: " + d1.trapezoidArea());
        System.out.println("Ellipse Area: " + d1.ellipseArea());
    }
}
