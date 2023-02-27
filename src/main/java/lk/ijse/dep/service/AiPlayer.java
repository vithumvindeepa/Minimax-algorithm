package lk.ijse.dep.service;

public class AiPlayer extends Player{
    public AiPlayer(Board board) {
        super(board);
    }

    @Override
    public void movePiece(int col) {
        movePiece();
    }
    private void movePiece() {
        int col;
        do {
            col = (int) (Math.random() * 6);
        } while (!board.isLegalMove(col));
        board.updateMove(col, Piece.GREEN);
        board.getBoardUI().update(col,false);
        if (board.findWinner().getWinningPiece()!=Piece.EMPTY) {
            board.getBoardUI().notifyWinner(board.findWinner());
        }else if(!board.existLegalMoves()){
            board.getBoardUI().notifyWinner(new Winner(Piece.EMPTY));
        }
    }
    private int minimax(int depth,boolean maximizingPlayer){
        int CERTAIN_NUMBER=4;
        if (depth==CERTAIN_NUMBER|| board.existLegalMoves()){

        }
        return -1;
    }
}
