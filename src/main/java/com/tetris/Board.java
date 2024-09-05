package com.tetris;
import java.util.Random;

public class Board {

    private final int ancho = 10;
    private final int alto = 20; // Cambié a 20 para cumplir con el requerimiento de 10x20
    private final int[][] grid = new int[alto][ancho]; // La matriz debe ser alto x ancho
    private Piece PieceActual;
    private final Random random = new Random();

    // Agrega la pieza al tablero de manera aleatoria en el primer renglón
    public void addPieceBoard(Piece piece) {
        int xPos = random.nextInt(ancho - piece.getShape()[0].length); // Evita que la pieza salga de los bordes
        PieceActual = piece;
        placePiece(PieceActual, xPos, 0); // Coloca la pieza en el tablero en la fila superior
    }

    // Coloca la pieza en una posición específica dentro del tablero
    private void placePiece(Piece piece, int x, int y) {
        this.PieceActual = piece;
        this.PieceActual.setX(x);
        this.PieceActual.setY(y);
    }

    // Método que verifica si la pieza está dentro de los límites del tablero
    public boolean LimitesVeri(Piece piece) {
        int[][] shape = piece.getPiece();
        int pieceWidth = shape[0].length;
        int pieceHeight = shape.length;
    
        // Verifica que la pieza no salga por los lados ni por abajo del tablero
        if (piece.getX() < 0 || piece.getX() + pieceWidth > ancho ||
            piece.getY() < 0 || piece.getY() + pieceHeight > alto) {
            return false;
        }
        return true;
    }

    // Mueve la pieza hacia abajo, si está dentro de los límites del tablero
    public boolean moveDown() {
        if (PieceActual == null) {
            return false;
        }
    
        int currentY = PieceActual.getY(); // Obtiene la coordenada actual 'y'
        PieceActual.setY(currentY + 1);    // Mueve la pieza hacia abajo
    
        // Verifica si la nueva posición está dentro de los límites usando LimitesVeri
        if (!LimitesVeri(PieceActual)) {
            PieceActual.setY(currentY);    // Si está fuera de los límites, deshace el movimiento
            return false;                
        }
    
        return true; // Movimiento válido
    }
}
