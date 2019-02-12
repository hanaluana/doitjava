package ch03;

import java.util.Scanner;

public class SeqSearchSen {

    static int seqSearchSen(int[] a,  int key){

        int i=0;

        while(true){
            if (a[i]==key){
                break;
            }
            i++;
        }
        return i==a.length?-1:i;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();

        int [] x = new int[num+1];

        for (int i=0;i<num;i++){
            System.out.print(i+": ");
            x[i]=sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = sc.nextInt();
        x[num]=key;

        int idx = seqSearchSen(x,key);

        if (idx==-1){
            System.out.println("없읍");
        }
        else
            System.out.println(key+"는 "+idx+"에 있습니다");
    }
}
