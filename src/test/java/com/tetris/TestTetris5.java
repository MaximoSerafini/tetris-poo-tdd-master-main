package com.tetris;
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
    public void testIsLineCompleteTrue() {
        
    }

    @Test
    public void testRemoveLine() {
        
    }

    @Test
    public void testClearLinea() {
        
    }

    @Test
    public void testCheckFinalDelJuego() {
        
    }

    



}
