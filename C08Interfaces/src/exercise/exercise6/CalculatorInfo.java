package exercise.exercise6;

public abstract class CalculatorInfo implements Add, Minus, Multi, Divide{

	public static final int ERROR=-999999;
	
	@Override
	public int getNumAdd(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int getNumMulti(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int getNumMinus(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int getNumDivide(int x, int y) {
		if(y==0) {
			return ERROR;
		}
		return x/y;
	}

}
