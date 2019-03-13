package offer.Question1To10;

public class Question3 {
    public boolean findDigit(int[][] digits,int rawSize,int colSize,int foundDigit){
        //从右上角开始测试
        int rawFlag=0;
        int colFlag=colSize-1;
        while(rawFlag<rawSize&&colFlag>=0){
            if(digits[rawFlag][colFlag]==foundDigit)
                return true;
            else if(digits[rawFlag][colFlag]>foundDigit)
                colFlag--;
            else
                rawFlag++;
        }
        return false;
    }
}
