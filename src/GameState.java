<<<<<<< Upstream, based on origin/master
import java.util.ArrayList;


public class GameState {
	
	private ArrayList<ArrayList<Integer>> board; 
	private int player = 0;
	
	/**
	 * preconditions : player == 0 || player == 1
	 * @param player : int
	 */
	public GameState() {
		this.board = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 7; i++) {
			this.board.add(new ArrayList<Integer>());
		}
	}
	
	/**
	 * preconditions : 	col >= 0 && col <= 6
	 * 					player == 0 || player == 1

	 * @param col : int
	 * @param column : int
	 * @param player : int
	 */
	public void add(int column) {
		board.get(column).add(player);
		if (player == 1) {
			player = 0;
		} else {
			player = 1;
		}
		
	}
	
	/**
	 * @return int
	 */
	public int getPlayer() {
		return player;
	}
	
	/**
	 * @return ArrayList<ArrayList<Integer>>
	 */
	public ArrayList<ArrayList<Integer>> getBoard(){
		return board;
	}
	
	/**
	 * precondition : col >= 0 && col <= 6
	 * @param col : int
	 * @return boolean
	 */
	public boolean isFull(int col) {
		if(board.get(col).size() == 7) {
			return true;
		}
		return false;
	}
	
}
=======
import java.util.ArrayList;


public class GameState {
	
	private ArrayList<ArrayList<Integer>> board; 
	private int player = 0;
	
	/**
	 * preconditions : player == 0 || player == 1
	 * @param player : int
	 */
	public GameState() {
		this.board = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 7; i++) {
			this.board.add(new ArrayList<Integer>());
		}
	}
	
	/**
	 * preconditions : 	col >= 0 && col <= 6
	 * 					player == 0 || player == 1
<<<<<<< HEAD
	 * @param col : int
=======
	 * @param column : int
	 * @param player : int
>>>>>>> 6db952e957b189cbda31fa463dc64565f0b464e7
	 */
	public void add(int column) {
		board.get(column).add(player);
		if (player == 1) {
			player = 0;
		} else {
			player = 1;
		}
		
	}
	
	/*public void undoMove(int col){
		board.get(col).remove(player);		
	}*/
	
	/**
	 * @return int
	 */
	public int getPlayer() {
		return player;
	}
	
	/**
	 * @return ArrayList<ArrayList<Integer>>
	 */
	public ArrayList<ArrayList<Integer>> getBoard(){
		return board;
	}
	
	/**
	 * precondition : col >= 0 && col <= 6
	 * @param col : int
	 * @return boolean
	 */
	public boolean isFull(int col) {
		if(board.get(col).size() == 7) {
			return true;
		}
		return false;
	}
	
}
>>>>>>> dfb97bb Have AI easy and AI med. AI easy is literally jsut random columns Having trouble with inivisbly inserted stuff. AI med has only the barebones of the minimax algo TODO needs a boardstate (400+ lines) function TODO AI hard = minimax + optimisation + heuristics
