public final class AdditivePrimeTest {
	public static boolean testAdditive(Secret secret, int maxPrime) {
		 //look for all primes less than maxPrime (N)
		for (int x=2; x<maxPrime; x++) {
			for (int y=2; y<maxPrime; y++) {
				//if x and y are prime, test if secret is additive with their combination
				if (isPrime(x) && isPrime(y)) {
					if (secret.secret(x+y) != (secret.secret(x) + secret.secret(y)))
						return false;
				}
			}
			
		}
		return true;
	}
	
	public static boolean isPrime(int n) {
		for (int i=2; i<n; i++) {
			if (n%i == 0)
				return false;
		}
		return true;
	}
}