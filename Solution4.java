//Solution for Question 4

public class Solution4
{
    public static int minReplacements(int num){
    	if(num>0){
    	if(num==1)
    		return 0;
    	else if(num%2==0)
    		return 1+ minReplacements(num/2);
    	else if(num%2!=0)
    		return 1+ Math.min(minReplacements((num+1)),minReplacements((num-1)));
    }
    	
    		return -1;
    }
	public static void main(String[] args) {
		int testCaseCount=8;
		int answer;
		int[] input={-1,0,1,15,8,9,23,100};
		String[] expectedOutput={"Input Error","Input Error","0","5","3","4","6","8"};
		System.out.println("Expected o/p \t\t\t Actual o/p");
		for(int i=0;i<testCaseCount;i++){
		    answer=minReplacements(input[i]);
		    if(answer==-1)
		    	System.out.println(expectedOutput[i]+"\t\t\t" +"Input Error");
		    else
		    System.out.println(expectedOutput[i]+"\t\t\t\t" +answer);
		}
	}
}
