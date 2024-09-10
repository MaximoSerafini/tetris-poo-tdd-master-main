package com.tetris;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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


    //@Test
    //public void testClock() {
    //
    //    PieceStick pieceStick = new PieceStick();
    //
    //    int inicioY = pieceStick.getY();
    //    int moveY = pieceStick.getY();
    //    
    //    assertEquals(inicioY + 2, moveY);
    //}
    
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

    @Test
    public void test_Dos_Pieces_bajan_una_vez() {
        Board board = new Board();          
        PieceDogRight piece = new PieceDogRight();  
        PieceDogLeft piecelef = new PieceDogLeft();

        board.addPieceBoard(piece);         
        board.addPieceBoard(piecelef);
        
        piece.moveDown();                  
        assertEquals(1, piece.getY());       
        assertTrue(board.LimitesVeri(piece)); 

        piecelef.moveDown();                  
        assertEquals(1, piecelef.getY());       
        assertTrue(board.LimitesVeri(piecelef)); 
    }

    @Test
    public void test_Dos_Pieces_bajan_dos_veces() {
        Board board = new Board();          
        PieceDogRight piece = new PieceDogRight();  
        PieceDogLeft piecelef = new PieceDogLeft();

        board.addPieceBoard(piece);         
        board.addPieceBoard(piecelef);
        
        piece.moveDown();                  
        assertEquals(1, piece.getY());       
        assertTrue(board.LimitesVeri(piece)); 

        piecelef.moveDown();                  
        assertEquals(1, piecelef.getY());       
        assertTrue(board.LimitesVeri(piecelef)); 

        piece.moveDown();                  
        assertEquals(2, piece.getY());       
        assertTrue(board.LimitesVeri(piece)); 

        piecelef.moveDown();                  
        assertEquals(2, piecelef.getY());       
        assertTrue(board.LimitesVeri(piecelef)); 
    }

}
