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

    @Test
    public void testClock() {
        Board board = new Board();
        PieceStick pieceStick = new PieceStick();
        board.addPieceBoard(pieceStick);

        int initialY = pieceStick.getY();

        pieceStick.startTimer();

        try {
            // Espera 1 segundo para permitir solo un descenso
            Thread.sleep(500); // Ajusta el valor si es necesario
        } catch (InterruptedException e) {
        }

        // Detén el temporizador después de permitir 1-2 movimientos
        pieceStick.stopTimer(); // Debes asegurarte de implementar este método

        // Verifica que la pieza solo haya descendido una o dos posiciones
        assertEquals(initialY + 2, pieceStick.getY()); // Ajusta según la lógica
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

    @Test
    public void diez_sticks_bajando() {
        Board board = new Board();
        PieceDogLeft piece1 = new PieceDogLeft();  
        PieceStick piece2 = new PieceStick();  
        PieceStick piece3 = new PieceStick();  
        PieceStick piece4 = new PieceStick();  
        PieceStick piece5 = new PieceStick();  
        PieceStick piece6 = new PieceStick();  
        PieceStick piece7 = new PieceStick();  
        PieceStick piece8 = new PieceStick();  
        PieceStick piece9 = new PieceStick();  
        PieceStick piece10 = new PieceStick(); 
        
        board.addPieceBoard(piece1); 
        board.addPieceBoard(piece2); 
        board.addPieceBoard(piece3); 
        board.addPieceBoard(piece4); 
        board.addPieceBoard(piece5); 
        board.addPieceBoard(piece6); 
        board.addPieceBoard(piece7); 
        board.addPieceBoard(piece8); 
        board.addPieceBoard(piece9); 
        board.addPieceBoard(piece10); 

        piece1.moveDown();                  
        assertEquals(1, piece1.getY());       
        assertTrue(board.LimitesVeri(piece1)); 
        piece2.moveDown();                  
        assertEquals(1, piece2.getY());       
        assertTrue(board.LimitesVeri(piece2)); 
        piece3.moveDown();                  
        assertEquals(1, piece3.getY());       
        assertTrue(board.LimitesVeri(piece3)); 
        piece4.moveDown();                  
        assertEquals(1, piece4.getY());       
        assertTrue(board.LimitesVeri(piece4)); 
        piece5.moveDown();                  
        assertEquals(1, piece5.getY());       
        assertTrue(board.LimitesVeri(piece5)); 
        piece6.moveDown();                  
        assertEquals(1, piece6.getY());       
        assertTrue(board.LimitesVeri(piece6)); 
        piece7.moveDown();                  
        assertEquals(1, piece7.getY());       
        assertTrue(board.LimitesVeri(piece7)); 
        piece8.moveDown();                  
        assertEquals(1, piece8.getY());       
        assertTrue(board.LimitesVeri(piece8)); 
        piece9.moveDown();                  
        assertEquals(1, piece9.getY());       
        assertTrue(board.LimitesVeri(piece9)); 
        piece10.moveDown();                  
        assertEquals(1, piece10.getY());       
        assertTrue(board.LimitesVeri(piece10)); 
    }



}
