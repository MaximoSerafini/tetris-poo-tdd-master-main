package com.tetris;

public class Piece {
    
    public int[][] piece;
    public int x;
    public int y; 
    public int[][] shape;
    
    
    public Piece() {
    }

    public Piece(int[][] piece){
        this.piece = piece; 
    }

    public void setPiece(int [][] piece){
        this.piece = piece;
    }

    public int[][] getPiece(){
        return piece; 
    }
    
    public int[][] getShape() {
        return getPiece(); // O simplemente return piece;
    }
    

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x; 
    }

    public void setY(int y){
        this.y = y;
    }

    public int getY(){
        return y; 
    }


    //Método para rotar la pieza en sentido horario
    public void rotate() {
        int n = piece.length;
        int[][] rotatedPiece = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotatedPiece[j][n - 1 - i] = piece[i][j];
            }
        }
        
        this.piece = rotatedPiece;
    }
    
}
