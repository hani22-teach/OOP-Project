
package assignment;
import java.util.Scanner;

public class Assignment {



    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the element of the array (separated by space): ");
    String input=scanner.nextLine();
    String []array=input.split(" ");
    
    String[] ascendingArray=array.clone();
    selectionSort(ascendingArray,true);
    System.out.println("Array sorted in descending order: ");
    printArray(ascendingArray);
    
    String[] descendingArray=array.clone();
    selectionSort(descendingArray,false);
    System.out.println("Array sorted in descending order: ");
    printArray(descendingArray);
    scanner.close();
    }
    public static void selectionSort(String[]array,boolean ascending){
    int n=array.length;
    for(int i=0; i<n-1; i++){
    int index=i;
    for(int j=i; j<n; j++){
    if(ascending ? array[j].compareTo(array[index])<0 : array[j].compareTo(array[index])>0){
    
    }
    }
    String temp=array[index];
    array[index]=array[i];
    array[i]=temp;
    }
    }
    public static void printArray(String[]array){
    for(String element: array){
        System.out.println(element+"");
    }
    System.out.println();
    }
   
}
