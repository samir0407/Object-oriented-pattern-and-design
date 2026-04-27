class Circle {
private double radius ;

public Circle (double radius){
this.radius=radius;
}

public void getArea(){
double Area=3.1416*radius*radius;
System.out.println("The Area of the circle is: "+Area);

   }
}

public class IT240007{
public static void main(String[] args){

double radius = Double.parseDouble(args[0]);
Circle c = new Circle(radius);
c.getArea();

    }
}