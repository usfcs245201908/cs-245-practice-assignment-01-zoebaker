
public class Practice01MathIterative implements Practice01Math {
	public int fib (int n) {
		if (n<0)
			throw new IllegalArgumentException ("n must be positive");
		else if (n<=0) {
			return n; 
		}
		int current=1; 
		int prev=0; 
		int prevprev=0; 
		
		for(int x=1; x<n; x++) {
			prevprev=prev; 
			prev=current; 
			current=prevprev+current; 
		}
		return current; 
	}
	
	public int fact(int n) {
		if (n<0)
			throw new IllegalArgumentException ("n must be positive");
		int num=1; 
		while (n>0) {
			num*=n; 
			n--; 
		}
		return num; 
	}

}
