package enums;

public enum Door {
	
	ESQUERDA, DIREITA, CENTRAL;

	public String text() {
		
		switch (this) {
		case DIREITA:
			return "Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem para espalhar o terror nas cidades e vilas da região.\r\n"
					+ "Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em posição de combate. Ele avança em sua direção.";
		case ESQUERDA:
			return "Você retorna à sala anterior e se dirige à porta da esquerda. Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos soldados para aterrorizar a região.\r\n"
					+ "No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.";
		case CENTRAL:
			return "Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados às paredes.\r\n"
					+ "Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla.";
		default:
			return "";
		}
	}
	
	

}
