package ch02;
import java.util.Scanner;

public class CardConvRev {

    static int cardConvR(int x, int r, char[]d){
        int digits=0;
        String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        while(x>0){
            d[digits++]=dchar.charAt(x%r);
            x/=r;
        }
        return --digits;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수의 기수를 변환합니다");
        do {
            do {
                System.out.print("음이 아닌 정수: ");
                no = sc.nextInt();
                sc.nextLine();
            } while (no <= 0);

            do {
                System.out.print("어떤 진수로? ");
                cd = sc.nextInt();
            } while (cd <= 0 || cd > 36);

            dno = cardConvR(no, cd, cno);
            for (int i = dno; i >= 0; i--) {
                System.out.print(cno[i]);
            }
            System.out.println();

            System.out.println("한번 더?");
            retry = sc.nextInt();
        }while(retry==1);



    }
}
