package operation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import characters.Enemy;
import characters.Personage;
import characters.Player;
import enums.ActionDoor;
import enums.DifficultyLevel;
import enums.Motivation;
import enums.Door;
import enums.TypeArm;
import enums.TypeClass;

public class Game {

	private static Scanner scan = new Scanner(System.in);

	private static int jogarDado(int numberMax) {
		Random r = new Random();
		return r.nextInt(numberMax) + 1;
	}

	private DifficultyLevel dificuldade;
	private Motivation motivacao;
	private ActionDoor acaoPorta;
	private List<Arm> armasNoJogo = new ArrayList<>();
	private boolean emCombate = false;

	public Game() {
		
		armasNoJogo.add(new Arm("Honor of death", 26, 33, TypeArm.ADAGA));
		armasNoJogo.add(new Arm("Bow of death", 16, 35, TypeArm.ARCO));
		armasNoJogo.add(new Arm("Magic staffs", 19, 36, TypeArm.CAJADO));		
		armasNoJogo.add(new Arm("Scepter of Orcus", 22, 31, TypeArm.CETRO));
		armasNoJogo.add(new Arm("Lineage of persecution", 28, 41, TypeArm.CHICOTE));
		armasNoJogo.add(new Arm("Torture blade", 32, 38, TypeArm.ESPADA));
		armasNoJogo.add(new Arm("Hunter of extinction", 23, 33, TypeArm.ESTACA));
		armasNoJogo.add(new Arm("Beast From the Ashes", 28, 33, TypeArm.MACHADO));
	}

	public DifficultyLevel getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(DifficultyLevel dificuldade) {
		this.dificuldade = dificuldade;
	}

	public Motivation getMotivacao() {
		return motivacao;
	}

	public void setMotivacao(Motivation motivacao) {
		this.motivacao = motivacao;
	}

	public ActionDoor getAcaoPorta() {
		return acaoPorta;
	}

	public void setAcaoPorta(ActionDoor acaoPorta) {
		this.acaoPorta = acaoPorta;
	}

	public List<Arm> getArmasNoJogo() {
		return armasNoJogo;
	}

	public boolean isEmCombate() {
		return emCombate;
	}

	public void passarPorta(Personage jogador) {
		Story.passarPelaPorta(acaoPorta.text());
		if (acaoPorta.equals(ActionDoor.ANDANDO)) {
			int danoCombat = jogarDado(10);
			jogador.receberAtaque(danoCombat);
			System.out.println("\nVocê recebeu " + danoCombat + " de dano | Vida: " + jogador.getVida());
		}
	}

	public void entrarEmCombate(Player jogador, boolean atacarPrimeiro, Door porta) throws Exception {

		Combat cb = new Combat(jogador, gerarInimigo(porta), dificuldade);

		boolean deathPlayer = false, deathEnemy = false;
		do {

			if (atacarPrimeiro) {
				deathEnemy = cb.ataqueJogador(jogarDado(20));
				if (deathEnemy) {
					System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés!");
					return;
				}

				deathPlayer = cb.ataqueInimigo(jogarDado(20));
				if (deathPlayer) {
					throw new Exception("Voce não estava preparado para a força do inimigo. "
							+ jogador.getMotivacao().defeatText());
				}
			} else {
				deathPlayer = cb.ataqueInimigo(jogarDado(20));
				if (deathPlayer) {
					throw new Exception("Voce não estava preparado para a força do inimigo. "
							+ jogador.getMotivacao().defeatText());
				}
				deathEnemy = cb.ataqueJogador(jogarDado(20));
				if (deathEnemy) {
					System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés!");
					return;
				}
			}
			System.out.println();
			System.out.println("O que deseja?");
			System.out.println("0 - FUGIR");
			System.out.println("1 - ATACAR");
			System.out.print("Escolha: ");

			int opc = scan.nextInt();
			emCombate = opc == 1 ? true : false;
			if (!emCombate) {
				throw new Exception("Desistiu! Já sabia!");
			}
			System.out.println();
		} while (isEmCombate());
	}

	public boolean validarSeAtaca() {
		System.out.println("O que deseja?");
		System.out.println("0 - ESPERAR");
		System.out.println("1 - ATACAR");
		System.out.print("Escolha: ");
		boolean opc = scan.nextInt() == 1 ? true : false;
		System.out.println("\nIniciando combate...");
		return opc;
	}

	public Enemy gerarInimigo(Door porta) {
		Enemy inimigo;
		if (porta.equals(Door.DIREITA)) {
			inimigo = new Enemy("JACOB", TypeClass.ARQUEIRO, 0.30);
			inimigo.setArma(armasNoJogo.get(1));
		} else if (porta.equals(Door.ESQUERDA)) {
			inimigo = new Enemy("HARRY", TypeClass.CAÇADOR, 0.35);
			inimigo.setArma(armasNoJogo.get(4));
		} else {
			inimigo = new Enemy("SÓCRATES", TypeClass.GUERREIRO, 0.45);
			inimigo.setArma(armasNoJogo.get(6));
		}
		return inimigo;
	}
}