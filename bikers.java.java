import java.io.*;
import java.util.*;
class BikeRacers
{
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      int speed[]=new int[5];
      for(int i=0;i<5;i++)
      {
          System.out.print("\nEnter the speed of Racer-"+(i+1)+": ");
          speed[i]=sc.nextInt();
      }
      int sum=0;
      for(int i=0;i<5;i++)
          sum+=speed [i];
      double avg=sum/5;
           System.out.print("\nAverage Speed of Bikeracers is: ");
      System.out.print("\nThe Speed of qualifying racers are: ");
      for(int i=0;i<5;i++)
      {
          if(speed[i]>=avg)
             System.out.print("\nRacer-"+(1+1)+": "+speed[i]);
      }
   }
}          