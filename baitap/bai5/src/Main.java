import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m, n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so vao hàng ơ chỗ day: ");
        m = scanner.nextInt();
        System.out.println("nhập số vào cột ở chỗ này: ");
        n = scanner.nextInt();

        //khai báo ma trận có m dòng , n cột
        int maTran[][] = new int[m][n];

        System.out.println("nhap các phần tử vào chỗ này: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("maTran[" + i + "][" + j + "] = ");
                maTran[i][j] = scanner.nextInt();
            }
        }

        /// tìm phần tử có giá trị lớn nhất trong ma trận
        // giả sử phần tử lại vị trí (0,0) là phần tử lớn nhất
        int min = maTran[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (min > maTran[i][j]) {
                    min = maTran[i][j];
                }
            }
        }
        System.out.println("phần tử nhỏ nhất trong ma trận là: " + min);
    }
}