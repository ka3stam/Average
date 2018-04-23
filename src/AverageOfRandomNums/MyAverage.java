package AverageOfRandomNums;
import java.util.Random; 
public class MyAverage {

    public static void main(String[] args) {
        
        final int SIZE=100; 
        int a[]; 
        a=new int[SIZE]; 
        int max=0,sum=0,av=0; 
        Random rand=new Random(); 
        for (int i=0;i<SIZE;i++) {
        a[i]=rand.nextInt(9999)+1000; 
        sum=sum+a[i];
        }
        av=sum/100;
         for (int i=0;i<SIZE;i++)
         {
         if (av<a[i])
             max=max+1;
         }
         
         System.out.println( max + " numbers are greater"
                 + " than the average ("+ av +") of all numbers."); 
    }
    
}
