package offer.Question1To10;

public class Question1 {
    public int repeatDigit(int[] digits){
        for(int i=0;i<digits.length;i++){
            int temp=digits[i];
            while(i!=digits[i]){
                if(digits[i]==digits[digits[i]]){
                    return digits[i];
                }
                digits[i]=digits[digits[i]];
                digits[temp]=temp;
                temp=digits[i];
            }
        }
        return -1;
    }
}
