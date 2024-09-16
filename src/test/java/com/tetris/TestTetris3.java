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

        pieceStick.stopTimer();

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
    public void testPieceDog_se_mueve_a_la_derecha() {
        Board board = new Board();
        PieceDogRight piece = new PieceDogRight();
        board.addPieceBoard(piece); 

        piece.moveRight(); 

        assertEquals(1, piece.getX()); 

        assertTrue(board.LimitesVeri(piece));
    }

    @Test
    public void testPieceDog_se_mueve_a_la_izquierda() { // no anda por que pasa el limite, esta bien
        Board board = new Board();
        PieceDogRight piece = new PieceDogRight();
        board.addPieceBoard(piece); 

        piece.moveLeft(); 

        assertEquals(-1, piece.getX()); 

        assertTrue(board.LimitesVeri(piece));
    }

    @Test
    public void testPieceDog_se_mueve_a_la_derecha_dos_veces_y_va_a_la_izquierda() { // no anda por que pasa el limite, esta bien
        Board board = new Board();
        PieceDogRight piece = new PieceDogRight();
        board.addPieceBoard(piece); 

        piece.moveRight(); 

        assertEquals(1, piece.getX()); 

        piece.moveRight(); 

        assertEquals(2, piece.getX()); 

        piece.moveLeft(); 

        assertEquals(1, piece.getX()); 

        assertTrue(board.LimitesVeri(piece));
    }


    @Test
    public void testLines() {
        
        Board board = new Board();
        PieceStick piece1 = new PieceStick();
        board.addPieceBoard(piece1);
        piece1.moveDown(); //???
    
        // deberia de incluir chequear el final del juego
        board.updateBoard();
    
    }
    



}
