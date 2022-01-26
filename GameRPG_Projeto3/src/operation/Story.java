package operation;

public class Story {
	
	public static void part1() {
		Option.printOnScreen("PART 1",
				"A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.");
	}

	public static void part2() {
		Option.printOnScreen("PART 2",
				"Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de todos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu equipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um passo de encerrar para sempre esse mal.");
	}

	public static void part3(String textoMotivacaoInicial) {
		Option.printOnScreen("PART 3", textoMotivacaoInicial);
	}

	public static void part4() {
		Option.printOnScreen("PART 4",
				"Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado. Você avança pelo portal.");
	}

	public static void part5() {
		Option.printOnScreen("PART 5",
				"A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à frente, ou desistir.A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à frente, ou desistir.");
	}

	public static void continuar() {
		Option.printOnScreen("CONINUOU",
				"Você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta aberta.");
	}

	public static void porta() {
		Option.printOnScreen(" ",
				"Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera sobre como passar pela porta.");
	}

	public static void passarPelaPorta(String texto) {
		Option.printOnScreen("PASSANDO PORTA", texto);
	}

	public static void part6() {
		Option.printOnScreen("PART 6",
				"Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que precisará primeiro derrotar o que estiver nas outras duas portas laterais, antes de conseguir enfrentar o líder.");
	}

	public static void portaDireita(String texto) {
		Option.printOnScreen("ENTROU NA PORTA DA DIREITA", texto);
	}

	public static void derrotaArmeiro() {
		Option.printOnScreen("",
				"Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");
	}

	public static void pegarArmadura() {
		Option.printOnScreen("PEGOU ARMADURA",
				"Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de armaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios à sua frente.\r\n"
						+ "Sua defesa foi melhorada!");
	}

	public static void naoPegarArmadura() {
		Option.printOnScreen("NÃO PEGOU", "Você decide que não precisa utilizar nada que venha das mãos do inimigo.");
	}

	public static void part7() {
		Option.printOnScreen("PART 7",
				"Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva presa ao cinto.");
	}

	public static void portaEsquerda(String texto) {
		Option.printOnScreen("ENTROU NA PORTA ESQUERDA", texto);
	}

	public static void derrotaAlquimista() {
		Option.printOnScreen("",
				"Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado, pega a garrafa e pondera se deve beber um gole.");
	}

	public static void pegarPocao() {
		Option.printOnScreen("", "Você se sente revigorado para seguir adiante! Sua vida foi recuperada!");
	}

	public static void negarPocao() {
		Option.printOnScreen("", "Você fica receoso de beber algo produzido pelo inimigo");
	}

	public static void part8() {
		Option.printOnScreen("PART 8",
				"Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave abre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa que leva presa ao cinto.");
	}

	public static void part9() {
		Option.printOnScreen("PART 9",
				"De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca no combate que você sabe que irá se seguir, e adentra a porta.");
	}

	public static void portaCentral(String texto) {
		Option.printOnScreen("ENTROU NA PORTA CENTRAL", texto);
	}

	public static void derrotaFinal(String texto) {
		Option.printOnScreen("VOCÊ CONSEGUIU!", texto);
	}

	public static void fechamento() {
		Option.printOnScreen("FECHAMENTO",
				"Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em direção à noite, retornando à cidade. Seu dever está cumprido.");
	}

	public static void desistir() {
		Option.printOnScreen("DESISTIU!",
				"O medo invade o seu coração e você sente que ainda não está à altura do desafio. Você se volta para a noite lá fora e corre em direção à segurança.");
	}

}

