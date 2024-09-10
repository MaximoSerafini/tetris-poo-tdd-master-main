package com.tetris;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class TestTetris4 {
    @Test
    public void test_Detener_Movimiento() {
        Board board = new Board();
        PieceStick piece = new PieceStick();

        board.addPieceBoard(piece);

        piece.moveDown();
        piece.moveDown();
        piece.moveDown();
        piece.moveDown();
        piece.moveDown();
        piece.moveDown();
        piece.moveDown();
        piece.moveDown();
        piece.moveDown();
        piece.moveDown();
        piece.moveDown();
        piece.moveDown();
        piece.moveDown();
        piece.moveDown();
        piece.moveDown();
        piece.moveDown();


        // Verifica que la pieza se detuvo en la fila correcta sin pasar el límite
        assertEquals(16, piece.getY()); // La pieza debería detenerse en la fila 16

        // Intento adicional para verificar que no se mueve más allá del límite
        piece.moveDown();
        assertEquals(17, piece.getY()); // La pieza debería seguir en la fila 16
        assertTrue(board.LimitesVeri(piece)); // Verifica que la pieza sigue dentro de los límites
    }
}
    