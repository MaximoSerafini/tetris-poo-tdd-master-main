package com.tetris;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestTetris3 {
    @Test
    public void testBoard() {
        Board board = new Board();
        PieceStick piece = new PieceStick();
        PieceT piece2 = new PieceT();
        board.addPieceBoard(piece);
        board.addPieceBoard(piece2);
    }

    @Test
    public void testBoard_NewPiece() {
        Board board = new Board();
        PieceStick piece = new PieceStick();
        board.addPieceBoard(piece); // Añade la pieza al tablero

        piece.moveDown(); // Mueve la pieza hacia abajo

        assertEquals(1, piece.getY()); // Verifica que la pieza ha bajado

        // Verifica que la pieza está dentro de los límites del tablero
        assertTrue(board.LimitesVeri(piece));
    }
}
