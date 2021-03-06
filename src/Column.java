import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;


public class Column extends JPanel{
	private Circle[] colGUI;
	private int value;
	
	public Column(int value) {
		this.setBackground(new Color (222, 206, 162));
		this.setLayout(new GridLayout(6,1));
		this.value = value;
		initCol();
	}
	
	/**
	 * initializing a column 
	 * precondition: a column must consist of 6 circles
	 * 
	 */
	public void initCol() {
		this.colGUI = new Circle[7];
		for (int i=0; i<6; i++) { 
               colGUI[i] = new Circle(this.value, i);
               add(colGUI[i]);
               colGUI[i].setBorder(null);
        }
	}
	
	/**
	 * clear a column when a new game starts
	 * precondition: a column must consist of 6 circles
	 * 
	 */
	public void clearCol() {
		for (int i=0; i<6; i++) { 
               this.colGUI[i].setValue(-1);
               colGUI[i].setBorder(null);
        }
	}
	
	/**
	 * returns the index of this column
	 * @return int
	 * 
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * returns the circle of index i from this column
	 * @param int
	 * @return Circle
	 * precondition: 0 <= i <= 6
	 */
	public Circle getCircle(int i) {
		return colGUI[i];
	}
	
}
