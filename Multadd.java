package ch3.APCSAch4;
public class Multadd{
    public static double multadd(double a, double b, double c){
        return a * b + c;
    }
    public static void main(String [] arngs){
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double d = Math.sin(Math.PI/4.0);
        double e = (Math.cos(Math.PI/4.0))/2.0;
        double f = Math.log(10.0);
        double g = Math.log(20.0);
        
        System.out.println(multadd(a,b,c));
        System.out.println(multadd(a,d,e));
        System.out.println(multadd(a,f,g));
        System.out.println(expSum(a));
    }
    public static double expSum (double x){
        double a = x;
        double b = Math.exp(-x);
        double c = Math.sqrt(1-b);
        return multadd(a,b,c);
    }
}