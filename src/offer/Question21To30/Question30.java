package offer.Question21To30;

import offer.dataStruct.SeqStack;

public class Question30 {
    private SeqStack stack_data;
    private SeqStack stack_min;

    public Question30(int dataSize){
        stack_data=new SeqStack(dataSize);
        stack_min=new SeqStack(dataSize);
    }

    public void push(int pushNumber){
        if(stack_data.top==0){
            stack_data.push(pushNumber);
            stack_min.push(pushNumber);

            return;
        }

        if(pushNumber<stack_min.top()){
            stack_data.push(pushNumber);
            stack_min.push(pushNumber);
        }
        else {
            stack_data.push(pushNumber);
            stack_min.push(stack_min.top());
        }
    }

    public void pop(){
        stack_data.pop();
        stack_min.pop();
    }

    public int min(){
        return stack_min.top();
    }
}

/*
*   Question30测试函数
*       Question30 question30=new Question30(10);
        question30.push(3);
        question30.push(4);
        question30.push(2);
        question30.push(1);
        question30.pop();
        question30.pop();
        question30.push(0);
        int min=question30.min();
* */
