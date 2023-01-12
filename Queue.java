import java.util.*;
import java.io.*;

public class Queue{
    int l = 10;
    int [] arr =  new int[l];
    int f=-1;
    int b=-1;
boolean isFull()
{
    if(b==l-1)
    {
        return true;
    }
    else
    {
        return false;
    }
}

boolean isEmpty()
{
    if(b==-1&&f==-1)
    {
        return true;
    }
    else
    {
        return false;
    }
}

 
  void enQueue(int itemValue) {
      if(isFull()){
          System.out.println("Queue is full");
      } else if(f == -1 && b == -1){
          f = b = 0;
          arr[b] = itemValue;
      } else{
          b++;
          arr[b] = itemValue;
      }
  }
void deQueue(){
      if(isEmpty())
      {
          System.out.println("Queue is empty. Nothing to dequeue");
      }
       else if (f == b)
       {
          f = b = -1;
      } 
      else 
      {
          f++;
      }
  }
  
  void display(){
      int i;
     
      if(isEmpty()){
          System.out.println("Queue is empty");
      }
       else 
       {
        for(i = f; i <= b; i++)
        {
            System.out.println(arr[i]);
          }
      }
  }
  
  void peak()
  {
    System.out.println("Front value is: " + arr[f]);
  }

  public static void Main(String[] args) {
    Queue myQueue = new Queue();
    
    myQueue.enQueue(3);
    myQueue.enQueue(2);
    myQueue.enQueue(1);

    
    myQueue.display();
    
    myQueue.peak();
    
    
  }
  
}

