
public class CarroCorrida {
	
	//Estado
	Integer numeroIdentificacao;
	Double velocidadeAtual;
	Double velocidadeMaxima; 
	
	//Comportamento
	
	void ligar() {
		System.out.println("VRUUUmmmmmmmmm...CARRO LIGADO!");
	}
	
	void desligar() {
		System.out.println("MMMMMMMmmmm..... CARRO DESLIGADO!");
	}
	
	void acelerar() {
		
		velocidadeAtual += 10;
		
		if(velocidadeAtual > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		}
		
	}
	
	void frear (Integer intensidadeFreada) {
		if(intensidadeFreada > 100) {
			intensidadeFreada = 100;
		}else if(intensidadeFreada < 0) {
			intensidadeFreada = 0;
		}
		
		velocidadeAtual = intensidadeFreada * 0.25;
		
		if(velocidadeAtual < 0) {
			velocidadeAtual = 0.0;
		}
	}

}
