package offer.Question1To10;

import offer.dataStruct.SeqStack;

public class Question9 {
    public SeqStack getSeqStack1() {
        return seqStack1;
    }

    public void setSeqStack1(SeqStack seqStack1) {
        this.seqStack1 = seqStack1;
    }

    public SeqStack getSeqStack2() {
        return seqStack2;
    }

    public void setSeqStack2(SeqStack seqStack2) {
        this.seqStack2 = seqStack2;
    }

    private SeqStack seqStack1;
    private SeqStack seqStack2;

    public Question9(int stackSize){
        seqStack1=new SeqStack(stackSize);
        seqStack2=new SeqStack(stackSize);
    }

    public void push(int pushElement){
        seqStack1.push(pushElement);
    }

    public int pop(){
        if(seqStack2.top>0){
            return seqStack2.pop();
        }
        else{
            while(seqStack1.top>0){
                seqStack2.push(seqStack1.pop());
            }
            return seqStack2.pop();
        }
    }
}

/*
*   Question9测试函数
*       Question9 question9=new Question9(10);
        SeqStack seqStack1=question9.getSeqStack1();
        SeqStack seqStack2=question9.getSeqStack2();

        question9.push(1);
        question9.push(2);
        question9.push(3);
        int test1=question9.pop();
        question9.push(4);
        int test2=question9.pop();
        int test3=question9.pop();
        System.out.println();
* */
