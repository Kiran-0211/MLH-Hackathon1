import java.util.*;
import java.io.*;
public class Todo
{
    static String task[] = new String[50];
    static int i,j,t=1;
    public static void main(String args[])throws IOException
    {
       
       int ch;
       Scanner sc = new Scanner(System.in);
       
       start();
       System.out.println("A To Do list will help you be the most productive version of yourself");
       System.out.println("Let's get started!");
       System.out.println("Enter your first task");
       task[0] = sc.nextLine();
      for(i=0;;i++)
       {
    System.out.println("Enter your choice ");
System.out.println("1.Add Task 2.Remove Task 3.Display Tasks 4.Exit");
         ch= sc.nextInt();
         sc.nextLine();
           switch(ch)
           {
               case 1:
               {
              System.out.println("Hustle harder, we got an extra task to perform");
              System.out.println("Please enter the task:");
                   task[t] = sc.nextLine();
                   t++;
                   display();
                   break;
               }
               case 2:
               {
                   int index;
                   display();
                   System.out.println("Yay! You are one step closer to finishing all the tasks");
                   System.out.println("Please enter the index of the task");
                   index = sc.nextInt();
                   delete(index);
                   break;
               }
               case 3:
               {
                   display();
                   break;
               }
               case 4:
               {
              System.exit(0);
               break;
               }
               default:System.out.println("Enter the correct choice");
           }
       }
    }
   
       
   
    public static void display()
    {
   
        System.out.println("Your TO DO List");
        System.out.println("No.     Name of the event");
        for(i=0;i<t;i++)
        {
             
            System.out.println((i+1)+"     "+task[i]);
        }
        return;
    }
    public static void delete(int index)
    {
        for(i=index;i<t;i++)
        {
            task[i-1] = task[i];
           
        }
        t--;
        display();
    }
    public static void start()
    {
        String name;
        Scanner sc= new Scanner(System.in);
         System.out.println("Welcome to TO DO LIST. Please enter your name");
       name = sc.nextLine();
       System.out.println("Hello "+name+".");
       return;
    }
}
