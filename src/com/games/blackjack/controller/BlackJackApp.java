package com.games.blackjack.controller;

import com.games.blackjack.Dealer;

class BlackJackApp {
    private boolean gameOver = false;
    private Dealer dealer = new Dealer();

    public void execute() {
        welcome();
        promptForHelp();
        promptForPlayers();
        startGame();
    }

    private void welcome() {
    }

    private void promptForHelp() {
    }

    private void promptForPlayers() {
    }

    private void startGame() {
        while(!gameOver) {
            // do the rounds of BlackJack

            // gameOver = re-evaluated each time thru the loop
        }
    }
}