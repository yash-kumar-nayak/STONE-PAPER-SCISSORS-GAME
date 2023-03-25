package com.company;

import java.util.*;
import java.util.Random;

public class _02_rock_paper_scissor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("\n**The Game IS GOING to Start**");
		System.out.println("\t-----THIS GAME IS GOING TO BE IN |-5-| ROUNDS----");
		int rounds = 1;
		int your = 0;
		int computer = 0;
		while (rounds != 6) { // less than one round
			System.out.println("\nENTER YOU CHOICE \'s choice \tLIKE 'stone->0', 'paper->1', 'scissors->2' ");
			int choice = sc.nextInt();
			// here computer gen.only 3 number
			int computer_choice = random.nextInt(3);
			if (choice != 0 && choice != 1 && choice != 2) {
				System.out.println("$$ ENTER THE VALID INPUT $$");
				System.out.println("*** RESTART THE GAME ***");
				break;
			} else {
				if (choice == computer_choice) {
					System.out.println("~~TIE~~");
					System.out.println("**BOTH ARE SAME**\n");
				} else if (computer_choice == 0) { // stone
					if (choice == 1) { // paper
						System.out.println("~~YOU WIN~~");
						System.out.println("You choose PAPER:1");
						your++;
					} else { // scissor
						System.out.println("~~COMPUTER WINS~~");
						System.out.println("Computer choose Stone:0");
						computer++;
					}
				} else if (computer_choice == 1) {// paper
					if (choice == 0) { // stone
						System.out.println("~~COMPUTER WINS~~");
						System.out.println("Computer choose paper:1");
						computer++;
					} else { // scissor
						System.out.println("~~YOU WIN~~");
						System.out.println("You choose scissors:2");
						your++;
					}
				} else if (computer_choice == 2) {// scissor
					if (choice == 1) { // paper
						System.out.println("~~COMPUTER WINS~~");
						System.out.println("Computer choose scissors:2");
						computer++;
					} else {
						System.out.println("~~YOU WIN~~");
						System.out.println("You choose stone:0");
						your++;
					}
				}
			}
			rounds++;
		}
		System.out.println("\n-------------------------");
		System.out.printf("THE TOTAL ROUND ARE:%d\n", rounds - 1);

		if (your > computer) {
			System.out.printf("YOU WINS - %d - TIMES\n", your);
			System.out.println("-------------------------\n");
		} else if (your < computer) {
			System.out.printf("COMPUTER WINS - %d - TIMES\n", computer);
			System.out.println("-------------------------\n");
		} else if (your == computer) {
			System.out.println("### THE GAME IS TIE ###");
			System.out.println("-------------------------\n");
		}
		System.out.println("\n\t\t<GAME  OVER>");

	}

}
