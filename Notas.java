package Try_catchJava;

public class Notas {
	public Double a;
	public Double b;


	//contrutor
	public Notas(Double a, Double b) {
		if(((a+b)/2)>=7) {
			throw new RuntimeException("Parab�ns voc� esta aprovado");
		}
		else if (((a+b)/2)<7) {
			throw new RuntimeException("Infelizmente voc� esta reprovado");
		}
		this.a=a;
		this.b=b;
		
	}
	
	}

	

