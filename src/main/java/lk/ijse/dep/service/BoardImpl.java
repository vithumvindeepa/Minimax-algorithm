package lk.ijse.dep.service;

public class BoardImpl implements Board{
    private final BoardUI boardUI;
    private final Piece[][] pieces;


    public BoardImpl(BoardUI boardUI) {
        this.boardUI = boardUI;
        this.pieces = new Piece[NUM_OF_ROWS][NUM_OF_COLS];

        for (int col=0; col<NUM_OF_COLS;col++){
            for (int row=0;row<NUM_OF_ROWS;row++){
                pieces[col][row]=Piece.EMPTY
            }
        }
    }

    @Override
    public BoardUI getBoardUI() {
        return boardUI;
    }

    @Override
    public int findNextAvailableSpot(int col) {
        return -1;
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
