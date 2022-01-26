package operation;

import java.util.List;
import java.util.Scanner;

public class Option {
	
	public static Scanner scan = new Scanner(System.in);

	public static String generateOption(Enum<?>[] enumOption, String text) {
		int option;
		
		do {
			System.out.println();
			System.out.println(text);
			for (Enum<?> enum1 : enumOption) {
				System.out.println(enum1.ordinal() + " - " + enum1);
			}
			option = getOption();
			if (option < 0 || option >= enumOption.length) {
				System.out.println("Opção inválida!");
			}
		} while (option < 0 || option >= enumOption.length);

		return enumOption[option].name();
	}

	public static Object generateOptions(List<?> arrayOption, String text) {
		int option;
		do {
			System.out.println();
			System.out.println(text);
			for (int i = 0; i < arrayOption.size(); i++) {
				System.out.println(i + " - " + arrayOption.get(i));
			}
			option = getOption();
			if (option < 0 || option >= arrayOption.size()) {
				System.out.println("Opção inválida, digite um número válido!");
			}
		} while (option < 0 || option >= arrayOption.size());
		return arrayOption.get(option);
	}

	private static int getOption() {
		System.out.print("Escolha: ");
		int option = scan.nextInt();
		scan.nextLine();
		return option;
	}

	public static void pularLinha() {
		System.out.println();
		System.out.print("Pressione a tecla ENTER para continuar...");
		scan.nextLine();
	}

	public static void printOnScreen(String title, String text) {
		text = breakLines(text, 100);
		System.out.println();
		System.out.println(title);
		System.out.println(text);
		pularLinha();
	}

	public static String breakLines(String textPure, int qtdCaracteres) {
		String[] textArray = textPure.split("");
		int counter = qtdCaracteres;
		StringBuilder stringFormated = new StringBuilder();
		for (int i = 0; i <= textArray.length; i++) {
			if (i != 0 && i % qtdCaracteres == 0 && counter >= i) {
				for (int b = i - qtdCaracteres; b < i; b++) {
					stringFormated.append(textArray[b]);
				}
				stringFormated.insert(stringFormated.lastIndexOf(" ") + 1, "\n");
				counter = i + qtdCaracteres;
			}
		}
		int difCaracteres = textArray.length % qtdCaracteres;
		for (int i = difCaracteres; i > 0; i--) {
			stringFormated.append(textArray[textArray.length - i]);
		}
		return stringFormated.toString();
	}

}

