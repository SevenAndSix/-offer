package offer.Question1To10;

public class Question2 {
    public int repeatDigit(int[] digits){
        int[] assistArray=new int[digits.length];
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=assistArray[digits[i]-1]){
                assistArray[digits[i]-1]=digits[i];
            }
            else{
                return digits[i];
            }
        }
        return -1;
    }
}
