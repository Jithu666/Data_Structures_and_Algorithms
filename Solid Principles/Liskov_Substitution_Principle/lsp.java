package SOLID_Principles.Liskov_Substitution_Principle;

        // Liskov's Substitution Principle

//    Liskov's Substitution principle is a software development principle which states that all the subtypes (sub-classes) should be able to        completely replace the parent types (parent class)

interface shape{
    int getArea();
}

class rectangle implements shape {
    private final int length;
    private final int breadth;

    public rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public int getArea() {
        return length * breadth;
    }
}

class triangle implements shape {
    private final int base;
    private final int height;

    public triangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    @Override
    public int getArea() {
        return (int) (0.5 * base * height);
    }
}

class square implements shape {
    private final int side;

    public square(int side){
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

class getArea {
    public int get_area(shape s){
        return s.getArea();
    }
}

class elc{
    public static void main(String[] args) {

        square s = new square(6);
        triangle t = new triangle(3,5);
        rectangle r = new rectangle(4,6);

        System.out.println("Area of Square : " + s.getArea());
        System.out.println("Area of Triangle : " + t.getArea());
        System.out.println("Area of Rectangle : " + r.getArea());
    }
}
