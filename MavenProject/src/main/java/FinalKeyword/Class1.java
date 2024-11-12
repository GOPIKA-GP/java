package FinalKeyword;

public final class Class1 {
	
	final int A=20;
	final int B;//uninitialized final variable.Blank final variable
	//b=20; //cannod be initilize outside the method.can be iitialize final only inside a constructor
	public Class1() {
	B=20;
	//A=50;//cannot change the value of final a
	}
    public final void add() {
    	int x=A+20;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
