package ch02;

public class PrimeNumber {

    static void PrimeNumber1(int n){
        int [] result = new int[500];
        int ptr = 0;
        for (int i=2;i<=n;i++){
            boolean flag=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                result[ptr++]=i;
            }
        }
        for (int i=0;i<ptr;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }

    static void PrimeNumber2(int n){
        int [] result = new int[500];
        int ptr = 0;
        for (int i=2;i<=n;i++){
            boolean flag=true;
            for (int j=0;j<ptr;j++){
                if (i%result[j]==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                result[ptr++]=i;
            }
        }
        for (int i=0;i<ptr;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }

    static void PrimeNumber3(int n){
        int [] result = new int[500];
        int ptr = 0;
        result[ptr++]=2;
        for (int i=3;i<=n;i++){
            boolean flag=true;
            for (int j=0;result[j]*result[j]<=i;j++){
                if (i%result[j]==0){
                    flag=false;
                    break;
                }
            }
            if (flag){
                result[ptr++]=i;
            }
        }
        for (int i=0;i<ptr;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args){
        PrimeNumber1(1000);
        PrimeNumber2(1000);
        PrimeNumber3(1000);
    }
}
