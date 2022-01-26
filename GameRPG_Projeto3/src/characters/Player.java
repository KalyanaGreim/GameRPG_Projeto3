package characters;

import enums.Motivation;
import enums.Sex;
import enums.TypeClass;

//herança

public class Player extends Personage {
	//encapsulamento
	private Sex sexo;
	private Motivation motivacao;

	public Player() {}

	//construtor
	public Player(String nome, TypeClass classe, Sex sexo) {
		super(nome, classe); //chamamento de atributos 'pai'
		this.sexo = sexo;
	}

	public Sex getSexo() {
		return sexo;
	}

	public Motivation getMotivacao() {
		return motivacao;
	}

	public void setMotivacao(Motivation motivacao) {
		this.motivacao = motivacao;
	}

}
