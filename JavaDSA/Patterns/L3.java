import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sp = n-1;
        int st =1;
        for(int i=1; i<=n; i++){
            //System.out.println(sp+","+st);
            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }

            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }


            

            sp--;
            st++;
            System.out.println();
        }
    }
}
