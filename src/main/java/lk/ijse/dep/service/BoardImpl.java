package lk.ijse.dep.service;

public class BoardImpl implements Board{

    private final Piece[][] pieces;
    private final BoardUI boardUI;



    public BoardImpl(BoardUI boardUI) {
        this.boardUI = boardUI;
        this.pieces = new Piece[NUM_OF_ROWS][NUM_OF_COLS];

        for (int i=0; i<NUM_OF_COLS;i++){
            for (int j=0;j<NUM_OF_ROWS;j++){

                pieces[i][j]=Piece.EMPTY;
            }
        }
    }

    @Override
    public BoardUI getBoardUI() {
        return this.boardUI;
    }

    @Override
    public int findNextAvailableSpot(int col) {
        for (int i = 0; i < NUM_OF_ROWS; i++) {
            if (pieces[col][i] == Piece.EMPTY) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isLegalMove(int col) {
        return findNextAvailableSpot(col) > -1;
    }

    @Override
    public boolean existLegalMoves() {
        for (int i = 0; i < NUM_OF_COLS; i++) {
            if (findNextAvailableSpot(i) > -1) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void updateMove(int col, Piece move) {
        int nextAvailableSpot = findNextAvailableSpot(col);
        if (nextAvailableSpot != -1) {
            pieces[col][nextAvailableSpot] = move;
        }
    }

    @Override
   public void updateMove(int col,int row,Piece move){

   }

    @Override
    public Winner findWinner() {
        return null;
    }
}
