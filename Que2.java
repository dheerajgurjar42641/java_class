class Que2 {
// Area of rectangle
    int length, breadth;

    int area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;

        System.out.println(r.area());
    }
}
