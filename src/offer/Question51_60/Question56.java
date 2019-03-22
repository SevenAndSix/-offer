package offer.Question51_60;

public class Question56 {
    public int[] appearOneTimeDigits(int[] numbers){
        int[] result=new int[2];
        int xOrResult=0;
        for(int i=0;i<numbers.length;i++){
            xOrResult^=numbers[i];
        }

        //以第几位为1作为分组标准
        int oneFlag=findFirstOne(xOrResult);
        int firstGroup=0,secondGroup=0;

        for(int j=0;j<numbers.length;j++){
            if(digitBelong(numbers[j],oneFlag)){
                firstGroup^=numbers[j];
            }
            else {
                secondGroup^=numbers[j];
            }
        }

        result[0]=firstGroup;
        result[1]=secondGroup;

        return result;
    }

    public int findFirstOne(int xOr){
        int count=0;
        while ((xOr&1)==0&&count<32){  //保证移动的次数小于整数的32位
            xOr=xOr>>1;
            count++;
        }

        return count;
    }

    public boolean digitBelong(int number,int oneFlag){
        for(int i=0;i<oneFlag;i++){
            number=number>>1;
        }

        if((number&1)==1)
            return true;
        else
            return false;
    }
}

/*
* 测试函数
*       Question56 question56=new Question56();
        int[] numbers={2,4,3,6,3,2,5,5};
        int[] result=question56.appearOneTimeDigits(numbers);
* */
