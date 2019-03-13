package offer.Question41To52;

public class Question46 {
    public int digitToStringKinds(int number){
        //char[] alphabet={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        if(number<0)
            return 0;

        int[] digitPerBit=bitsOneNumber(number);
        int numberBits=digitPerBit.length;   //数字的位数
        //定义函数f(i)表示从第i位数字开始的不同翻译的数目
        int[] fValue=new int[numberBits];

        for(int i=0;i<numberBits;i++){
            fValue[i]=calculateFValue(digitPerBit,i);
        }

        return fValue[0];
    }

    //计算函数f(i)的值
    public int calculateFValue(int[] digitPerBit,int beginIndex){
        if(beginIndex==digitPerBit.length-1)
            return 1;
        if(beginIndex>=digitPerBit.length)
            return 1;

        int result;
        int beginConnectAfter=digitPerBit[beginIndex]*10+digitPerBit[beginIndex+1];
        if(beginConnectAfter>=0&&beginConnectAfter<26){
            result=calculateFValue(digitPerBit,beginIndex+1)+calculateFValue(digitPerBit,beginIndex+2);
        }
        else {
            result=calculateFValue(digitPerBit,beginIndex+1);
        }

        return result;
    }

    //将数字按每一位进行分割
    public int[] bitsOneNumber(int number){
        int count=0;
        int temp=number;
        while (temp!=0){
            temp/=10;
            count++;
        }

        int[] digitPerBit=new int[count];
        for(int i=0;i<count;i++){
            digitPerBit[count-i-1]=number%10;
            number/=10;
        }

        return digitPerBit;
    }
}

/*
*   Question46测试函数
*       Question46 question46=new Question46();
        int result=question46.digitToStringKinds(1225);
* */
