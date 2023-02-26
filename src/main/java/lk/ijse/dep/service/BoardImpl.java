package lk.ijse.dep.service;

public class BoardImpl implements Board{
    private static final int NUM_OF_COLS = 6;
    private static final int NUM_OF_ROWS = 5;
    private final BoardUI boardUI;
    private final Piece[][] pieces;


    public BoardImpl(BoardUI boardUI) {
        this.boardUI = boardUI;
        this.pieces = new Piece[NUM_OF_ROWS][NUM_OF_COLS];
    }

    @Override
    public BoardUI getBoardUI() {
        return null;
    }

    @Override
    public int findNextAvailableSpot(int col) {
        return 0;
    }

    @Override
    public boolean isLegalMove(int col) {
        return false;
    }

    @Override
    public boolean existLegalMoves() {
        return false;
    }

    @Override
    public void updateMove(int col, Piece move) {

    }

    @Override
    public Winner findWinner() {
        return null;
    }
}
