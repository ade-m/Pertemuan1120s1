public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Luar a = new Luar();
        B b = new B() {
            public void doA(){
                System.out.println("ini adalah method A");
            }
            public void doB(){
                System.out.println("ini adalah method B");
            }
        };
        b.doA();
        b.doB();

        B c = new B() {
            public void doA(){
                System.out.println("1+1=2");
            }
            public void doB(){
                System.out.println("2+2=4");
            }
        };
        c.doA();
        c.doB();
    }
}
