import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String r="";

        while(n>0)
        {
            if(n%2==1) {
                r += "1";
            }
            else {
                r += "0";
            }
            n=n/2;


        }
        StringBuilder sb = new StringBuilder(r);
        String r1 = sb.reverse().toString();
        System.out.println(r1);
    }
}
