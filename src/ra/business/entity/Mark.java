package ra.business.entity;

import ra.business.config.InputMethods;

import java.util.Scanner;

public class Mark {
    private int id; // Giả sử bạn đã khai báo id cho mỗi đối tượng Mark
    private int subjectMath;
    private int subjectEnglish;
    private int Physical;

    public Mark() {
    }

    public Mark(int subjectMath, int subjectEnglish, int physical) {
        this.subjectMath = subjectMath;
        this.subjectEnglish = subjectEnglish;
        Physical = physical;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSubjectMath() {
        return subjectMath;
    }

    public void setSubjectMath(int subjectMath) {
        this.subjectMath = subjectMath;
    }

    public int getSubjectEnglish() {
        return subjectEnglish;
    }

    public void setSubjectEnglish(int subjectEnglish) {
        this.subjectEnglish = subjectEnglish;
    }

    public int getPhysical() {
        return Physical;
    }

    public void setPhysical(int physical) {
        Physical = physical;
    }
    public void inputMarkSubject(){

        System.out.println("Nhập điểm toan");
        this.subjectMath= InputMethods.getByte();
        System.out.println("Nhập điểm Anh");
        this.subjectEnglish= InputMethods.getByte();
        System.out.println("Nhập điểm Lý");
        this.Physical= InputMethods.getByte();

    }

    @Override
    public String toString() {
        return "Mark{" +
                "subjectMath=" + subjectMath +
                ", subjectEnglish=" + subjectEnglish +
                ", Physical=" + Physical +
                '}';
    }
}
