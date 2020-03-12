//Solution for Question 6

public class Solution6
{
    public static String nonRepeatingElement(int[] list){
        if(list[0]==list[1]){
            if (list[1]==list[2] && list[3]!=list[2])
            return Integer.toString(list[3]);
            else if (list[1]==list[3] && list[3]!=list[2])
            return Integer.toString(list[2]);
        }
        else if(list[0]!=list[1]){
            if(list[1]==list[2] && list[2]==list[3])
            return Integer.toString(list[0]);
            else if(list[0]==list[2] && list[2]==list[3])
            return Integer.toString(list[1]);
        }
        return "Input Error";
    }
	public static void main(String[] args) {
		int testCaseCount=8;
		String answer;
		int[][] input={{2,2,2,3},{2,2,4,2},{2,5,2,2},{6,2,2,2},{2,2,3,3},{2,2,2,2},{3,3,2,2},{3,2,3,2}};
		String[] expectedOutput={"3","4","5","6","Input Error","Input Error","Input Error","Input Error"};
		System.out.println("Expected o/p \t\t\t Actual o/p");
		for(int i=0;i<testCaseCount;i++){
		    answer=nonRepeatingElement(input[i]);
		    System.out.println(expectedOutput[i]+"\t\t\t\t" +answer);
		}
	}
}
