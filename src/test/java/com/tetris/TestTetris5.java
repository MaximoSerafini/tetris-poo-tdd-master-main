package com.tetris;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestTetris5 {


    @Test
    public void testLines() {
        
        Board board = new Board();
        PieceStick piece1 = new PieceStick();
        board.addPieceBoard(piece1);
        piece1.moveDown(); //???
    
        // deberia de incluir chequear el final del juego
        board.updateBoard();
    
    }

    @Test
    public void testLineCompleteTrue() {
        Board board = new Board();
        int[] fila = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; //primer fila completa
        assertTrue(board.isLineComplete(fila));
    }

    @Test
    public void testLineCompleteFalse() {
        Board board = new Board();
        int[] fila = {0, 1, 1, 1, 0, 0, 1, 1, 0, 1}; //fila inc
        assertFalse(board.isLineComplete(fila));
    }

    @Test
    public void testRemoveLine() {

        Board board = new Board();

        for (int i = 0; i < 10; i++) {
            board.grid[19][i] = 1;
        }
        board.removeLine(19); //completamos y removemos ult fila!

        for (int i = 0; i < 10; i++) {
            assertEquals(0, board.grid[19][i]); //verif
        }

    }

    @Test
    public void testClearLinea() {
        
    }

    @Test
    public void testCheckFinalDelJuego() {
        
    }

    



}
