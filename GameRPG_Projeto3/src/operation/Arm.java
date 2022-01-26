package operation;

import java.util.Random;

import enums.TypeArm;

public class Arm {
	//encapsulamento
	private String name;
	private TypeArm type;
	private int attackMin;
	private int attackMax;	
	
	public Arm() {}
	
	//construtor
	public Arm(String nome, int attackMin, int attackMax, TypeArm tipo) {
		this.name = nome;
		this.attackMin = attackMin;
		this.attackMax = attackMax;
		this.type = tipo;
	}
	
	//Getters and Setters

	public String getNome() {
		return name;
	}

	public int getAtaqueMin() {
		return attackMin;
	}

	public int getAtaqueMax() {
		return attackMax;
	}

	public TypeArm getTipo() {
		return type;
	}

	public int getValorAtaque() {
		Random r = new Random();
		return r.nextInt((attackMax - attackMin) + 1) + attackMin;
	}
	
	// Poliformismo
	
	@Override
	public String toString() {
		return name + " (" + type + ") ";
	}

}

