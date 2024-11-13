
public class Motor {

	public Motor(Integer potencia) {
		if (potencia < 1) {
			this.potencia = 1;
		} else if (potencia > 100) {
			this.potencia = 100;
		} else { 
			this.potencia = potencia;	
		}

	}

	private Integer potencia;
	
	public Integer getPotencia() {
		return this.potencia;
	}

}
