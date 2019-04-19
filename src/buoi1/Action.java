package buoi1;

import buoi2.Human;

public class Action extends Human {
    public void run() {
        this.age = 20;
        this.sayHello();
        this.name = "abc";
        this.country = "abc";
    }
}
