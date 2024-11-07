
public class CarroCorrida {
									
	public CarroCorrida(Integer numeroIdentificacao, Double velocidadeMaxima) {
		this.numeroIdentificacao = numeroIdentificacao;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	//Estado - Atributos - variáveis
	private Integer numeroIdentificacao;
	private Double velocidadeAtual;
	private Double velocidadeMaxima; 
	private Piloto piloto;
	
	//Comportamento - Métodos
	
	void ligar() { //operadores - nome() { ...}
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
		
		velocidadeAtual -= intensidadeFreada * 0.25;
		
		if(velocidadeAtual < 0) {
			velocidadeAtual = 0.0;
		}
	}

	public Integer getNumeroIdentificacao() {
		return numeroIdentificacao;
	}
	
	//ModificadorDeAcesso TipoRetornado nome() {
	//return valor;
	//} 
	
	public void setNumeroIdentificacao(Integer numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
		
	}
	
	public Piloto getPiloto() {
		return piloto;
	}
	
	public void setPiloto (Piloto piloto) {
		this.piloto = piloto;
	}
	
	public Double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	
}
