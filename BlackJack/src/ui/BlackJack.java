/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domein.BlackJackGame;
import java.util.Scanner;

/**
 *
 * @author Thomas
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         System.out.println("Geef eerst spelersnaam");
         String playerName = s.nextLine();         
         System.out.println("Geef nu het aantal decks");
         int decks = Integer.parseInt(s.nextLine());
         
         BlackJackGame bj = new BlackJackGame(playerName,decks);
         System.out.println("Welkom bij blackjack");
         System.out.println("Speler is"+ playerName + ". Er wordt gespeeld met " + decks +" decks.");
         bj.startGame();         
         while(!bj.hasWinner()){
            System.out.println("Hit or stand?");
            String move = s.nextLine();
            bj.checkPlayers(move);            
         }
         bj.getWinner();
         s.close();
    }
    
}
