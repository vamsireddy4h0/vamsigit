abstract class Shape{ 
abstract double area();
public void setcolor(String color) {
System.out.println(color);
}
}
class Circle extends Shape {
int r=4; public double area() { 
return 3.14*r*r 
} 
} class Square extends Shape{
public double area() { 
return 4.0*4.0 
} 
}
Class AbstractDemo{
public static void main(String[] args) { 
Shape c=new Circle();
System.out.println(c.setcolor("red")+" "+c.area());
 Shape s=new Square();
 System.out.println(setcolor("red") + "  "+s.area()); } }
