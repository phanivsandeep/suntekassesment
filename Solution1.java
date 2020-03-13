//Solution for Question 1

public class Solution1
{
    public static String xoroutput(int querycount,int[] array,int[][] queries){
        String ans="";int iter=0;
        if(querycount!=queries.length)
            return "Error";
        while(iter<querycount){
            if(queries[iter][1]>=array.length)
                    return "Error";
            int outp=array[queries[iter][1]];
            for(int i=queries[iter][0];i<queries[iter][1];i++){
                if(i>=array.length)
                    return "Error";
                outp=outp^array[i];
            }
            ans=ans+Integer.toString(outp)+" ";
            iter++;

        }
        return ans;
    }
	public static void main(String[] args) {
		int testCaseCount=4;
		String answer;
		int[] qcount={4,5,1,6};
        int[][] input={{1,3,4,8},{2,2,2,2,2},{0},{1,2,3,4,5,6,7}};
        int[][][] query={{{0,1},{1,2},{0,3},{3,3}},{{1,3}},{{0,1}},{{0,1},{0,6},{1,3},{6,6},{4,4},{2,6}}};
		String[] expectedOutput={"2 7 14 8","Error","Error","3 0 5 7 5 3"};
		System.out.println("Expected o/p \t\t\t Actual o/p");
		for(int i=0;i<testCaseCount;i++){
		    answer=xoroutput(qcount[i],input[i],query[i]);
            if(answer.equals("Error"))
                System.out.println(expectedOutput[i]+"\t\t\t\t" +answer);
            else
		    System.out.println(expectedOutput[i]+"\t\t\t" +answer);
		}
        
	}
}
