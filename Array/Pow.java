public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, -2));
    }

    public static  double myPow(double x, int n) {
        double ans=1;
       if(n<0){
         for(int i=0;i>n;i--){
            ans*=1/x;
        }
       }else{
         for(int i=0;i<n;i++){
            ans*=x;
        }
       }
     return ans;
 
             
         }
}
