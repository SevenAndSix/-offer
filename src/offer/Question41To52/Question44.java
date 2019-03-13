package offer.Question41To52;

public class Question44 {
    public int digitAtIndex(int index){
        if(index<0){
            System.out.println("无效索引");
            return -1;
        }
        if(index<10)
            return index;

        //计算该索引属于的数字是几位
        index-=9;
        int bitCount=10;    //根据数字的位数变化
        int digitBit=2;
        while ((index-bitCount*9*digitBit)>0){
            index=index-bitCount*9*digitBit;
            digitBit++;
            bitCount*=10;
        }

        int digitCount;     //记录这个数处于几位数的第几个
        if(index%digitBit==0){
            digitCount=index/digitBit;
        }
        else {
            digitCount=index/digitBit+1;
        }

        int digit=calculateDigit(digitBit,digitCount);
        int result=valueAtIndex(digit,digitBit,index);

        return result;
    }

    //计算索引属于的数
    public int calculateDigit(int digitBit,int index){
        int bitBegintDigit=bitFirstDigit(digitBit);   //相应位数的第一个数
        int result=bitBegintDigit+index-1;

        return result;
    }

    //计算相应位的第一个数
    public int bitFirstDigit(int digitBit){
        int bitBegintDigit=1;   //相应位数的第一个数
        while (digitBit>1){
            bitBegintDigit=bitBegintDigit*10;
            digitBit--;
        }
        return bitBegintDigit;
    }

    //计算索引位置处的值
    public int valueAtIndex(int belongDigit,int digitBit,int index){
        int bitBegintDigit=bitFirstDigit(digitBit);   //相应位数的第一个数
        int digitLoc;
        if(index<=digitBit){
            digitLoc=index;
        }
        else{
            if(index%digitBit==0)
                digitLoc=digitBit;
            else
                digitLoc=index-(index/digitBit)*digitBit;
        }

        for(int i=0;i<=(digitBit-digitLoc);i++){
            if(i==digitBit-digitLoc)
                belongDigit%=10;
            else
                belongDigit/=10;

        }

        return belongDigit;
    }
}

/*
*   Question44测试函数
*       Question44 question44=new Question44();
        int digitAtIndex=question44.digitAtIndex(201);
* */
