package buoi2;

import java.util.Scanner;

public class Human {
    public String name;
    public int age;
    public String country;

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten: ");
        name = scanner.nextLine();
        System.out.println("tuoi: ");
        age = scanner.nextInt();
        System.out.println("Country: ");
        country = scanner.nextLine();
    }

    public void Info() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("Country: " + country);
    }


    public void sayHello() {

    }

}

