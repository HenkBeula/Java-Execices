/**@author Henk Beula*/
public class BubbleSort {
    public static void bubbleSort(int [] arr) {
        int aux,index;
        boolean ordered=false;
        do {
            ordered=true;
            for(index=0;index<arr.length-1;index++) {
               if(arr[index]>arr[index+1]) {
                  aux=arr[index+1];
                  arr[index+1]=arr[index];
                  arr[index]=aux;
                  ordered=false;
               }
            }
        } while(ordered==false);  
    }
}