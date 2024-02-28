/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmobile;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class TestMobile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chuoi latinh: ");
        String input = scanner.nextLine().toLowerCase(); // Chuyển đổi chuỗi thành chữ thường để đơn giản hóa xử lý

//        int count = countVietnameseCharacters(input);
        int soLuong = Count(input);
        System.out.println("So luong chu cai tieng viet tao thanh: " + soLuong + "\n");
    }

    public static int Count(String input) {
        int count = 0;
 
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'w' ){
                    count++;
            } else if (i < input.length() - 1) {
                String twoChars = input.substring(i, i + 2);
                if (isVietnameseCharacter(twoChars)) {
                    System.out.print("2 tu: " + twoChars + '\n');

                    count++;
                    i++;
                }

            }
        }

        return count;
    }

    public static boolean isVietnameseCharacter(String twoChars) {
        // Kiểm tra cặp ký tự có tạo thành một chữ cái Tiếng Việt không
        return (twoChars.contains("aw") || twoChars.contains("aa") || twoChars.contains("dd")
                || twoChars.contains("ee") || twoChars.contains("oo") || twoChars.contains("ow"));
    }

}
