package com.tetris;
import java.util.Random;
/*
Requerimiento 3:
*El tablero/"board" tiene 10x20 elementos
*las piezas van ingresando por la parte de arriba
-aleatoriamente en cualquier lugar del primer renglón (siempre la pieza completa)
-Y en una posición de la pieza aleatoria
-No se puede colocar una pieza por fuera del tablero

*Las piezas van bajando a medida el reloj indica x segundo
*La pieza actual solamente es la que desciende a medida que el reloj avanza
*La pieza puede moverse (orientación) y descender solamente si puede caber en dicho lugar
*/

public class Board {

    private final int ancho = 10;
    private final int alto = 10;
    private final int[][] grid = new int[ancho][alto];
    private Piece PieceActual;
    private final Random random = new Random();

    public void addPieceBoard(Piece piece) { 
        int xPos = random.nextInt(ancho - piece.getShape()[0].length);
        PieceActual = piece;
        placePiece(PieceActual, xPos, 0); //dentro del tablero
    }

    private void placePiece(Piece piece, int x, int y) {
        this.PieceActual = piece;
        this.PieceActual.x = x;
        this.PieceActual.y = y;
    }

    public boolean moveDown() {

        int currentY = PieceActual.getY(); //cords

        PieceActual.setY(currentY + 1); //muevo 1 abajo y seteo
        
        return true; 
    }
    

}