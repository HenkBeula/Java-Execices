/**
@HenkBeula
**/
public class findInArray{
  //find two numbers that add up to a given number
    public static void fSumArray(int [] arr, int x){
        int fnum=0, snum=0, sum=0;
        boolean found =false;// to stop the outer cycle and not continuing
                             //doing an unnecessary job
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    fnum=arr[i];
                    snum=arr[j];
                    sum=arr[i]+arr[j];
                    found = true;
                    break;
                }
            }
            if(found)
               break;
        }
        System.out.println("First num  : "+fnum+"\n"+"Second num : "+snum+"\n"+"Sum        : "+sum);
    }
}