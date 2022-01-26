package enums;

public enum DifficultyLevel {
	
	FACIL(1.00, 0.80), NORMAL(1.00, 1.00), DIFICIL(0.90, 1.00);

	private double modAttackPlayer;
	private double modAttackEnemy;

	private DifficultyLevel(double modAttackPlayer, double modAttackEnemy) {
		this.modAttackPlayer = modAttackPlayer;
		this.modAttackEnemy = modAttackEnemy;
	}

	public double getModAtaqueJogador() {
		return modAttackPlayer;
	}

	public double getModAtaqueInimigo() {
		return modAttackEnemy;
	}

}
