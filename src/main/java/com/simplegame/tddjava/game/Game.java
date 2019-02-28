package com.simplegame.tddjava.game;

public class Game {

    private Character[] board = {'k', 'p', 'n'};

    public String play(char player1, char player2){
        isEmpty(player1, player2);
        if(isWinP1(player1, player2)){
            return "Wygral P1";
        } else if (isWinP2(player1, player2)){
            return "Wygral P2";
        } else if (isDraw(player1, player2)){
            return "remis";
        }
        return "Brak zwyciezcy";

    }

    private boolean isWinP1(char player1, char player2){
        if (player1 == 'k' && player2 =='n' || player1 == 'n' && player2 =='p' || player1 == 'p' && player2 =='k'){
            return true;

        }
        return false;
    }

    private boolean isWinP2(char player1, char player2){
        if (player1 == 'n' && player2 =='k' || player1 == 'p' && player2 == 'n' || player1 == 'k' && player2 == 'p'){
            return true;

        }
        return false;
    }

    private void isEmpty(char player1, char player2) {
        if (player1 == '\0' || player2 == '\0') {
            throw
                    new RuntimeException("Trzeba wybrac jedna opcje");
        }
    }

    private boolean isDraw(char player1, char player2){
        if (player1 == player2){
            return true;
        }
        return false;
    }
}
