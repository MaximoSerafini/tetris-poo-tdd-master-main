package com.tetris;

public class PieceDog extends Piece{
    public PieceDog(){
        int [][] PieceDogLeft = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {1, 1, 0, 0},
            {0, 1, 1, 0}
        };

        setPiece(PieceDogLeft);

        int [][] PieceDogRight = {
            {0, 0, 0, 0},
            {0, 1, 0, 0},
            {1, 1, 0, 0},
            {1, 0, 0, 0}
        };

        setPiece(PieceDogRight);

        public PieceDog(int[][] piece){
            super(piece); 
        }


    };
}
