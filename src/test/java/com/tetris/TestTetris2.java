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

    @Test
    public void girar_palo_Der_dos_veces() {
        PieceStick pieceStick = new PieceStick();

        pieceStick.rotateDer();
        pieceStick.rotateDer();

        int[][] formaEsperada = {
            {0, 0, 0, 1},
            {0, 0, 0, 1},
            {0, 0, 0, 1},
            {0, 0, 0, 1}
        };

        int[][] formaActual = pieceStick.getShape();

        assertArrayEquals(formaEsperada, formaActual);
    } 

    @Test
    public void girar_cubo_prueba() {
        PieceSquare pieceSquare = new PieceSquare();

        pieceSquare.rotateDer();

        int[][] formaEsperada = {
            {1, 1},
            {1, 1}
        };

        int[][] formaActual = pieceSquare.getShape();

        assertArrayEquals(formaEsperada, formaActual);
    } 

    @Test
    public void girar_DogRight_derecha(){
        PieceDogRight pieceDogRight = new PieceDogRight();

        pieceDogRight.rotateDer();

        int[][] formaEsperada = {
            {1, 0, 0},
            {1, 1, 0},
            {0, 1, 0}
        };

        int[][] formaActual = pieceDogRight.getShape();

        assertArrayEquals(formaActual, formaEsperada);
    }

    @Test
    public void girar_DogRight_izquierda(){
        PieceDogRight pieceDogRight = new PieceDogRight();

        pieceDogRight.rotateIzq();

        int[][] formaEsperada = {
            {0, 1, 0},
            {0, 1, 1},
            {0, 0, 1}
        };

        int[][] formaActual = pieceDogRight.getShape();

        assertArrayEquals(formaActual, formaEsperada);
    }

    @Test
    public void girar_DogLeft_derecha(){
        PieceDogLeft pieceDogLeft = new PieceDogLeft();

        pieceDogLeft.rotateDer();

        int[][] formaEsperada = {
            {0, 1, 0},
            {1, 1, 0},
            {1, 0, 0}
        };

        int[][] formaActual = pieceDogLeft.getShape();

        assertArrayEquals(formaActual, formaEsperada);
    }

    @Test
    public void girar_DogLeft_izquierda(){
        PieceDogLeft pieceDogLeft = new PieceDogLeft();

        pieceDogLeft.rotateIzq();

        int[][] formaEsperada = {
            {0, 0, 1},
            {0, 1, 1},
            {0, 1, 0}
        };

        int[][] formaActual = pieceDogLeft.getShape();

        assertArrayEquals(formaActual, formaEsperada);
    }



    //{0, 0, 0},
    //{0, 1, 1},
    //{1, 1, 0}

}
