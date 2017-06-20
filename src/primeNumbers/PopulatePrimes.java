package primeNumbers;

import java.io.File;

public class PopulatePrimes {

	PopulatePrimes(){}
	
	/**
	 * Calculates prime numbers and puts them into a file
	 * @param numberOfPrimesDesired The number of primes desired to be populated into file
	 */
	PopulatePrimes(String fileNameToPopulate, int numberOfPrimesDesired){
		
		try{
			File f = new File(fileNameToPopulate);
		}
		catch(NullPointerException e){
			
		}
		
	}
}
