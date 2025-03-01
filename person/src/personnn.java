/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class personnn {

private String Name;
private int Age;
private String Country;

public void setName(String n){
Name=n;
} 

public String getName(){
return Name;    
}


public void setAge(int a){
    
if(Age<=0){
System.out.println("Erorr");
}else{
Age=a;    
} 
    

}

public int getAge(){
return Age;
}

public void setCountry(String c){
Country=c;
}

public String getCountry(){
return Country;
}
}
