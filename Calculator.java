import java.io.*;
import java.util.*;
	
public class Calculator
{
   public static Scanner input = new Scanner(System.in);
   
   public static Scanner input2 = new Scanner(System.in);
   
   public static void main(String argv[]) throws IOException 
   {
      double start = 999;
      while(start != 0)
      { 
         showmenu();
         System.out.println("press the corresponding number for what you wanna do!");
         start = input.nextDouble();
         while(start < 0 || start > 11)
         {System.out.println("please enter a valid number corresponding the menu"); 
            start = input.nextDouble();}
         
            
         if(start == 1)
         { add();  }
            
         
         else 
            if( start == 2)
            {   double x;
               double y;
               System.out.println("please enter the first number you want to subtract");
               x = input.nextDouble();
               System.out.println("please enter the second number you want to subtract");
               y = input.nextDouble();
               System.out.println("your answer is " +subtract(x,y));}
            
            else 
            
               if(start == 3)
               { double x;
                  double y;
                  System.out.println("please enter the first number you want to multiply");
                  x = input.nextDouble();
                  System.out.println("please enter the second number you want to multiply");
                  y = input.nextDouble();
                  System.out.println("your answer is " +multiply(x,y));}
                  
               else 
                  
                  if(start ==4)
                  { double x;
                     double y;
                     System.out.println("please enter the first number you want to divide");
                     x = input.nextDouble();
                     //while(x == 0)
                     //{ System.out.println("please enter a valid number");
                        //x = input.nextDouble(); }
                     System.out.println("please enter the number you want to divide the first number by");
                     y = input.nextDouble();
                     while(y == 0)
                     { System.out.println("please enter a valid number");
                        y = input.nextDouble(); }
                  
                     
                     System.out.println("your answer is " +divide(x,y));}
                  
                  else 
                  
                     if(start == 5)
                     {int x;
                        System.out.println("please enter the number you wanna calculate the root of");
                        x = input.nextInt();
                        while(x < 0 || x == 0)
                        {System.out.println("please give a valid number to calculate the root of");
                           x = input.nextInt();
                        }
                        System.out.println("the answer is "+root(x));
                     }
                     
                     else 
                     
                        if( start == 6) 
                        {double x;
                           System.out.println("Enter the number you want to find the Sine for");
                           x = input.nextDouble();
                           System.out.println("the answer is "+sin(x));
                        
                        }
                        
                        else 
                           if(start == 7) 
                           { double x;
                              System.out.println("Enter the number you want to find the Cosine for");
                              x = input.nextDouble();
                              System.out.println("the answer is "+cos(x));}
                              
                           else 
                              
                              if(start == 8)
                              {double x;
                                 System.out.println("Enter the number you want to find the Tangent for");
                                 x = input.nextDouble();
                                 System.out.println("the answer is "+tan(x));}
                                 
                              else
                                 
                                 if(start == 9)
                                 {double x;
                                    System.out.println("Enter the number you want to find the Cosecant for");
                                    x = input.nextDouble();
                                    System.out.println("the answer is "+csc(x));}
                                    
                                 else 
                                    if(start == 10)
                                    {double x;
                                       System.out.println("Enter the number you want to find the Secant for");
                                       x = input.nextDouble();
                                       System.out.println("the answer is "+sec(x));}
                                       
                                    else 
                                       
                                       if(start == 11)
                                       {double x;
                                          System.out.println("Enter the number you want to find the Cotangent for");
                                          x = input.nextDouble();
                                          System.out.println("the answer is "+cot(x));}
      
      
      
      
      }
   }

   
   public static void showmenu() throws IOException
   {System.out.println(" MENU"); 
      System.out.println("0) To quit");
      System.out.println("1) To add");
      System.out.println("2) To subtract");
      System.out.println("3) To multiply");
      System.out.println("4) To divide");
      System.out.println("5) To calculate the square root");
      System.out.println("6) To get the sin");
      System.out.println("7) To get the con");
      System.out.println("8) To get the tan");
      System.out.println("9) To get the csc");
      System.out.println("10) To get the sec");
      System.out.println("11) To get the cot");
   }
           
      
      
   
   public static double add()
   { 
      double x;
      double y; 
      double ans;
      System.out.println("please enter the first number you want to add");
      x = input.nextDouble();
      System.out.println("please enter the second number you want to add");
      y = input.nextDouble();
      ans = x + y;
      System.out.println("The answer is " +ans);
           
      return ans;
   }     
             
   public static double subtract(double x, double y)
   {
      return x - y;
     
   }    
     
   public static double multiply(double x, double y)
   {
      return x * y;
   }  
   
   public static double divide(double x, double y)
   { 
      return x / y; }   
     
   public static int root(int x)
   {  int square;
      int ans;
      square= x/2;
      do{ ans = square; 
         square = (ans + (x /ans)) / 2;
      }
      while(ans - square !=0);
      return square;    
      
   }
   
   public static double sin(double x)
   { 
      return Math.sin(x);
   }
   public static double cos(double x)
   {
      return Math.cos(x);
   }
     
   public static double tan(double x)
   { 
      double filler3;
      double filler2;
      double answer;
      filler3 = sin(x);
      filler2 = cos(x);
      while(filler2 == 0)
      {System.out.println(" please enter a valid number");
         x = input.nextDouble();
         filler3 = sin(x);
         filler2 = cos(x);}
      answer = filler3 / filler2;
      System.out.println(answer);
      return answer; 
      
   }
   
   public static double csc(double x)
   {
      double filler;
      double anss; 
      filler = sin(x);
      while(filler == 0)
      {System.out.println("please enter a valid number");
         x = input.nextDouble();
         filler = sin(x); }
      anss = 1/filler; 
      
      return anss;
   }
   
   public static double sec(double x)
   {
      double fillertwo;
      double ansn; 
      fillertwo = cos(x);
      while(fillertwo == 0)
      {System.out.println("please enter a valid number");
         x = input.nextDouble();
         fillertwo = cos(x); }
   
      ansn = 1 / fillertwo;
      
      return ansn;
   }
   
   public static double cot(double x)
   {
      double fillerthe;
      double anns;
      fillerthe = tan(x);
      while(fillerthe == 0)
      {System.out.println("please enter a valid number");
         x = input.nextDouble();
         fillerthe = tan(x); }
   
      anns = 1 / fillerthe;
   
   
      return anns;
   }
   
   
}