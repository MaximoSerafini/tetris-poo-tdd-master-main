package com.tetris;
import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestTetris2 {
    @Test
    public void girar_palo() {
        PieceStick pieceStick = new PieceStick();

        pieceStick.rotate();

        int[][] formaEsperada = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {1, 1, 1, 1}
        };

        int[][] formaActual = pieceStick.getShape();

        assertArrayEquals(formaEsperada, formaActual);

    }      
}
