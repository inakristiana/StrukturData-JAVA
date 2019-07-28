package queue;
public class Queue {
    int queue[]=new int[5];
    
    public void push(int value){
        if(queue[0]==0){
            queue[0]=value;
            System.out.println("1st Queue = " + queue[0]);
        }
        else if(queue[1]==0){
            queue[1]=value;
            System.out.println("2nd Queue = " + queue[1]);
        }
        else if(queue[2]==0){
            queue[2]=value;
            System.out.println("3rd Queue = " + queue[2]);
        }
        else if(queue[3]==0){
            queue[3]=value;
            System.out.println("4th Queue = " + queue[3]);
        }
        else if(queue[4]==0){
            queue[4]=value;
            System.out.println("5th Queue = " + queue[4]);
        }
        else{
            isFull();
        }
    }
    
    public void isFull(){
        System.out.println("Queue is Full");
    }
    
    public void pop(){
        if(queue[0]!=0){
            System.out.println("POP : " + queue[0]);
            queue[0]=0;
        }
        else if(queue[1]!=0){
            System.out.println("POP : " + queue[1]);
            queue[1]=0;
        }
        else if(queue[2]!=0){
            System.out.println("POP : " + queue[2]);
            queue[2]=0;
        }
        else if(queue[3]!=0){
            System.out.println("POP : " + queue[3]);
            queue[3]=0;
        }
        else if(queue[4]!=0){
            System.out.println("POP : " + queue[4]);
            queue[4]=0;
        }
        else{
            isEmpty();
        }
    }
    
    public void isEmpty(){
        System.out.println("Queue is Empty");
    }
    
    public void clear(){
        queue[0]=0;
        queue[1]=0;
        queue[2]=0;
        System.out.println("Queue is Clear");
    }
    
    public void cetak(){
        System.out.println("--------------------------------");
        for(int i=0;i<queue.length;i++){
            if(queue[i]!=0){
            System.out.println(queue[i]+" ");
            }
        }
        System.out.println("--------------------------------");
    }
    
    public static void main(String[] args) {
        Queue s=new Queue();
        s.push(19);
        s.push(6);
        s.push(13);
        s.push(2);
        s.push(1);
        s.cetak();
        s.pop();
        s.pop();
        s.cetak();
        s.clear();
    }   
}