
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lunatic
 */
class Areas
{
    void area(float radii)
    {
        float are=(float) (3.14*radii*radii);
        System.out.print("area of circle is : "+are);
        System.out.println();
    }
    
    void area(int s)
    {
        int sq=s*s;
        System.out.print("area of square is : "+sq);
        System.out.println();
    }
    
    void area(int w, int h)
    {
        int rect=w*h;
        System.out.print("area of rectangle is : "+rect);
        System.out.println();
    }
    
    
}




public class Shapes {
    
    public static void main(String []args)
    {
        Areas a=new Areas();
        Scanner sc= new Scanner(System.in);
        System.out.println("Which plane shapes area you want to calculate:\na.circle(type c)\nb.square(type s)\nc.rectangle(type r)");
        String b=sc.next();
        char bi=b.charAt(0);
        switch(bi)
        {
            case 'c':
                System.out.println("Enter radius of circle: ");
                float radii=sc.nextFloat();
                a.area(radii);
                break;
            
            case 's':
                System.out.println("Enter side of square: ");
                int side=sc.nextInt();
                a.area(side);
                break;
            
             case 'r':
                System.out.println("Enter width of rectangle: ");
                int w=sc.nextInt();
                System.out.println("Enter height of rectangle: ");
                int h=sc.nextInt();
                a.area(w,h);
                break;
            
             
            default:
                System.out.println("this is figure is not a plane shape");
        }
        
        
        
    }
    
}
