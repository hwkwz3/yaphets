package bbb;

public class hos {

	 public static void main(String[] args) {
		  
	        int moneyEachDay = 0;
	        int day = 10;
	        int sum=0;
	        for (int i = 1; i <= day; i++) {
	            if(0==moneyEachDay)
	                moneyEachDay = 1;
	            else
	                moneyEachDay *= 2;
	              
	            sum+=moneyEachDay;
	          //a
	            System.out.println(i + " 天之后，总数是: " + sum );
	        }
	    }
}
