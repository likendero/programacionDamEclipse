package clasesInternas;

public class A3 {
    int a = 10;
    static int b = 5;

    
        static class B{
             B(){
            	A s = new A();
                System.out.println(s.a);
                System.out.println(b);
                
            }
        }

        
        

    public static void main(String args[]){
        A3.B ab = new A3.B();
    }
}
