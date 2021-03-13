package handling;

public class TestMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathFormula maths=new MathFormula();
		try {
			System.out.println(maths.divide(14, 0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("calculation completed");
	}

}
