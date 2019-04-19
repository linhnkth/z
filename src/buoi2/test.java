package buoi2;

public class test {
    public static void test1(String args[]) {
        hinhchunhat hinh = new hinhchunhat();
        hinh.Nhap();
        System.out.println("Chi vi= :" + hinh.Tinhchuvi());
        System.out.println("Diện tích: " +hinh.Tinhdientich() );
    }
}
