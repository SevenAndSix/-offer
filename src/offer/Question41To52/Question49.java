package offer.Question41To52;

public class Question49 {
    public int getUglyNumber(int index){
        if(index<=0)
            return -1;
        int[] uglyNumberArray=new int[index];

        int curMaxUglyNumber;  //记录当前最大丑数
        int twoMultiBorder=0;   //记录乘以2、3或5大于目前最大丑数的边界位置
        int threeMultiBorder=0;
        int fiveMultiBorder=0;
        for(int i=0;i<index;i++){
            if(i==0){
                uglyNumberArray[i]=1;
                curMaxUglyNumber=uglyNumberArray[i];
                continue;
            }
            int minOfThree=minOfThreeNumber(uglyNumberArray[twoMultiBorder]*2,uglyNumberArray[threeMultiBorder]*3,uglyNumberArray[fiveMultiBorder]*5);
            uglyNumberArray[i]=minOfThree;
            curMaxUglyNumber=minOfThree;

            //更新乘以2、3或5大于目前最大丑数的边界位置
            while(!(uglyNumberArray[twoMultiBorder]*2>curMaxUglyNumber))
                twoMultiBorder++;
            while(!(uglyNumberArray[threeMultiBorder]*3>curMaxUglyNumber))
                threeMultiBorder++;
            while(!(uglyNumberArray[fiveMultiBorder]*5>curMaxUglyNumber))
                fiveMultiBorder++;

        }

        return uglyNumberArray[index-1];
    }

    public int minOfThreeNumber(int number1,int number2,int number3){
        int min=number1;
        if(number2<min)
            min=number2;
        if(number3<min)
            min=number3;

        return min;
    }
}

/*
*   Question49测试函数
*       Question49 question49=new Question49();
        int uglyNumberAtIndex=question49.getUglyNumber(1500);
* */
