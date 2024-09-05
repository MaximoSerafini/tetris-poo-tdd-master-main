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

<<<<<<< HEAD
    public boolean moveDown(PieceStick piece) {
=======
    // Método que verifica si la pieza está dentro de los límites del tablero
    public boolean LimitesVeri(Piece piece) {
        int[][] shape = piece.getPiece();
        int pieceWidth = shape[0].length;
        int pieceHeight = shape.length;

        // Verifica los límites en coordenadas x e y
        if (piece.getX() < 0 || piece.getX() + pieceWidth > ancho ||
            piece.getY() < 0 || piece.getY() + pieceHeight > alto) {
            return false;
        }
        return true;
    }

    // Mueve la pieza hacia abajo, si está dentro de los límites del tablero
    public boolean moveDown() {
        int currentY = PieceActual.getY(); // Coordenada actual 'y'
>>>>>>> cce41bcc7ec7e18f0488c574a48d042af9f9351d

        PieceActual.moveDown(); // Mueve la pieza hacia abajo

<<<<<<< HEAD
        PieceActual.setY(currentY + 1); //muevo 1 abajo y seteo

        return true; 
=======
        // Verifica si la pieza sigue dentro de los límites después del movimiento
        if (!LimitesVeri(PieceActual)) {
            PieceActual.setY(currentY); // Si se sale, vuelve a la posición anterior
            return false; // El movimiento no fue posible
        }

        return true; // Movimiento válido
>>>>>>> cce41bcc7ec7e18f0488c574a48d042af9f9351d
    }
}
