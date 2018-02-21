package clasesInternas;

public class A2 {
    int a = 10;
    static int b = 5;

    public void metodo(){
        final int x = 0;
        class B{
            void otroMetodo(){
                System.out.println(a);
                System.out.println(b);
                System.out.println(x);
            }
        }

        B in = new B();
        in.otroMetodo();
    }

    public static void main(String args[]){
        new A().metodo();
    }
}
