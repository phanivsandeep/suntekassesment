//Solution for Question 2

public class Solution2
{
    //To equalize all the binary strings. Ex: 1,15=1,1111=>0001,1111
    public static String[] stringEqualizer(String str1,String str2,String str3){
        String[] retans=new String[3];
        String zero="0";

            int lendiff=Math.max(Math.max(str1.length(),str2.length()),str3.length());
            retans[0]= new String(new char[lendiff-str1.length()]).replace("\0", zero)+str1;
            retans[1]= new String(new char[lendiff-str2.length()]).replace("\0", zero)+str2;
            retans[2]= new String(new char[lendiff-str3.length()]).replace("\0", zero)+str3;
            return retans;
    }
    public static String minFlipsRequired(int[] list){
        int count=0;
        if(((list[0])|(list[1]))==list[2])
            return "0";
        else{
        String a1=Integer.toString(list[0],2);
        String b1=Integer.toString(list[1],2);
        String c1=Integer.toString(list[2],2);
        String[] retedans=new String[3];
        
        
            retedans=stringEqualizer(a1,b1,c1);
            char[] a=retedans[0].toCharArray();
            char[] b=retedans[1].toCharArray();
            char[] c=retedans[2].toCharArray();
            
            for(int i=0;i<a.length;i++)
            {
                if(((Character.getNumericValue(a[i]))|(Character.getNumericValue(b[i])))!=Character.getNumericValue(c[i])){
                    if(c[i]=='0' && a[i]=='1' && b[i]=='1')
                        count=count+2;
                    else if(c[i]=='0' && (a[i]=='0' && b[i]=='1')||(a[i]=='1' && b[i]=='0'))
                        count=count+1;
                    else if(c[i]=='1' && a[i]=='0' && b[i]=='0')
                        count=count+1;
                }
            }
            }
            return Integer.toString(count);
        }
    
    
	public static void main(String[] args) {
		int testCaseCount=4;
		String answer;
		int[][] input={{0,2,15},{15,7,0},{1,15,10},{9,14,15}};
		String[] expectedOutput={"3","7","3","0"};
		System.out.println("Expected o/p \t\t\t Actual o/p");
		for(int i=0;i<testCaseCount;i++){
		    answer=minFlipsRequired(input[i]);
		    System.out.println(expectedOutput[i]+"\t\t\t\t" +answer);
		}
	}
}
