import java.util.Scanner;

public class baitapso7 {

    // Phương thức thực nhập mảng số
    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    // Phương thức xuất ra mảng màn hình
    public static void printData(float[] arrays) {
        for (float element : arrays) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Phương thức tìm phần tử giá trị lớn thứ 2 trong mảng
    public static float findMax2(float[] arrays) {
        float max1 = arrays[0];
        float max2 = arrays[0];

        for (float element : arrays) {
            if (element > max1) {
                max2 = max1;
                max1 = element;
            } else if (element > max2 && element < max1) {
                max2 = element;
            }
        }
        return max2;
    }

    // Phương pháp xóa các phần tử lẻ ra khỏi mảng
    public static void deleteOddNumber(float[] arrays) {
        for (float element : arrays) {
            if (element % 2 == 0) {
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    // Hàm main để gọi và sử dụng các phương thức trên
    public static void main(String[] args) {
        float[] arrays = new float[5];

        System.out.println("Nhập các phần tử của mảng:");
        importData(arrays);

        System.out.println("Các phần tử trong mảng là:");
        printData(arrays);

        System.out.println("Phần tử lớn thứ 2 trong mảng là:");
        System.out.println(findMax2(arrays));

        System.out.println("Mảng sau khi xóa các phần tử lẻ:");
        deleteOddNumber(arrays);
    }
}

