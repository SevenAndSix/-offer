package offer.Question21To30;

import offer.dataStruct.LNode;

public class Question22 {
    public LNode findKthToTail(LNode headNode,int kValue){
        if(headNode==null||kValue==0)
            return null;

        LNode beforeNode=headNode;
        LNode afterNode=headNode;
        for(int i=1;i<kValue;i++){
            if(beforeNode.nextNode!=null)
                beforeNode=beforeNode.nextNode;
            else
                return null;
        }

        while (beforeNode.nextNode!=null){
            beforeNode=beforeNode.nextNode;
            afterNode=afterNode.nextNode;
        }

        return afterNode;
    }
}

/*
*   Question22测试函数
*       LinkList dataStruct=new LinkList(6);
        LNode headNode=dataStruct.createLinklist();
        Question22 question22=new Question22();
        LNode resultNode=question22.findKthToTail(headNode,8);
* */
