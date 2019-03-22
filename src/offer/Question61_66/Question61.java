package offer.Question61_66;

import offer.sortAlgorithm.QuickSort;

public class Question61 {
    public boolean isStraight(int[] numbers){
        if(numbers==null||numbers.length!=5)
            return false;

        QuickSort quickSort=new QuickSort();
        quickSort.quickSort(numbers,0,4);

        int zeroCount=0;
        for(int number:numbers){
            if(number==0)
                zeroCount++;
        }

        int totalGap=0;
        for(int i=0;i<numbers.length-1;i++){
            //对子的情况
            if(numbers[i+1]==numbers[i])
                return false;
            if(numbers[i]!=0){
                if((numbers[i+1]-numbers[i])!=1)
                    totalGap+=(numbers[i+1]-numbers[i]-1);
            }
        }

        return zeroCount>=totalGap?true:false;
    }
}

/*
* 测试函数
*       Question61 question61=new Question61();
        int[] numbers={3,1,5,0,4};
        boolean result=question61.isStraight(numbers);
* */
