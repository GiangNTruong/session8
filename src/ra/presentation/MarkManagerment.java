package ra.presentation;

import ra.business.config.InputMethods;
import ra.business.design.CRUD;
import ra.business.implement.MarkImplement;

public class MarkManagerment {
    public static CRUD markImplement = new MarkImplement();

    public static void main(String[] args) {
        while (true){
            System.out.println("--------------------MENU-------------------");
            System.out.println("1. Nhập mới điểm");
            System.out.println("2. Hiển thị điểm");
            System.out.println("3. Cập nhật thông tin");
            System.out.println("4. Xóa điểm");
            System.out.println("5. Thoát");
            System.out.println("Nhạp chuc năng");
            byte choice = InputMethods.getByte();
            switch (choice){
                case 1:
                    markImplement.create();
                    break;
                case 2:
                    markImplement.display();
                    break;
                case 3:
                    markImplement.edit();
                    break;
                case 4:
                    markImplement.delete();
                    break;
                case 5:
                    return;
            }
        }
    }
}
