public class L5_Conditional {
    public static void main(String[] args) {
        int x =13;

        if(x % 2 == 0){
            System.out.println(x + " is even.");
        }else {
            System.out.println(x + " is Odd");
        }
        System.out.println("HardWork is better than samrt work");

        int n1 = 100;
        int n2 = 100;

        if(n1 == n2){
            System.out.println(n1 + " is Equal To " + n2);
        }else{
            if (n1 >n2) {
                 System.out.println(n1 + " is  grater than " +n2);
            }else{
                System.out.println(n1 + " is  smaller than " +n2);
            }
            
        }
    }
}
