/**
 * project : Bootcamp1
 * package : PACKAGE_NAME
 * author  : Allamuradov Tal'at
 * date    : 09.09.2022_14:43
 */
public class test {
    public static void main(String[] args) {
        A a = new A();
        A.B b = new A.B();
        A.B.C c = b.new C();
        System.out.println("=== === === === ===");
        A.C ac = a.new C();
        A.C.B ab = ac.new B();
        A.C.B.F f= ab.new F();


    }
}

class A {
    public static class B {
        class C {

        }
    }

    class C {
        class B {
            class F {

            }
        }
    }
}