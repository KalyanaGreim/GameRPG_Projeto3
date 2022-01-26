package characters;

import java.util.ArrayList;
import java.util.List;

import enums.TypeArm;
import enums.TypeClass;
import operation.Arm;

public class Personage {
	
	//encapsulamento
	private Arm arma;
	private String nome;
	private TypeClass classe;
	
	private int agilidade;
	private int defesa;
	private int forca;
	private int vida;
	private int vitalidade;	

	public Personage() {}

	public Personage(String nome, TypeClass classe) {
		
		this.nome = nome;
		this.classe = classe;
		this.forca = classe.getForcaBase();
		this.vitalidade = classe.getVitalidadeBase();
		this.agilidade = classe.getAgilidadeBase();
		this.vida = classe.getVidaBase();
		this.defesa = classe.defesaBase();
	}
	
	//Getters and Setters

	public Arm getArma() {
		return arma;
	}

	public void setArma(Arm arma) {
		this.arma = arma;
	}

	public String getNome() {
		return nome;
	}

	public TypeClass getClasse() {
		return classe;
	}

	public int getForca() {
		return forca;
	}

	public int getVitalidade() {
		return vitalidade;
	}

	public int getAgilidade() {
		return agilidade;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDefesa() {
		return defesa;
	}

	public int obterValorAtaque() {
		int valorAtaque = arma.getValorAtaque() + forca;
		return valorAtaque;
	}

	public void receberAtaque(int dano) {
		vida -= dano;
	}

	public void addDefesa(int defesa) {
		this.defesa += defesa;
	}

	public void restaurarVida() {
		this.vida = classe.getVidaBase();
	}
	
	//List of arms

	public List<Arm> armAvailable(List<Arm> armsOfGame) {
		
		List<Arm> listOfArms = new ArrayList<>();

		armsOfGame.forEach(arm -> {
			
			for (TypeArm type : getClasse().tiposDeArmasDisponiveis()) {
				if (arm.getTipo() == type) {
					listOfArms.add(arm);
				}
			}
		});
		return listOfArms;
	}
	
	// Poliformismo

	@Override
	public String toString() {
		
		return "Nome: " + nome + "\nClasse: " + classe + "\nArma: " + arma;
	}

}
