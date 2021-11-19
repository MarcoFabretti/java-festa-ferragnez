package com.ferragnez.party;
import java.util.Scanner;
public class CheckGuest {

	public static void main(String[] args) {
		String[] lista = {"Dua Lipa","Paris Hilton","Manuel Agnelli","J-Ax","Francesco Totti","Ilary Blasi","Babe Vio","Luis","Paradis Zarei","Martina Maccherone","Rachel Zeilic"};
		String nome;
		boolean trovato=false;
		Scanner cIn = new Scanner(System.in);
		System.out.println("Inseririsci il tuo nome, per verificare se sei sulla lista: ");
		nome=cIn.nextLine();
		for(int i=0;i<lista.length;i++){
			if(lista[i].equals(nome)) {
				trovato=true;
				}			
		}
		if(trovato==true) {
			System.out.println("Benvenuto/a alla festa");
		}else System.out.println("Mi dispiace ma non sei sulla lista");
		cIn.close();
	}

}
