package lower.lesson13;
import java.util.Arrays;
import java.util.Scanner;

public class simpleJobQueue {
    //properties
    public int head = -1;
    public int  rear = 0;
    public SimpleJobs[] jobs = new SimpleJobs[30];
    

    //methods
    public void enqueue(SimpleJobs job){
        if (isFull()){
            return; //if full, add nothing
        }else{
        //very hard
        jobs[rear] = job;
        
        
        //move rear by 1
        this.rear = this.rear + 1;
        }
    }


    public void dequeue(){
        if (isEmpty()){
            return; //nothing
        }else{
            for( int i = head; i < rear - 1; i++){
                SimpleJobs moveUp = jobs[i+1];
                jobs[i] = moveUp;
            }
        }



    }

    public SimpleJobs peek2(){
        if (isEmpty() == true){
            return null;
        }else{
        SimpleJobs peek2 = jobs[head];
        return peek2;
        }
    }

    public SimpleJobs peek(){
        if (isEmpty() == true){
            return null;
        }else{
        SimpleJobs peek = jobs[rear];
        return peek;
        }
    }
   

    public boolean isEmpty(){
        if (head == -1){
           return true;
        }
        return false;
    }
    
    public boolean isFull(){
        if(rear == jobs.length){
        return true;
        }
        return false;
    }

    public int count(){
            if (isEmpty()) {
                return 0;
            } else if (isFull()) {
                return 100;
            } else {
                return rear;
            }
        }


    //static methods


}