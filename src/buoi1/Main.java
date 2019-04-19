package buoi1;

import buoi2.Human;

import java.util.Scanner;

public class Main {
    int x = 10;
    static int y = 20;
    static final int z = 40;

    public static void main(String args[]){
        Human human = new Human();
        human.name = "abc";
        human.inputInfo();
        human.Info();

        Human h2 = new Human();
        h2.age = 20;
        h2.sayHello();
    }

    public static void main2(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("so vua nhap " + n);
        Double n2 = scanner.nextDouble();
        String str = scanner.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + 1);
        }

        Main m = new Main();
        System.out.println(m.x);
        m.x = m.x + 10;
        System.out.println(m.x);

        System.out.println("y= " + Main.y);
        Main.y += 10;
        System.out.println("y= " + Main.y);

        System.out.println("z= " + Main.y);

        Main.y = m.x % 2 == 0 ? m.x : 20;

        if (m.x % 2 == 0) {
            Main.y = m.x;
        } else {
            Main.y = 20;
        }

    }
}
