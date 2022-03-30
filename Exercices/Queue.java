package henks.datastructure;

/**
 * 
 * @Author Henk Beula
 * Queue implementation
 * 
 */
 /*
 *The queue obeys the principle of "first in first out - FIFO". The queue
 *is manipulated from its endpoints (it has two indices - start and end).
 *Insert an element into the queue from the end, and delete it from the beginning.
 *
 *Follows a real example, in bank queues, people arrive and are added to the end of
 *the queue (add), and are served from the beginning of the queue (delete) 
 */
public class Queue{
    private int begin;
    private int end;
    private int queue [];
    private int size;

    public Queue(int size){//creates an empty queue when instantiated
        this.begin = -1;
        this.end = -1;
        this.size = size;
        this.queue = new int[size];
    }

    public int getBegin(){//returns the index where the queue starts
        return this.begin;
    }

    public int getEnd(){//returns the index where the queue end
        return this.end;
    }

    public void setBegin(int data){
        this.begin = data;
    }

    public void setEnd(int data){
        this.end = data;
    }

    public boolean isEmpty(){//if begin and end have de same index, the queue is empty
        if(this.begin == this.end){
            return true;
        }
        return false;
    }

    public boolean insert(int data){//inserting to the end of the queue
        if(this.end<this.size-1){
            this.end+=1;
            queue[this.end] = data;
            return true;
        }
        return false;
    }

    public boolean remove(){//removing from the begining of the queue
        if(!isEmpty()){//dont whant to look for an element in an empty queue right!
            this.begin+=1;
            queue[this.begin]=0;
            return true;
        }
        return false;
    }

    public int first(){//returns first element in queue
        if(!isEmpty()){//dont whant to look for an element in an empty queue right!
            return this.queue[this.begin + 1];
        }
        return -1;
    }
}
