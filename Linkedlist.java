import java.util.*;
import java.io.*;

public class Node{
    int data;
    Node next;
}

public class Linkedlist{
    Node head;
    Node tail;   

Linkedlist(Node head)
{
    this.head=head;
}
Linkedlist(Node data)
{
    this.head=new Node(data);
}
}

void teaverse(Node head)
{
    Node temp=head;
    while(temp!==null)
    {
        System.out.prinln(temp.data);
        temp=temp.next;
    }
}

public static Linkedlist insert(Linkedlist list, int data)
    {
        
        Node new_node = new Node(data);
          
    
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else {
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
    
           // Insert the new_node at last node 
            last.next = new_node;
        } 
    
        // Return the list by head 
        return list;
    }
public static Linkedlist insert(Linkedlist list,int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
  
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
  
            // Insert the new_node at last node
            last.next = new_node;
        }
  
        // Return the list by head
        return list;
    }
 public static Linkedlist  deleteAtPosition(Linkedlist list, int index)
    {
        // Store head node
        Node currNode = list.head, prev = null;
  
        //
        // CASE 1:
        // If index is 0, then head node itself is to be
        // deleted
  
        if (index == 0 && currNode != null) {
            list.head = currNode.next; // Changed head
  
            // Display the message
            System.out.println(
                index + " position element deleted");
  
            // Return the updated List
            return list;
        }
  
        //
        // CASE 2:
        // If the index is greater than 0 but less than the
        // size of LinkedList
        //
        // The counter
        int counter = 0;
         while (currNode != null) {
  
            if (counter == index) {
                // Since the currNode is the required
                // position Unlink currNode from linked list
                prev.next = currNode.next;
  
                // Display the message
                System.out.println(
                    index + " position element deleted");
                break;
            }
            else {
                // If current position is not the index
                // continue to next node
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
 if (currNode == null) {
            // Display the message
            System.out.println(
                index + " position element not found");
        }
  
        // return the List
        return list;
    }