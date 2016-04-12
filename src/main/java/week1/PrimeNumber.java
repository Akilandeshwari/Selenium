/**
 * 
 */
package week1;

/**
 * @author Akila
 *
 */
public class PrimeNumber {
	public static void main(String[] args) {
		int n=13;
		boolean b = false; 
		for(int i=2;i<n;i++){
			if(n%i==0){
				System.out.println("num is nt prime");
				b=true;
				break;
			}
			
		}
		if(b==false){
			System.out.println("num is prime");		
		}
	}
	
	
	

}

	

