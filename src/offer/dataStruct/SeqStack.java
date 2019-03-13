package offer.dataStruct;

public class SeqStack {
    public int[] stackElement;
    public int top;

    public SeqStack(int maxSize){
        stackElement=new int[maxSize];
    }

    //入栈
    public void push(int inElement){
        if(top==stackElement.length){
            System.out.println("栈已满");
            return;
        }
        else {
            stackElement[top]=inElement;
            top++;
        }
    }

    //出栈
    public int pop(){
        if(top==0){
            System.out.println("栈为空");
            return -1;
        }
        else{
            top--;
            return stackElement[top];
        }
    }

    //栈顶元素
    public int top(){
        return stackElement[top-1];
    }

    //栈中元素总和
    public int totalValue(){
        int result=0;
        int stackIndex=top;
        while (stackIndex!=0){
            result+=stackElement[stackIndex-1];
            stackIndex--;
        }
        return result;
    }

    //压栈的逆顺序打印栈中元素
    public void printStack(){
        int stackIndex=0;
        while (stackIndex!=top){
            System.out.print(stackElement[stackIndex]+"\t");
            stackIndex++;
        }
        System.out.println();   //换行
    }

}
