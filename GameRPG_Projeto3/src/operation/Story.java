package operation;

public class Story {
	
	public static void part1() {
		Option.printOnScreen("PART 1",
				"A noite se aproxima, a lua j� surge no c�u, estrelas v�o se acendendo, e sob a luz do crep�sculo voc� est� prestes a entrar na fase final da sua miss�o. Voc� olha para o portal � sua frente, e sabe que a partir desse ponto, sua vida mudar� para sempre.");
	}

	public static void part2() {
		Option.printOnScreen("PART 2",
				"Mem�rias do caminho percorrido para chegar at� aqui invadem sua mente. Voc� se lembra de todos os inimigos j� derrotados para alcan�ar o covil do l�der maligno. Olha para seu equipamento de combate, j� danificado e desgastado depois de tantas lutas. Voc� est� a um passo de encerrar para sempre esse mal.");
	}

	public static void part3(String textoMotivacaoInicial) {
		Option.printOnScreen("PART 3", textoMotivacaoInicial);
	}

	public static void part4() {
		Option.printOnScreen("PART 4",
				"Inspirado pelo motivo que te trouxe at� aqui, voc� sente seu cora��o ardendo em chamas, suas m�os formigarem em volta da sua arma. Voc� a segura com firmeza. Seu foco est� renovado. Voc� avan�a pelo portal.");
	}

	public static void part5() {
		Option.printOnScreen("PART 5",
				"A escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal �s suas costas. � sua frente, s� � poss�vel perceber que voc� se encontra em um corredor extenso. Voc� s� pode ir � frente, ou desistir.A escurid�o te envolve. Uma ilumina��o muito fraca entra pelo portal �s suas costas. � sua frente, s� � poss�vel perceber que voc� se encontra em um corredor extenso. Voc� s� pode ir � frente, ou desistir.");
	}

	public static void continuar() {
		Option.printOnScreen("CONINUOU",
				"Voc� caminha, atento a todos os seus sentidos, por v�rios metros, at� visualizar a frente uma fonte de luz, que voc� imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.");
	}

	public static void porta() {
		Option.printOnScreen(" ",
				"Voc� se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.");
	}

	public static void passarPelaPorta(String texto) {
		Option.printOnScreen("PASSANDO PORTA", texto);
	}

	public static void part6() {
		Option.printOnScreen("PART 6",
				"Voc� se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela pela qual voc� entrou, que estava aberta, e as outras tr�s est�o fechadas. A porta � sua frente � a maior das quatro, com inscri��es em seu entorno em uma l�ngua que voc� n�o sabe ler, mas reconhece como sendo a l�ngua antiga utilizada pelo inimigo. Voc� se aproxima da porta e percebe que ela est� trancada por duas fechaduras douradas, e voc� entende que precisar� primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir enfrentar o l�der.");
	}

	public static void portaDireita(String texto) {
		Option.printOnScreen("ENTROU NA PORTA DA DIREITA", texto);
	}

	public static void derrotaArmeiro() {
		Option.printOnScreen("",
				"Ap�s derrotar o Armeiro, voc� percebe que seus equipamentos est�o muito danificados, e olha em volta, encarando todas aquelas pe�as de armaduras resistentes e em �timo estado.");
	}

	public static void pegarArmadura() {
		Option.printOnScreen("PEGOU ARMADURA",
				"Voc� resolve usar os equipamentos do inimigo contra ele, e trocar algumas pe�as suas, que estavam danificadas, pelas pe�as de armaduras existentes na sala. De armadura nova, voc� se sente mais protegido para os desafios � sua frente.\r\n"
						+ "Sua defesa foi melhorada!");
	}

	public static void naoPegarArmadura() {
		Option.printOnScreen("N�O PEGOU", "Voc� decide que n�o precisa utilizar nada que venha das m�os do inimigo.");
	}

	public static void part7() {
		Option.printOnScreen("PART 7",
				"Em uma mesa, voc� encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do l�der inimigo. Voc� pega a chave e guarda numa pequena bolsa que leva presa ao cinto.");
	}

	public static void portaEsquerda(String texto) {
		Option.printOnScreen("ENTROU NA PORTA ESQUERDA", texto);
	}

	public static void derrotaAlquimista() {
		Option.printOnScreen("",
				"Ap�s derrotar o Alquimista, voc� olha em volta, tentando reconhecer alguma po��o do estoque do inimigo. Em uma mesa, voc� reconhece uma pequena garrafa de vidro contendo um l�quido levemente rosado, pega a garrafa e pondera se deve beber um gole.");
	}

	public static void pegarPocao() {
		Option.printOnScreen("", "Voc� se sente revigorado para seguir adiante! Sua vida foi recuperada!");
	}

	public static void negarPocao() {
		Option.printOnScreen("", "Voc� fica receoso de beber algo produzido pelo inimigo");
	}

	public static void part8() {
		Option.printOnScreen("PART 8",
				"Ao lado da porta, voc� v� uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra fechadura da porta do l�der inimigo. Voc� pega a chave e guarda na pequena bolsa que leva presa ao cinto.");
	}

	public static void part9() {
		Option.printOnScreen("PART 9",
				"De volta � sala das portas, voc� se dirige � porta final. Coloca as chaves nas fechaduras, e a porta se abre. Seu cora��o acelera, mem�rias de toda a sua vida passam pela sua mente, e voc� percebe que est� muito pr�ximo do seu objetivo final. Segura sua arma com mais firmeza, foca no combate que voc� sabe que ir� se seguir, e adentra a porta.");
	}

	public static void portaCentral(String texto) {
		Option.printOnScreen("ENTROU NA PORTA CENTRAL", texto);
	}

	public static void derrotaFinal(String texto) {
		Option.printOnScreen("VOC� CONSEGUIU!", texto);
	}

	public static void fechamento() {
		Option.printOnScreen("FECHAMENTO",
				"Voc� se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos voc�s saem em dire��o � noite, retornando � cidade. Seu dever est� cumprido.");
	}

	public static void desistir() {
		Option.printOnScreen("DESISTIU!",
				"O medo invade o seu cora��o e voc� sente que ainda n�o est� � altura do desafio. Voc� se volta para a noite l� fora e corre em dire��o � seguran�a.");
	}

}

