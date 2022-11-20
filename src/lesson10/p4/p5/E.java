package lesson10.p4.p5;

import lesson10.p1.*;
import lesson10.p1.p2.p3.C;
import lesson10.p4.D;

import static lesson10.p1.p2.B.*;

public class E {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a);
        System.out.println(a.getA());

        System.out.println(b);
        System.out.println(getB());

        C c = new C();
        System.out.println(c.c);
        System.out.println(c.getC());

        D d = new D();
        System.out.println(d.d);
        System.out.println(d.getD());
    }
}
