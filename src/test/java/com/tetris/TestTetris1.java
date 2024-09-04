package com.tetris;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TestTetris1 {
    @Test
    public void la_pieza_existe(){
        PieceL pieceL = new PieceL();

        assert pieceL.getPiece() != null;   
    }

    @Test
    public void la_piece_esta_ahi() {
        // Crear una instancia de PieceL
        PieceL pieceL = new PieceL();
        
        // Asumiendo que la posición inicial es (0, 0) o según lo que hayas definido en tu clase Piece
        int expectedX = 0; // Posición X inicial esperada
        int expectedY = 0; // Posición Y inicial esperada

        // Métodos getX() y getY() deberían devolver la posición de la pieza (si los tienes implementados)
        assertEquals(expectedX, pieceL.getX());
        assertEquals(expectedY, pieceL.getY());   
    }

    @Test
    public void la_piece_L_tiene_la_forma_correcta() {
        // Crear una instancia de PieceL
        PieceL pieceL = new PieceL();
        
        // Definir la forma esperada de la pieza LLeft
        int[][] formaEsperada = {
            {0, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0}
        };

        // Obtener la forma actual de la pieza L
        int[][] formaActual = pieceL.getShape();
        
        // Comparar la forma actual con la forma esperada
        assertArrayEquals(formaEsperada, formaActual);
    }

    @Test
    public void la_piece_Dog_tiene_la_forma_correcta(){
        PieceDog pieceDog = new PieceDog();

        int[][] formaEsperada = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {1, 1, 0, 0},
            {0, 1, 1, 0}
        };

        int[][] formaActual = pieceDog.getShape();

        assertArrayEquals(formaEsperada, formaActual);
    }

    @Test
    public void test_pieza_stick(){
        PieceStick pieceStick = new PieceStick();

        int[][] formaEsperada = {
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0}
        };

        int[][] formaActual = pieceStick.getShape();

        assertArrayEquals(formaEsperada, formaActual);
    }

}
