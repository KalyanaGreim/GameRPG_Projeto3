package enums;

public enum Motivation {
	
	VINGANCA, GLORIA;

	public String initialText() {
		switch (this) {
		case VINGANCA:
			return "Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo, quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).";
		case GLORIA:
			return "Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.";
		default:
			return "";
		}
	}

	public String defeatText() {
		switch (this) {
		case VINGANCA:
			return "Não foi possível concluir sua vingança, e agora resta saber \n" + "se alguém se vingará por você.";
		case GLORIA:
			return "A glória que buscavas não será sua, e a cidade aguarda por \n" + "seu(sua) próximo(a) herói(na).";
		default:
			return "";
		}
	}

	public String victoryText() {
		switch (this) {
		case VINGANCA:
			return "Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você pode seguir sua vida.";
		case GLORIA:
			return "O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria. A glória o aguarda, você a conquistou.";
		default:
			return "";
		}
	}

}
