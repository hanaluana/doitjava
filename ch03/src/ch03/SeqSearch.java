package ch03;
import java.util.*;

public class SeqSearch {

    static int seqSearch(int[] a,  int key){

        int i=0;

        while(true){
            if (i==a.length){
                return -1;
            }
            if (a[i]==key){
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();

        int [] x = new int[num];

        for (int i=0;i<num;i++){
            System.out.print("i: ");
            x[i]=sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = sc.nextInt();

        int idx = seqSearch(x,key);

        if (idx==-1){
            System.out.println("없읍");
        }
        else
            System.out.println(key+"는 "+idx+"에 있습니다");
    }
}
