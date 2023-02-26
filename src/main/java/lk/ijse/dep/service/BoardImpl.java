package lk.ijse.dep.service;

public class BoardImpl {
    private static final int NUM_OF_COLS = 6;
    private static final int NUM_OF_ROWS = 5;
    private final BoardUI boardUI;
    private final Piece[][] pieces;


    public BoardImpl(BoardUI boardUI) {
        this.boardUI = boardUI;
        this.pieces = new Piece[NUM_OF_ROWS][NUM_OF_COLS];
    }
}
