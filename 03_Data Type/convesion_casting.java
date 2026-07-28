public class convesion_casting {

    public static void main(String[] args)
    
    {
    // byte b=125;
    int a=258;
    byte k = (byte)a;
    float f=5.6f;
    int t= (int) f;

    System.out.println(k);
    System.out.println(t);
        
    byte c=10;
    byte b=30;
    int result=c*b; // promoted to integer value  typecasting
    System.out.println(result);

    }
   
}
