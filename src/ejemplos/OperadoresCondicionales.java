package ejemplos;

public class OperadoresCondicionales {
	public static void main(String[] args) {
		System.out.println("!falso "+(!false));
		System.out.println("!verdadero "+(!true));
		
		System.out.println("true & true "+(true&true));
		System.out.println("false & true "+(false&true));
		System.out.println("false&false "+ (false&false));
		
		System.out.println("true | true "+ (true|true));
		System.out.println("false | true "+(false|true));
		System.out.println("false | false "+(false|false));
		
		System.out.println("true ^ true "+(true^true));
		System.out.println("true ^ flase "+(true^false));
		System.out.println("false ^ false "+(false^false));
		
		System.out.println("true&&true "+(true&&true));
		System.out.println("true&&false "+(true&&false));
		System.out.println("false&&false "+(false&&false));
		
		
		
		
	}
}
