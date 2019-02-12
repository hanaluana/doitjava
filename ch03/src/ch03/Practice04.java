package ch03;
import java.util.*;

public class Practice04 {

    static int binarySearch(int[] x, int key){
        int start=0, end=x.length-1; int i;
        while (start<=end){
            i = (start+end)/2;
            for (int j=0;j<x.length;j++){
                System.out.printf("%3d",x[j]);
            }
            System.out.println();

            for (int j=0;j<start;j++){
                System.out.print("   ");
            }
            System.out.print(" <-");
            for (int j=start+1;j<i;j++){
                System.out.print("   ");
            }
            System.out.print("  +");
            for (int j=i+1;j<end;j++){
                System.out.print("   ");
            }
            System.out.println(" ->");

            if (x[i]==key)
                return i;
            if (x[i]>key)
                end=i-1;
            else
                start=i+1;
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();

        int [] x = new int[num];
        System.out.print("0: ");
        x[0]=sc.nextInt();


        for (int i=1;i<num;i++){
            do{
                System.out.print(i+": ");
                x[i]=sc.nextInt();
            }while (x[i]<x[i-1]);
        }

        System.out.print("검색할 값: ");
        int key = sc.nextInt();

        int idx = binarySearch(x, key);
        if (idx==-1) System.out.println("없읍");
        else
        System.out.println(key+"는 "+"x["+idx+"]에 있습니다");

    }

}
