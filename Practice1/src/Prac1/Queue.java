
package Prac1;

public class Queue {
    int front,rear,size,capacity;
    int a[];
    
    Queue(int capacity){
    this.capacity=capacity;
    front=size=0;
    rear=capacity-1;
    a = new int[this.capacity];}
    
    boolean isfull(Queue queue){
    return(queue.size==queue.capacity);}
    
    boolean isempty(Queue queue){
    return(queue.size==0);}
    
    void enqueue(int x) 
    { 
        if (isfull(this)) 
            return; 
        this.rear = (this.rear + 1)%this.capacity; 
        this.a[this.rear] = x; 
        this.size = this.size + 1; 
        System.out.println(x+ " enqueued to queue"); 
    } 
       
    
    int dequeue(){
        if(isempty(this))
            return Integer.MIN_VALUE;
        
        int x = this.a[this.front]; 
        this.front = (this.front + 1)%this.capacity; 
        this.size = this.size - 1; 
        return x; 
    }
    int Front()
    {if(isempty(this))
        return Integer.MIN_VALUE;
    
    return this.a[this.front];
    }
    
    int Rear(){
    if(isempty(this))
        return Integer.MIN_VALUE;
    return this.a[this.rear];}
    
    
    public static void main(String[] args) {
        Queue queue=new Queue(1000);
        
        queue.enqueue(10); 
        queue.enqueue(20); 
        queue.enqueue(30); 
        queue.enqueue(40); 
        
        System.out.println(queue.dequeue() + " dequeued from queue\n"); 
        
        System.out.println("Front item is: " + queue.Front()); 
           
        System.out.println("Rear item is " +  queue.Rear()); 
        
    }
    }
    
        
    

