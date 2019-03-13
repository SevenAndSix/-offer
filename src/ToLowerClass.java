import java.util.HashSet;
import java.util.Set;

public class ToLowerClass {
    public String toLowerCase(String str) {
        String resultStr=str;
        for(int i=0;i<str.length();i++){
            char oldChar=str.charAt(i);
            if(oldChar>=65&&oldChar<=90){
                char newChar=(char)(oldChar+32);
                resultStr=resultStr.replace(oldChar,newChar);
            }
        }
        return resultStr;
    }

    public int[] sortedSquares(int[] A) {
        int[] B=new int[3];
        int[] retArray=new int[A.length];
        for(int i=0;i<A.length;i++){
            retArray[i]=A[i]*A[i];
        }
        if(A[0]>=0)
            return retArray;
        else if(retArray.length>1&&retArray[0]<=retArray[1]){
            return retArray;
        }
        else{
            for(int j=0;j<retArray.length;j++){
                int temp=retArray[j];
                int leastIndex=j;
                for(int k=j+1;k<retArray.length;k++){
                    if(retArray[k]<temp){
                        temp=retArray[k];
                        leastIndex=k;
                    }
                }
                if(leastIndex!=j){
                    retArray[leastIndex]=retArray[j];
                    retArray[j]=temp;
                }
            }
            return retArray;
        }
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCode={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> diffCode=new HashSet();
        for(int i=0;i<words.length;i++){
            String uniqueStr="";
            for(int j=0;j<words[i].length();j++){
                char temp=words[i].charAt(j);
                int morseIndex=temp-97;
                uniqueStr+=morseCode[morseIndex];
            }
            diffCode.add(uniqueStr);
        }
        return diffCode.size();
    }
}
