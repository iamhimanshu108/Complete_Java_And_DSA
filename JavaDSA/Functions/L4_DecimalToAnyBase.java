import java.util.Scanner;
public class L4_DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int dn = getValueBase(n, d);
        System.out.println(dn);
    }

    public static int getValueBase(int n, int b){
        int rv = 0;

        int p = 1;

        while(n>0){
            int dig = n % b;
            n = n / b;
            rv += dig * p;
            p *= 10;
        }

        return rv;
    }
}
