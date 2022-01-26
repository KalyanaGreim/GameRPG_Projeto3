package operation;

import characters.Enemy;
import characters.Personage;
import characters.Player;
import enums.DifficultyLevel;

public class Combat {

	private int turno;
	private Player jogador;
	private Enemy inimigo;
	private Personage vencedor;
	private DifficultyLevel dificuldade;

	public Combat(Player p1, Enemy in, DifficultyLevel dificuldade) {
		this.jogador = p1;
		this.inimigo = in;
		this.dificuldade = dificuldade;
		this.turno = 1;
	}

	public int getTurno() {
		return turno;
	}

	public Player getJ() {
		return jogador;
	}

	public Enemy getI() {
		return inimigo;
	}

	public DifficultyLevel getDificuldade() {
		return dificuldade;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public Personage getVencedor() {
		return vencedor;
	}

	public boolean ataqueJogador(int dado) {

		int dano;
		if (dado == 1) {
			System.out.println("Você errou seu ataque! O inimigo não sofreu dano algum.");
		}
		
		if (dado == 20) {
			dano = (int) ((jogador.obterValorAtaque() + dado) * dificuldade.getModAtaqueJogador());
			inimigo.receberAtaque(dano);
			System.out.println("Você acertou um ataque crítico! Você atacou com a/o " + jogador.getArma().getNome()
					+ " e causou " + dano + " de dano no inimigo! ");
		}
		
		if (dado > 1 && dado < 20) {
			dano = (int) ((jogador.obterValorAtaque() + dado - inimigo.getDefesa()) * dificuldade.getModAtaqueJogador());
			inimigo.receberAtaque(dano);
			System.out.println(
					"Você atacou com a/o " + jogador.getArma().getNome() + " e causou " + dano + " de dano no inimigo! ");
		}
		turno++;
		
		return inimigo.getVida() <= 0 ? true : false;
	}

	public boolean ataqueInimigo(int dado) {
		int dano;
		if (dado == 1) {
			System.out.println("O inimigo errou o ataque! Você não sofreu dano.");
		}
		
		if (dado == 20) {
			dano = (int) ((inimigo.obterValorAtaque() + dado) * dificuldade.getModAtaqueInimigo());
			jogador.receberAtaque(dano);
			System.out.println("O inimigo acertou um ataque crítico! Você sofreu " + dano + " de dano e agora possui "
					+ jogador.getVida() + " pontos de vida.");
		}
		
		if (dado > 1 && dado < 20) {
			dano = (int) ((inimigo.obterValorAtaque() + dado - jogador.getDefesa()) * dificuldade.getModAtaqueInimigo());
			jogador.receberAtaque(dano);
			System.out.println("O inimigo atacou! Voce sofreu " + dano + " de dano e agora possui " + jogador.getVida()
					+ " pontos de vida.");
		}
		turno++;
		
		return jogador.getVida() <= 0 ? true : false;
	}

}

