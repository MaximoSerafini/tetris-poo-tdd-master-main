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
    public void testPieceStick_baja_una_vez() {
        Board board = new Board();
        PieceStick piece = new PieceStick();
        board.addPieceBoard(piece); // Añade la pieza al tablero

        piece.moveDown(); // Mueve la pieza hacia abajo

        assertEquals(1, piece.getY()); // Verifica que la pieza ha bajado

        // Verifica que la pieza está dentro de los límites del tablero
        assertTrue(board.LimitesVeri(piece));
    }

    @Test
    public void testPieceDog_Baja_dos_veces() {
        Board board = new Board();
        PieceDogRight piece = new PieceDogRight();
        board.addPieceBoard(piece); 

        piece.moveDown(); 

        assertEquals(1, piece.getY()); 

        assertTrue(board.LimitesVeri(piece));
    }

    @Test
    public void testPieceStick_baja_dos_veces() {
        Board board = new Board();          
        PieceStick piece = new PieceStick(); 
        board.addPieceBoard(piece);         

        
        piece.moveDown();                  
        assertEquals(1, piece.getY());       
        assertTrue(board.LimitesVeri(piece)); 

        
        piece.moveDown();                    
        assertEquals(2, piece.getY());        
        assertTrue(board.LimitesVeri(piece)); // Verifica que sigue dentro de los límites del tablero después del segundo movimiento
    }

    @Test
    public void testPieceDog_baja_dos_veces() {
        Board board = new Board();          
        PieceDogRight piece = new PieceDogRight(); 
        board.addPieceBoard(piece);         

        
        piece.moveDown();                  
        assertEquals(1, piece.getY());       
        assertTrue(board.LimitesVeri(piece)); 

        
        piece.moveDown();                    
        assertEquals(2, piece.getY());        
        assertTrue(board.LimitesVeri(piece)); // Verifica que sigue dentro de los límites del tablero después del segundo movimiento
    }
}
