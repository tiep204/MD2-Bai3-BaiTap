////////xoa phan tu
//
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        /*
//        * iput:
//        *  nhap so phan tu mang, khoi tao mang
//        *
//        * Output:
//        *  xoa tat ca cac phan tu co gia tri nhap vao
//        * */
//        ////B1. nhap vao so phan tu cua mang
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap vao so phan tu cua mang: ");
//        int n = Integer.parseInt(sc.nextLine());
//        int[] old = new int [n];
//        System.out.println("nhap gia tri cac phan tu cua mang: ");
//        for (int i = 0; i < old.length; i++) {
//            System.out.printf("old[%d]=",i);
//            old[i] = Integer.parseInt(sc.nextLine());
//        }
//        //B2. in t=ra cac gia tri phan tu cua mang truoc khi xoa
//        System.out.println("gia tri cac phan tu truoc khi xoa: ");
//        for (int i = 0; i < old.length; i++) {
//            System.out.printf("%d\t",old[i]);
//
//        }
//        System.out.printf("\n");
//        ////b3
//        System.out.println("nhap vao gia tri can xoa");
//        int deleteValue = Integer.parseInt(sc.nextLine());
//        ///b4
//        ///b4.1
//        ////-----dem so phan tu co gia tri la delete
//        int cnt = 0;
//        for (int i = 0; i < old.length; i++) {
//            if (old[i]==deleteValue){
//                cnt++;
//            }
//        }
//        //// khoi tao mang moi
//
//        int[] arrNew = new int[old.length-cnt];
//        /////copy toan bo
//        int index = 0;
//        for (int i = 0; i < old.length; i++) {
//            if (old[i]==deleteValue){
//                ///dang o phan tu
//            }else{
//                ////dang o phan tu coppy
//                arrNew[index] = old[i];
//                index++;
//            }
//        }
//        ///B5 in gia tri cac phan tu sang mang moi
//        System.out.println("gia tri cac phan tu trong mang sau khi xoa: ");
//        for (int i = 0; i < arrNew.length; i++) {
//            System.out.printf("%d\t", arrNew[i]);
//        }
//        System.out.printf("\n");
//    }
//}




///////them phan tum

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mang");
        int n = Integer.parseInt(sc.nextLine());
        int[] old = new int [n];
        System.out.println("nhap gia tri mang");
        for (int i = 0; i < old.length; i++) {
            System.out.printf("%d\t",old[i]);
        }
        System.out.printf("\n");
        ////b3
        System.out.println("them mang");
        int valueInsert = Integer.parseInt(sc.nextLine());
        System.out.println("nhap vao chi so can chen vao mang: ");
        int indexInsert = Integer.parseInt(sc.nextLine());
        ///b4
        int[] arrNew = new int[old.length+1];
        ///b5
        for (int i = 0; i < arrNew.length; i++) {
            if(i<indexInsert){
                arrNew[i] = old[i];
            }else if (i == indexInsert){
                arrNew[i] = valueInsert;
            }else{
                arrNew[i] = old[i-1];
            }
        }
//        b6

        System.out.println("gia tri cac phan tu cua mang");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.printf("%d\t",arrNew[i]);

        }
        System.out.printf("\n");
    }
}