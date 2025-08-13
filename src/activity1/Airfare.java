
package activity1;

import java.util.Scanner;

public class Airfare {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        
        System.out.println("Distance km");
        int dt = sc.nextInt();
        
        System.out.println("class");
        int clas = sc.nextInt();
        
        if (clas == 1) {
            int total = dt * 250;
            System.out.println("Total Fare"+total);
        }else{
       
            int total = dt * 500;
            if (dt > 1000){
            int dttotal = (int) (total * 0.10);
            total = (int) (total - dttotal);
                System.out.println("Total fare: "+total);
            }
            
        }
    }
}  
      
        