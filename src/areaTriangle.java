public class areaTriangle {
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        int x = 0;
        areaTriangle[] t = new areaTriangle[4];
        while(x < 4){
            t[x] = new areaTriangle();
            t[x].height = (x + 1)*2;
            t[x].length = x + 4;
            t[x].setArea();
            System.out.print("Triangle " + x + ", area");
            System.out.println(" = " + t[x].area);
            x+=1;
        }
        int y = x;
        x = 27;
        areaTriangle t5 = t[2];
        t[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }
    void setArea() {
        area = (height * length)/2;
    }

}
