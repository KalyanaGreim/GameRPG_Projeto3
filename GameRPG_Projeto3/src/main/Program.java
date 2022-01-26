package main;

import java.util.List;
import java.util.Scanner;

import characters.Player;
import enums.ActionDoor;
import enums.DifficultyLevel;
import enums.Furcation;
import enums.Motivation;
import enums.Door;
import enums.Sex;
import enums.TypeClass;
import operation.Arm;
import operation.Game;
import operation.Option;
import operation.Story;


public class Program {
	//principal
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Game jogo = new Game();
		
		//tratamento de erros
		try {
			System.out.println("Seja bem vindo(a) à BATALHA FINAL!\n");
			System.out.print("Informe seu nome: ");
			String nome = scan.nextLine();

			Sex sexo = Sex.valueOf(Option.generateOption(Sex.values(), "Selecione o Sexo:"));
			TypeClass classe = TypeClass.valueOf(Option.generateOption(TypeClass.values(), "Escolha a Classe:"));
			Player player1 = new Player(nome, classe, sexo);
			List<Arm> armasDisponiveisPlayer1 = player1.armAvailable(jogo.getArmasNoJogo());

			Arm arma = (Arm) Option.generateOptions(armasDisponiveisPlayer1, "Escolha a Arma:");
			player1.setArma(arma);
			System.out.println("\nDados do Jogador: \n" + player1);

			DifficultyLevel dificuldade = DifficultyLevel
					.valueOf(Option.generateOption(DifficultyLevel.values(), "Nível de dificuldade:"));
			jogo.setDificuldade(dificuldade);

			System.out.println("\nIniciando jogo... \nPressione a tecla ENTER para continuar...");
			scan.nextLine();

			Story.part1();
			Story.part2();

			Motivation motivacao = Motivation.valueOf(Option.generateOption(Motivation.values(), "Qual é a sua motivação?"));
			player1.setMotivacao(motivacao);
			Story.part3(player1.getMotivacao().initialText());

			Story.part4();
			Story.part5();

			Furcation escolha = Furcation.valueOf(Option.generateOption(Furcation.values(), "Deseja seguir ou desistir?"));
			if (escolha.equals(Furcation.DESISTIR)) {
				Story.desistir();
				System.out.println();
				throw new Exception("Fim de jogo!");
			}

			Story.continuar();
			Story.porta();
			ActionDoor acaoPorta = ActionDoor.valueOf(Option.generateOption(ActionDoor.values(), "Como deseja passar pela porta?"));
			jogo.setAcaoPorta(acaoPorta);
			jogo.passarPorta(player1);

			Story.part6();
			Story.portaDireita(Door.DIREITA.text());
			
			jogo.entrarEmCombate(player1, jogo.validarSeAtaca(), Door.DIREITA);
			Story.derrotaArmeiro();
			System.out.println("Deseja usar a armadura?");
			System.out.println("0 - NÃO");
			System.out.println("1 - SIM");
			System.out.print("Escolha: ");
			
			boolean opcao = scan.nextInt() == 1 ? true : false;
			
			if (opcao) {
				Story.pegarArmadura();
				player1.addDefesa(5);
			} else {
				Story.naoPegarArmadura();
			}
			
			Story.part7();
			Story.portaEsquerda(Door.ESQUERDA.text());

			jogo.entrarEmCombate(player1, jogo.validarSeAtaca(), Door.ESQUERDA);

			Story.derrotaAlquimista();
			System.out.println("Deseja beber a poção?");
			System.out.println("0 - NÃO");
			System.out.println("1 - SIM");
			System.out.print("Escolha: ");
			opcao = scan.nextInt() == 1 ? true : false;
			if (opcao) {
				Story.pegarPocao();
				player1.restaurarVida();
			} else {
				Story.negarPocao();
			}

			Story.part8();
			Story.part9();

			Story.portaCentral(Door.CENTRAL.text());
			jogo.entrarEmCombate(player1, jogo.validarSeAtaca(), Door.CENTRAL);

			Story.derrotaFinal(player1.getMotivacao().victoryText());
			Story.fechamento();

			System.out.println();
			System.out.println("FIM");

		} 
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			
		} 
		
		finally {

			scan.close();
			System.out.println();
			System.out.println("Jogo encerrado!");

		}

	}

}

