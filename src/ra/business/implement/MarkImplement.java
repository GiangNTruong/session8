package ra.business.implement;

import ra.business.config.InputMethods;
import ra.business.design.CRUD;
import ra.business.entity.Mark;

public class MarkImplement implements CRUD {
    private static Mark[] marks =new Mark[100];
    private int size = 0 ;
    @Override
    public void create() {
        if (size==100){
            System.err.println("Mảngdđầy");
        }else {
            Mark newMark = new Mark();
            newMark.inputMarkSubject();
            marks[size++]=newMark;
        }
    }

    @Override
    public void display() {
        if (size==0){
            System.err.println("Mảng ko có ptu");
        }else {
            for (int i = 0; i < size; i++) {
                System.out.println(marks[i]);
            }
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập ID của sinh viên muốn sửa điểm");
        byte idEdit = InputMethods.getByte();
        for (int i = 0; i < size; i++) {
            if (idEdit == marks[i].getId()) { // Giả sử bạn có phương thức getId() trong lớp Mark
                System.out.println("Bạn muốn sửa điểm môn nào?");
                System.out.println("1. Toán");
                System.out.println("2. Anh");
                System.out.println("3. Lý");
                byte choice = InputMethods.getByte();
                switch(choice) {
                    case 1:
                        System.out.println("Nhập điểm toan");
                        marks[i].setSubjectMath(InputMethods.getByte());
                        System.out.println("Đã cập nhật điểm Toán.");
                        break;
                    case 2:
                        System.out.println("Nhập điểm Anh");
                        marks[i].setSubjectEnglish(InputMethods.getByte());
                        System.out.println("Đã cập nhật điểm Anh.");
                        break;
                    case 3:
                        System.out.println("Nhập điểm Lý");
                        marks[i].setPhysical(InputMethods.getByte());
                        System.out.println("Đã cập nhật điểm Lý.");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ.");
                        break;
                }
                break; // Kết thúc vòng lặp sau khi tìm thấy và chỉnh sửa sinh viên
            }
        }
    }




    @Override
    public void delete() {
        System.out.println("Nhập diem mon muon xóa");
        byte idDelete = InputMethods.getByte();
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (marks[i].getPhysical() == idDelete){
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                marks[i] = marks[i + 1];
            }
            size--;
            System.out.println("Đã xóa thành công.");
        } else {
            System.out.println("Không tìm thấy điểm cần xóa.");
        }
    }

}
