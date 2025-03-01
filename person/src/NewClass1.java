
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class NewClass1 {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    Desktop de=new Desktop();
    System.out.println("Enter the brand: ");
    String brand=sc.next();
    System.out.println("Enter the processor: ");
    String processor=sc.next();
    System.out.println("Enter the ram size: ");
    int ram=sc.nextInt();
    
    de.setBrand(brand);
    System.out.println(de.getBrand());
    
    de.setprocessor(processor);
    System.out.println(de.getprocessor());
    
    de.setramSize(ram);
    System.out.println(de.getramSize());
    
    
    int res=de.upgradeRam(4);
    
    
    System.out.println("upgrade ram: "+ res); 
    
    
    
    
        
        
        
        
    }
}
