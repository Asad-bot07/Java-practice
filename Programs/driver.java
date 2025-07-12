/*
 * Take two interface A and B 
 * A should have two methods name perimeter and area
 * B should have a single method name diagnol
 * Create two classes name Rectangle and Square
 */
interface A2 {
    void perimeter();

    void area();
}

interface B2 {
    void diagnol();
}

class Interface6Rectangle implements A2, B2 {
    int a, b;

    Interface6Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle is : " + 2 * (a + b));
    }

    public void area() {
        System.out.println("Area of Rectangle is : " + (a * b));
    }

    public void diagnol() {
        System.out.println("Diagnal of Rectangle is : " + Math.sqrt((Math.pow(a, 2)) + Math.pow(b, 2)));
    }
}

class Interface6Square implements A2, B2 {
    int sides;

    Interface6Square(int sides) {
        this.sides = sides;
    }

    public void perimeter() {
        System.out.println("Perimeter of Square is : " + (4 * sides));
    }

    public void area() {
        System.out.println("Area of Square is : " + Math.pow(sides, 2));
    }

    public void diagnol() {
        System.out.println("Diagnal of Square is : " + (sides * Math.sqrt(2)));
    }
}

class driver {
    public static void main(String[] args) {
        Interface6Rectangle ob = new Interface6Rectangle(6, 8);
        Interface6Square ob1 = new Interface6Square(5);
        ob.perimeter();
        ob.area();
        ob.diagnol();
        ob1.perimeter();
        ob1.area();
        ob1.diagnol();
    }
}
