package com.tetris;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class TestTetris4 {
    @Test
    public void testPieceNoPuedeBajarMas() {
        Board board = new Board();          
        PieceDogLeft piece = new PieceDogLeft(); // Usando PieceStick como ejemplo

        board.addPieceBoard(piece);

        // Simula movimientos hacia abajo hasta que la pieza toque el suelo
        while (board.LimitesVeri(piece)) {
            piece.moveDown();
        }

        // Verifica que la pieza no pueda bajar más, es decir, que toque el suelo
        assertFalse(board.LimitesVeri(piece)); // La pieza no debería poder moverse más hacia abajo
        assertEquals(18, piece.getY()); // Verifica que la pieza esté en la posición más baja
    }

    @Test
    public void testPieceSquareNoPuedeBajarMas() {
        Board board = new Board();          
        PieceSquare piece = new PieceSquare(); // Usando PieceStick como ejemplo

        board.addPieceBoard(piece);

        // Simula movimientos hacia abajo hasta que la pieza toque el suelo
        while (board.LimitesVeri(piece)) {
            piece.moveDown();
        }

        // Verifica que la pieza no pueda bajar más, es decir, que toque el suelo
        assertFalse(board.LimitesVeri(piece)); // La pieza no debería poder moverse más hacia abajo
        assertEquals(19, piece.getY()); // Verifica que la pieza esté en la posición más baja
    }
    
}
    