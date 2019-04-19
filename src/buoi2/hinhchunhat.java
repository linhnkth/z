package buoi2;

import java.util.Scanner;

public class hinhchunhat {
    private double canh1;
    private double canh2;

    public double getCanh1() {
        return canh1;
    }

    public void setCanh1(double canh1) {
        this.canh1 = canh1;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public double getCanh2() {
        return canh2;
    }

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh 1: ");
        canh1 = scanner.nextDouble();
        System.out.println("Nhập cạnh 2: ");
        canh2 = scanner.nextDouble();
    }

    public double Tinhchuvi(double canh1, double canh2) {
        return (canh1 + canh2) * 2;
    }

    public double Tinhdientich(double canh1, double canh2) {
        return canh1 * canh2;
    }

}
