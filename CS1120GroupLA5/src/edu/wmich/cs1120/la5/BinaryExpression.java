package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {

	/**
	 * 
	 */
	private IExpression right;
	/**
	 * 
	 */
	private IExpression left;
	/**
	 * 
	 */
	private IOperation op;
	/**
	 * Getter of right
	 */
	public IExpression getRight() {
	 	 return right; 
	}
	/**
	 * Setter of right
	 */
	public void setRight(IExpression right) { 
		 this.right = right; 
	}
	/**
	 * Getter of left
	 */
	public IExpression getLeft() {
	 	 return left; 
	}
	/**
	 * Setter of left
	 */
	public void setLeft(IExpression left) { 
		 this.left = left; 
	}
	/**
	 * Getter of op
	 */
	public IOperation getOp() {
	 	 return op; 
	}
	/**
	 * Setter of op
	 */
	public void setOp(IOperation op) { 
		 this.op = op; 
	}
	/**
	 * 
	 * @param op 
	 * @param right 
	 * @param left 
	 */
	public void BinaryExpression(IOperation op, IExpression right, IExpression left) { 
		// TODO Auto-generated method
	 }
	/**
	 * 
	 * @return 
	 */
	public int getValue() { 
		// TODO Auto-generated method
		return 0;
	 } 

}
