package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
     Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại quy đổi:");
        System.out.println("1 - vnd -> usd");
        System.out.println("2 - usd -> vnd");
        int kind = scanner.nextInt();
        System.out.println("Nhập số tiền: ");
        double money = scanner.nextDouble();
        switch (kind){
            case 1:
                System.out.println("Số tiền chuyển sang usd là: "+money/23000);
                break;
            case 2:
                System.out.println("Số tiền chuyển sang vnd là: "+money*23000);
                break;
        }
    }
}
