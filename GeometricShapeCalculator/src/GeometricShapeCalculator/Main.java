package GeometricShapeCalculator;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String option = "Options...\n"
                          +"1. Calculate Square Area\n"
                          +"2. Calculate Triangle Area\n"
                          +"3. Calculate Circle Area\n"
                          +"4. Calculate Pentagon Area\n"
                          + "press to exit : q";
        
        while(true) {
            System.out.println(option);
            System.out.print("Please enter which shape will you calculate area : ");
            String shape_type = scanner.nextLine();
            Figure figure = null;
            if (shape_type.equals("q")) {
                System.out.println("You exiting the program...");
                break;
            }
            else if (shape_type.equals("1")){
                System.out.print("Please, enter the edge of the square : ");
                int a = scanner.nextInt();
                scanner.nextLine();
                
                figure = new Square("Square1", a);
                
                figure.calculateArea();
               
            }
            else if (shape_type.equals("2")) {
                
                System.out.print("Please, enter the edge of the triangle1 : ");
                int b1 = scanner.nextInt();
                System.out.print("Please, enter the edge of the triangle2 : ");
                int b2 = scanner.nextInt();
                System.out.print("Please, enter the edge of the triangle3 : ");
                int b3 = scanner.nextInt();
                scanner.nextLine();
                
                
                figure = new Triangle("Triangle 1", b1, b2 ,b3);
                
                figure.calculateArea();
                
            }
            else if (shape_type.equals("3")){
                System.out.print("Please, enter the radius of the circle : " );
                int r = scanner.nextInt();
                scanner.nextLine();
                
                figure = new Circle("Circle 1", r);
                
                figure.calculateArea();
                
            }
            else if (shape_type.equals("4")) {
                
                System.out.print("Please, enter the edge of the pentagon : ");
                int c1 = scanner.nextInt();
                System.out.print("Please, enter the radius of the pentagon : ");
                int c2 = scanner.nextInt();
                scanner.nextLine();
                
                
                figure = new Pentagon("Pentagon 1", c1, c2);
                
                figure.calculateArea();
                }
                
            else {
                System.out.println("The invalid transaction...");
            }
            
            
        }
}}
