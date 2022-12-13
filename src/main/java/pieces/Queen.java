package pieces;

import board.Board;
import util.Color;
import util.Type;

/**
 * Abstract Class that represent a Queen piece in chess game.
 *
 * @see Piece
 *
 */

public class Queen extends Piece{
    /**
     * Constructor of Queen class.
     * @param color
     * @param posX
     * @param posY
     */
    public Queen(Color color, int posX, int posY) {
        super(color, Type.QUEEN, posX, posY);
    }

    //TODO: implementar o movimento da rainha

    @Override
    public void calculatePossiblePositions(int x, int y, Board board) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean moveIsValid(int spotPosX, int spotPosY, Piece pieceSelected, Board boardGame) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
