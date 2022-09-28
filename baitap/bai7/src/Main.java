import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dong,cot;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng : ");
        dong =Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào số cột : ");
        cot = Integer.parseInt(sc.nextLine());
        int [][] A = new int[dong][cot];
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Nhập phần tử thứ ["+i+","+j+"]:");
                A[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        System.out.println("Mảng vừa nhập vào là :");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if(i==j){
                    sum += A[i][j];
                }
            }
        }System.out.print( "Tổng của đường chéo chính  = " + sum + "\t");
        System.out.println("\n");

        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                if(i==3&&j==3){
                    sum += A[i][j];
                }
            }
        }System.out.print( "Tổng của đường chéo phụ  = " + sum + "\t");
        System.out.println("\n");
    }
}