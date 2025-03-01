
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class NewClass {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    personnn pe=new personnn(); 
    System.out.println("enter our name: ");
    String name=sc.next();
    System.out.println("enter your age: ");
    int age=sc.nextInt();
    System.out.println("enter your country: ");
    String country=sc.next();
    
    pe.setName(name);
    System.out.println("your name is: "+ pe.getName());
       
    
    pe.setAge(age);
    System.out.println("your age is: "+pe.getAge());
        
    
    pe.setCountry(country);
    System.out.println("your cointry is: "+ pe.getCountry());
        
        
    
    
    
    
    
    
        
        
        
        
    }
    
}
