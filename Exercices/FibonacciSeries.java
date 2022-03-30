/** @author Henk Beula*/
public class FibonacciSeries {
  public static void fibonacci(int limit){
    long F1=0, F2=1, Fn;
    for(int i=1;i<=limit;i++){
      Fn=F1+F2;
      System.out.print(Fn+",");
      F2=F1; F1=Fn;   
    }      
  }
}
