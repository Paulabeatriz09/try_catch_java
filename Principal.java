package Try_catchJava;

public class Principal {

	public static void main(String[] args) {
		double a=4;
		double b=9;
	
		
		try {
			Notas media=new Notas(a,b);
			System.out.println("Parabéns");
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}
}
