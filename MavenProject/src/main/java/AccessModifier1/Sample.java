package AccessModifier1;

public class Sample {
	
	 protected int a=10;
	 protected void samplemethod() {
		System.out.println(a);
	
	}

	public static void main(String[] args) {
		 Sample obj=new Sample();
		 obj.samplemethod();

	}

}
