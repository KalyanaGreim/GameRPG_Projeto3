package enums;

import java.util.ArrayList;
import java.util.List;

public enum TypeClass {
	
	ARQUEIRO(27, 24, 20, 300), CAÇADOR(17, 16, 18, 420), GUERREIRO(21, 20, 24, 380), MONGE(21, 25, 23, 280);

	private int forcaBase;
	private int vitalidadeBase;
	private int agilidadeBase;
	private int vidaBase;

	TypeClass(int forca, int vitalidade, int agilidade, int vida) {
		this.forcaBase = forca;
		this.vitalidadeBase = vitalidade;
		this.agilidadeBase = agilidade;
		this.vidaBase = vida;
	}
	// acessando atributos private com getters and setters
	public int getForcaBase() {
		return forcaBase;
	}

	public int getVitalidadeBase() {
		return vitalidadeBase;
	}

	public int getAgilidadeBase() {
		return agilidadeBase;
	}

	public int getVidaBase() {
		return vidaBase;
	}

	public int defesaBase() {
		return vitalidadeBase + agilidadeBase;
	}
	
	//listagem de armas por tipo
	public List<TypeArm> tiposDeArmasDisponiveis() {
		List<TypeArm> types = new ArrayList<>();
		switch (this) {
		case ARQUEIRO:
			types.add(TypeArm.ARCO);
			types.add(TypeArm.CETRO);
			break;
		case CAÇADOR:
			types.add(TypeArm.CHICOTE);
			types.add(TypeArm.ESTACA);
			break;
		case GUERREIRO:
			types.add(TypeArm.MACHADO);
			types.add(TypeArm.ESPADA);
			break;
		case MONGE:
			types.add(TypeArm.ADAGA);
			types.add(TypeArm.CAJADO);
			break;
		default:
			break;
		}
		return types;
	}
	//poliformismo
	@Override
	public String toString() {
		return name() + ": " + "Força: " + forcaBase + " | Defesa: " + defesaBase() + " | Vida: " + vidaBase;
	}

}
