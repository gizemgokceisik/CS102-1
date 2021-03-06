/**
 * Lab 07 b part 2
 * Author @EgeDarcin
 * Version 1.1
 */
//import java.util.*;
public class SimpleStack{
  
  private StackNode list;
  
  public SimpleStack(){
    list = null;
  }
  public void push(int intValue){//push method
    StackNode node = new StackNode(intValue);
    StackNode temp = list;
    
    if (list == null)
      list = node;
    else {
      list = node;
      node.next = temp;
    }
  }
  public boolean isEmpty(){//empty method
    return list == null;
  }
  public int pop(){//pop method
    int result = list.intValue;
    list = list.next;
    return result;
  }
  private class StackNode{//node class
    int intValue;
    StackNode next;
    public StackNode(int intValue1){
      intValue = intValue1;
      next = null;
    }
    
    public void printInt(){
      System.out.println(""+intValue);
    }
  }
}