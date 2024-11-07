

public class Corrida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarroCorrida carroEquipeVelocidade = new CarroCorrida(1,100.0);
		CarroCorrida carroEquipeTrapaceiros = new CarroCorrida(2,100.0);

		Piloto pilotoEquipeVelocidade = new Piloto();
		Piloto pilotoEquipeTrapaceiros = new Piloto();

		pilotoEquipeVelocidade.setNome("Piloto2");
		pilotoEquipeVelocidade.setIdade(27);
		pilotoEquipeVelocidade.setHabilidade(65);

		pilotoEquipeTrapaceiros.setNome("Piloto1");
		pilotoEquipeTrapaceiros.setIdade(25);
		pilotoEquipeTrapaceiros.setHabilidade(75);

		carroEquipeVelocidade.setPiloto(pilotoEquipeVelocidade);
		carroEquipeTrapaceiros.setPiloto(pilotoEquipeTrapaceiros);


		carroEquipeVelocidade.ligar();
		carroEquipeTrapaceiros.ligar();

		carroEquipeVelocidade.acelerar();
		carroEquipeTrapaceiros.acelerar();

		carroEquipeVelocidade.acelerar();
		carroEquipeTrapaceiros.acelerar();

		carroEquipeVelocidade.acelerar();
	    carroEquipeTrapaceiros.acelerar();
		
	}

}
