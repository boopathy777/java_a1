package java_a1;

public class Sumwithoutplus {
	public static void main(String args[]){
		System.out.println(" sum : " + add(80,85));
		}

		public static int add(int a, int b){
	        if(b == 0) return a;
	        int sum = a ^ b; //SUM of two integer is A XOR B
	        int carry = (a & b) << 1;  //CARRY of two integer is A AND B
	        return add(sum, carry);
	    }
	 



}
