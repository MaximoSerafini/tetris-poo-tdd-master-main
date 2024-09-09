package com.tetris;
import java.util.Random;

public class Board {

    private final int ancho = 10;
    private final int alto = 20; // Cambié a 20 para cumplir con el requerimiento de 10x20
    private final int[][] grid = new int[alto][ancho]; // La matriz debe ser alto x ancho
    private Piece pieceActual;
    private final Random random = new Random();

    // Agrega la pieza al tablero de manera aleatoria en el primer renglón
    public void addPieceBoard(Piece piece) {
        int xPos = random.nextInt(ancho - piece.getShape()[0].length); // Evita que la pieza salga de los bordes
        pieceActual = piece;
        placePiece(pieceActual, xPos, 0); // Coloca la pieza en el tablero en la fila superior
    }

    // Coloca la pieza en una posición específica dentro del tablero
    private void placePiece(Piece piece, int x, int y) {
        this.pieceActual = piece;
        this.pieceActual.setX(x);
        this.pieceActual.setY(y);
    }

    // Método que verifica si la pieza está dentro de los límites del tablero y considera las colisiones 
    public boolean LimitesVeri(Piece piece) {  // EL GOAT
        int[][] shape = piece.getPiece();
        int pieceWidth = shape[0].length;
        int pieceHeight = shape.length;
    
        // Verifica que la pieza no salga por los lados ni por abajo del tablero
        if (piece.getX() < 0 || piece.getX() + pieceWidth > ancho ||
            piece.getY() < 0 || piece.getY() + pieceHeight > alto) {
            return false;
        }

        // Verifica si la pieza se superpone con otras piezas en el tablero
        for (int i = 0; i < pieceHeight; i++) {
            for (int j = 0; j < pieceWidth; j++) {
                if (shape[i][j] != 0) { // Si la celda de la pieza es diferente de 0
                    if (grid[piece.getY() + i][piece.getX() + j] != 0) {
                        return false; // 
                    }
                }
            }
        }

        return true;    
    }

    // Mueve la pieza hacia abajo, si está dentro de los límites del tablero
    public boolean moveDown() {
        if (pieceActual == null) {
            return false;
        }

        int currentY = pieceActual.getY(); // Coordenada actual 'y'

        pieceActual.setY(currentY + 1); // Mueve la pieza hacia abajo

        // Verifica si la pieza sigue dentro de los límites después del movimiento
        if (!LimitesVeri(pieceActual)) {
            pieceActual.setY(currentY); // Si se sale, vuelve a la posición anterior
            return false; // El movimiento no fue posible
        }

        return true; // Movimiento válido
    }
}
