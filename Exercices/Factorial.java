public class Factorial{
        public long factorial(){
                long factorial=1;
                for( int i=this.getNumero();i!=0; i--){
                factorial=factorial*i;
                }
                return factorial;
        }
}