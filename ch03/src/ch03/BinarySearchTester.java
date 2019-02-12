package ch03;
import java.util.*;

public class BinarySearchTester {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];

        x[0]=sc.nextInt();
        for (int i=1;i<num;i++){
            do{
                x[i]=sc.nextInt();
            }while(x[i]<x[i-1]);
        }

        System.out.print("검색할 값: ");
        int key = sc.nextInt();

        int idx = Arrays.binarySearch(x, key);

        if (idx<0) {
            System.out.println(key+"값은 x["+(idx+1)*(-1)+"]에 있어야 합니다!");
        }
        else
            System.out.println(key+"는 x["+idx+"]에 있습니다");

    }
}
