public class Main {                                             //Основная ветвь
    public static void main(String[] args) {
        Point a = new Point(4,-6);
        Point b = new Point(0,7);
        Segment d = new Segment(a, b);
        d.PrintSegment();
        d.CalcSegment();
        System.out.printf("Length of segment = %f", d.segment);
    }
}

public class Point {                                             //Определение точки  
    public double x;
    public double y;
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}


public class Segment{                                           //Определение отрезка и операций с ним
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
     System.out.printf("Segment d is on (a (%.2f,%.2f), b (%.2f,%.2f))\n", a.x,a.y,b.x,b.y);  
    }
}  



//Второй вариант исполнения
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Point a = new Point (-6,5);
        Point b = new Point (0,2);
        Segment c = new Segment (a,b);
        c.printSegment();
        c.calcSegment();
    }
}
public class Point {
    public double x;
    public double y;
    public Point (double x,double y){
        this.x = x;
        this.y = y;
    }
}
public class Segment {
    public Segment (Point a, Point b){
    this.a = a;
    this.b = b;
    }
    public Point a;
    public Point b;
    public double segment;
    public void printSegment(){
        System.out.printf("Segment is on ( a(%.1f, %.1f), b(%.1f, %.1f)\n", a.x, a.y, b.x,b.y);
    }
    public void calcSegment(){
        segment = Math.sqrt(((b.x-a.x)*(b.x-a.x)) +((b.y-a.y) * ((b.y-a.y))));
        System.out.println(segment);
    }
}
