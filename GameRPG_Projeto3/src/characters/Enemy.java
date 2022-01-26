package characters;

import enums.TypeClass;

//herança
public class Enemy extends Personage {

	private double modific;
	
	//construtor
	public Enemy(String nome, TypeClass classe, double modific) {
		
		super(nome, classe);
		this.modific = modific;
		this.setVida((int) (getVida() * modific));
	}
	
	// getters and setters
	public double getModific() {
		return modific;
	}

}
