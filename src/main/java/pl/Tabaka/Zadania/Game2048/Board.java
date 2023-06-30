package pl.Tabaka.Zadania.Game2048;

import java.util.Scanner;

public class Board {
    int[][] board;

    public Board() {
        this.board = new int[4][4];

    }
    public Board(int[][] board) {
        this.board = board;
        this.print();
        while(true){
            System.out.println("Podaj kierunek");
            switch (new Scanner(System.in).next()){
                case "8":
                    this.moveUp();
                    break;
                case "2":
                    this.moveDown();
                    break;
                case "4":
                    this.moveLeft();
                    break;
                case "6":
                    this.moveRight();
                    break;
                default:
                    System.out.println("Blad! Brak takiej komendy!");
                    continue;
            }
            break;
        }
        this.print();
    }

    private void moveUp(){
        for(int j=0;j<4;j++) {
            for(int k=0;k<3;k++) { // first spin round
                for (int i = 0; i < 3-k; i++) {
                    checkAndSwap(i, j, i+1, j);
                }
            }
            int counter=0;
            for (int i=0;i<3;i++){ // merging
                if(board[i][j]==board[i+1][j]){
                    board[i][j]*=2;
                    board[i+1][j]=0;
                    counter++;
                }
            }
            for(int k=0;k<counter;k++) { //second spin round
                for (int i = 0; i < 3; i++) {
                    checkAndSwap(i, j, i+1, j);
                }
            }
        }
    }
    private void moveDown(){
        for(int j=0;j<4;j++) {
            for(int k=0;k<3;k++) { // first spin round
                for (int i = 3; i > k; i--) {
                    checkAndSwap(i, j, i-1, j);
                }
            }
            int counter=0;
            for (int i = 3; i > 0; i--){ // merging
                if(board[i][j]==board[i-1][j]){
                    board[i][j]*=2;
                    board[i-1][j]=0;
                    counter++;
                }
            }
            for(int k=0;k<counter;k++) { //second spin round
                for (int i = 3; i > 0; i--) {
                    checkAndSwap(i, j, i-1, j);
                }
            }
        }
    }
    private void moveLeft(){
        for(int i=0;i<4;i++) {
            for(int k=0;k<3;k++) { // first spin round
                for (int j = 0; j < 3-k; j++) {
                    checkAndSwap(i, j, i, j + 1);
                }
            }
            int counter=0;
            for (int j=0;j<3;j++){ // merging
                if(board[i][j]==board[i][j+1]){
                    board[i][j]*=2;
                    board[i][j+1]=0;
                    counter++;
                }
            }
            for(int k=0;k<counter;k++) { //second spin round
                for (int j = 0; j < 3; j++) {
                    checkAndSwap(i, j, i, j + 1);
                }
            }
        }
    }
    private void moveRight(){
        for(int i=0;i<4;i++) {
            for(int k=0;k<3;k++) { // first spin round
                for (int j = 3; j > k; j--) {
                    checkAndSwap(i, j, i, j - 1);
                }
            }
            int counter=0;
            for (int j=3;j>0;j--){ // merging
                if(board[i][j]==board[i][j-1]){
                    board[i][j]*=2;
                    board[i][j-1]=0;
                    counter++;
                }
            }
            for(int k=0;k<counter;k++) { //second spin round
                for (int j = 3; j > 0; j--) {
                    checkAndSwap(i, j, i, j - 1);
                }
            }
        }
    }

    private void spinHorizontal(int i){

    }

    private void spinVertical(){
        for(int i=0;i<4;i++){

        }
    }

    private void checkAndSwap(int i1, int j1, int i2, int j2){
        if(board[i1][j1]==0 && board[i2][j2]!=0){
            int c = board[i1][j1];
            board[i1][j1]=board[i2][j2];
            board[i2][j2]=c;
        }
        return;
    }

    private void print(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
