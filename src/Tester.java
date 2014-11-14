
public class Tester {

	public static void main (String[] args) {
		Secret secret = null;
		if (AdditivePrimeTest.testAdditive(secret, 17)) {
			System.out.println("Yes it's additive");
		} else {
			System.out.println("Not additive");
		}
	}
}
