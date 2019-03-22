package offer.Question61_66;

public class Question63 {
    public int maxProfit(int[] stockValueByTime){
        if(stockValueByTime==null||stockValueByTime.length<2)
            return 0;

        int maxDiff=0;   //买到立马卖出去利润为0
        int min=stockValueByTime[0];
        for(int i=1;i<stockValueByTime.length;i++){
            int diff=stockValueByTime[i]-min;
            if(diff>maxDiff)
                maxDiff=diff;
            if(stockValueByTime[i]<min){
                min=stockValueByTime[i];
            }
        }

        return maxDiff;
    }
}

/*
* 测试函数
*       Question63 question63=new Question63();
        int[] stockValue={9,11,8,5,7,12,16,14};
        int[] incValue={7,11,13,15,17,18};
        int[] decValue={17,15,14,11,8};
        int result=question63.maxProfit(decValue);
* */
