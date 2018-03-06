package clasesInternas;

public class Local {
	int a = 10;
	static int b = 5;
	public void metodo() {
		final int x = 0;
		class B{
			void otroMetodo() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(x);
			}
		}
		B bin = new B();
		bin.otroMetodo();
		}
	public static void main(String[] args) {
		new Local().metodo();
	}
}
