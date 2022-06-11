package testes;

public class Calculadora {
	
	public static void main(String[] args) {
		System.out.println(somar(1, 3));
		System.out.println(subtrair(4, 3));
		System.out.println(multiplicar(7, 3));
		System.out.println(dividir(9, 2));
	}
	
	public static int somar(int a, int b) {
		return a + b;
	}
	
	public static int subtrair(int a, int b) {
		return a - b;
	}
	
	public static int multiplicar(int a, int b) {
		return a * b;
	}
	
	public static double dividir(double a, double b) {
		return a / b;
	}
}
