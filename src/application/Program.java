package application;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import entities.Room;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Room[] room = new Room[9];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		System.out.println();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Rent #" + i);
			
			System.out.print("Name: ");
			String name = sc.next();
			sc.nextLine();
			
			System.out.print("Email: ");
			String mail = sc.next();
			sc.nextLine();
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			room[(roomNumber - 1)] = new Room(name, mail);
			
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		
		for (int i=0; i<room.length; i++) {
			//System.out.println(room[i]);
			
			if (room[i] != null) {
				System.out.println((i + 1) + ": " + room[i]);
			}
		}
		
		sc.close();
	}

}
