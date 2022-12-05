/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Queue
{
    static int front=-1,rear=-1;
    static int arr[]=new int[5];
    public static void insert(int val){
        if(rear==4){
            System.out.println("overflow");
        } 
        else
        {
            if((rear<4)&&(rear+1>-1)){
            if(rear+1==0)
            front++;
            arr[++rear]=val;
        }
       
        } 
    }
    
    public static void delete(){
        if(front==-1||front>rear){
            System.out.println("underflow");
        }
        else if(front==rear){
            int num=arr[front];
            System.out.println("the deleted value is:"+num);
            front=-1;
            rear=-1;
        }
        else{
            int num=arr[front];
            front++;
            System.out.println("the deleted value is:"+num);
        }
    }
    
    public static void display(){
        int i;
        for(i=front;i<=rear;i++)
        System.out.print(arr[i]+" ");
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int flag=1;
		while(flag==1){
		    System.out.println("Enter the that you want to perform:");
		    System.out.println("Press 1 for insert() operation");
		    System.out.println("Press 2 for delete() operation");
		    System.out.println("Press 3 for display() operation");
		    System.out.println("Press 4 to EXIT");
		    int p=sc.nextInt();
		    switch(p){
		        case 1:int n=sc.nextInt();
		            insert(n);
		               break;
		               case 2: delete();
		               break;
		               case 3:display();
		               break;
		               case 4:flag=0;
		                      break;
		                      default: System.out.println("Enter correct number");
		                      break;
		    }
		}
	}
}
