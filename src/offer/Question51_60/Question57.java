package offer.Question51_60;

public class Question57 {
    //数组递增排序
    public boolean findSumEqualsS(int[] numbers,int length,int s){
        if(numbers==null||length<2)
            return false;

        int num1Index=0,num2Index=length-1;
        int num1=numbers[num1Index];
        int num2=numbers[num2Index];
        while ((num1+num2)!=s&&num1Index<num2Index){
            if((num1+num2)>s){
                num2=numbers[--num2Index];
            }
            else {
                num1=numbers[++num1Index];
            }
        }

        if((num1+num2)==s){
            System.out.println("("+num1+","+num2+")");
            return true;
        }
        else {
            return false;
        }
    }
}

/*
* 测试函数
*       Question57 question57=new Question57();
        int[] numbers={1,2,4,7,11,15};
        boolean result=question57.findSumEqualsS(numbers,6,15);
* */

