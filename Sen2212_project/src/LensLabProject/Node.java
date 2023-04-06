package LensLabProject;

// create Node class to design the structure of the AVL Tree Node  
public class Node  
{      
    Lens element;  
    int h;  //for height  
    Node leftChild;  
    Node rightChild;  
      
    //default constructor to create null node  
    public Node()  
    {  
        leftChild = null;  
        rightChild = null;  
        element = null;  
        h = 0;  
    }  
    // parameterized constructor  
    public Node(Lens element)  
    {  
        leftChild = null;  
        rightChild = null;  
        this.element = element;  
        h = 0;  
    }       
}  
  
