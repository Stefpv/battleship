package edu.colorado.team6;

public class Board {
  private int[][] board = new int[10][10];
  // constructor
  public Board(int[][] board) {
    this.board = board;
  }
  // getter
  public int[][] getBoard() {
    return board;
  }
  // setter
  public void setBoard(int[][] board) {
    this.board = board;
  }

  public Integer hitStatus(int x, int y) {
    return this.board[x][y];
  }

  public void setCoord(int x, int y, int shipOrSea) {
    this.board[x][y] = shipOrSea;
  }
}
