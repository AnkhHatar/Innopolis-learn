public class Main {                         //Основная ветвь
    public static void main(String[] args) {
        Point a = new Point(5.0, -3.0);
        Point b = new Point(0, 7.0);
        Segment d = new Segment(a, b);
        d.PrintSegment();
        d.CalcSegment();
        System.out.printf("Length of segment = %f", d.segment);
    }
}

public class Point {                  //Определение точки
    public double x;
    public double y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}


public class Segment{                             //Определение отрезка и операций с ним
    public Segment(Point a, Point b){
        this.a = a;
        this.b = b;
    }
    public Point a;
    public Point b;
    
    public double segment;
    public void CalcSegment(){
        segment = Math.sqrt(((b.x-a.x)*(b.x-a.x)) +((b.y-a.y) * ((b.y-a.y))));
    }
    public void PrintSegment(){
     System.out.printf("Segment d is on (a (%.2f,%.2f),b (%.2f,%.2f))\n", a.x,a.y,b.x,b.y);  
    }
}
