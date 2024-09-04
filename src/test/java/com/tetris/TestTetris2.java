package com.tetris;
import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestTetris2 {
    @Test
    public void girar_palo_izq() {
        PieceStick pieceStick = new PieceStick();

        pieceStick.rotateIzq();

        int[][] formaEsperada = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {1, 1, 1, 1}
        };

        int[][] formaActual = pieceStick.getShape();

        assertArrayEquals(formaEsperada, formaActual);

    }

    @Test
    public void girar_palo_Der() {
        PieceStick pieceStick = new PieceStick();

        pieceStick.rotateDer();

        int[][] formaEsperada = {
            {1, 1, 1, 1},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };

        int[][] formaActual = pieceStick.getShape();

        assertArrayEquals(formaEsperada, formaActual);

    } 
}
