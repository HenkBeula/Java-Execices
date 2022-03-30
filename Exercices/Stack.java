package henks.datastructure;

/**
 * 
 * @Author Henk Beula
 * Stack implementation
 * 
 */

public class Stack {
    final int max;
    int top = -1;
    int [] a;

    public Stack(final int max){
        this.max=max;
        this.a = new int [max];
    }

    public int getMax() {
        return this.max;
    }

    boolean isEmpty(){
        return this.top==-1;
    }

    boolean isFull(){
        return this.top == max-1;
    }

    int fromTop(){
        if(isEmpty())
            return -1;
        return this.a[this.top];
     }

     boolean push(int elemento){
        if(isFull()){
            return false;
        }
        this.a[++this.top]=elemento;
        return true;
     }

     String pop(){
        if(isEmpty())
            return "Stack is empty";
        return this.a[this.top--]+" was removed from stack";
     }

     void stackElements(){
        int i=this.top;
        if(isEmpty())
            System.out.println("Stack is empty");
        else
            while(i>=0){
                System.out.println(this.a[i]);
                i--;
            }
     }
}
