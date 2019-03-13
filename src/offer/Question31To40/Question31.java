package offer.Question31To40;

import offer.dataStruct.SeqStack;

public class Question31 {
    private SeqStack seqStack;

    public Question31(int stackSize){
        seqStack=new SeqStack(stackSize);
    }

    public boolean isPopSequence(int[] pushSeq,int[] popSeq){
        if(pushSeq==null||popSeq==null)
            return false;
        if(pushSeq.length!=popSeq.length)
            return false;

        int pushIndex=0;
        int popIindex=0;
        while(pushIndex<pushSeq.length&&popIindex<popSeq.length){
            while(pushSeq[pushIndex]!=popSeq[popIindex]){
                seqStack.push(pushSeq[pushIndex]);
                pushIndex++;
            }

            popIindex++;
            while(seqStack.top>0&&seqStack.top()==popSeq[popIindex]&&popIindex<popSeq.length&&seqStack.top>0){
                seqStack.pop();
                popIindex++;
            }
            pushIndex++;
        }
        if(popIindex==popSeq.length&&seqStack.top==0)
            return true;
        else
            return false;
    }
}

/*
*   Question31测试函数
*       Question31 question31=new Question31(10);
        int[] pushSeq={1,2,3,4,5};
        int[] popSeq={4,3,5,1,2};
//        int[] pushSeq={1};
//        int[] popSeq={1};
        boolean result=question31.isPopSequence(pushSeq,popSeq);
* */

