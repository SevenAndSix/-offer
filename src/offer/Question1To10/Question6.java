package offer.Question1To10;

import offer.dataStruct.LNode;
import offer.dataStruct.SeqStack;

public class Question6 {

    //利用栈结构实现链表数据的倒序输出
    public void reverseLinkList(LNode lNode){
        SeqStack seqStack=new SeqStack(20);
        while(lNode!=null){
            try{
                seqStack.push(lNode.data);
                lNode=lNode.nextNode;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        while(seqStack.top!=0){
            System.out.print(seqStack.stackElement[seqStack.top-1]+" ");
            try{
                seqStack.pop();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    //递归实现链表数据的倒序输出
    public void recursiveOutput(LNode lNode){
        if(lNode.nextNode!=null)
            recursiveOutput(lNode.nextNode);
        System.out.print(lNode.data+" ");
    }

}
