package application;

import java.util.Locale;
import java.util.Scanner;
import endities.Champion;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Champion champion1;
		Champion champion2;

		System.out.println("Digite os dados do Primeiro Campeão");
		System.out.println("Nome: ");
		String name = sc.next();

		System.out.println("Vida inicial: ");
		int life = sc.nextInt();

		System.out.println("Ataque: ");
		int attack = sc.nextInt();

		System.out.println("Armadura: ");
		int armor = sc.nextInt();

		champion1 = new Champion(name, life, attack, armor);

		System.out.println("Digite os dados do Segundo Campeão");
		System.out.println("Nome: ");
		name = sc.next();

		System.out.println("Vida inicial: ");
		life = sc.nextInt();

		System.out.println("Ataque: ");
		attack = sc.nextInt();

		System.out.println("Armadura: ");
		armor = sc.nextInt();

		champion2 = new Champion(name, life, attack, armor);

		System.out.println(champion1.status() + "\n" + champion2.status());

		System.out.println("Quantos turnos você deseja executar?");
		int turnos = sc.nextInt();
		sc.close();
		int x = 1;
		while (turnos != 0) {

			if (champion1.getLife() <= 0 || champion2.getLife() <= 0) {
				turnos = 0;
			} else {
				champion1.takeDamage(champion2.getAttack(), champion1.getLife(), champion1.getArmor());
				champion2.takeDamage(champion1.getAttack(), champion2.getLife(), champion2.getArmor());
				System.out.println(
						"Resultado do turno " + x + ":\n" + champion1.status() + "\n" + champion2.status() + "\n");
				x++;
				turnos--;

			}

		}
		System.out.println("FIM DO COMBATE");
	}

}
