import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ///khai báo và khởi tạo giá trị cho các phần tử của hai mảng mangr1 và mang2

        int[] mang1 ;
        int[] mang2 ;

        mang1 = new int[10];
        mang2 = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mang1.length; i++) {
            System.out.println("phan tu thu "+i+" cua mang");
            mang1[i] = sc.nextInt();
        }
        for (int i = 0; i < mang2.length; i++) {
            System.out.println("phan tu thu "+i+"cua mang");
            mang2[i] = sc.nextInt();
        }



        ///biến lenght sẽ bằng độ dài của hai mảng cộng lại

        int gop = mang1.length + mang2.length;
        //////kết quả

        int[] ketQua = new int[gop];
        int khaiBao = 0;
        /// vòng lặp

        for (int element : mang1) {
            ketQua[khaiBao] = element;
            khaiBao++;
        }
        ///vong lap mang 2
        for (int element : mang2 ) {
            ketQua[khaiBao] = element;
            khaiBao++;
        }
        ///hiển thị thôi letgo boy
        System.out.println(Arrays.toString(ketQua));

        System.out.println("\n---------------");

    }
}