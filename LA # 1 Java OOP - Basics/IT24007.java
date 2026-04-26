class Vehicle{
    //Taking two private variable
    private String brand;
    private String color;
    //Public Constractor
    public Vehicle(String brand, String color){
        this.brand = brand;
        this.color = color;
    }
    //Public method
    public void Drive(){
        System.out.println("Vehicle Brand : "+ brand);
        System.out.println("Vehicle Color : "+ color);
        System.out.println("Vehicle is starting.....");
    }
}
public class IT24007 {
    //Main Class
    public static void main(String[] args) {
        //Command Line Input
        for(int i = 0; i < args.length; i++) {
            Vehicle v2 = new Vehicle(args[i], args[++i]);
            v2.Drive();
        }
    }
}