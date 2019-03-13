package offer.Question21To30;

import offer.dataStruct.LNode;

public class Question24 {
    public LNode reverseLinkList(LNode headNode){
        if(headNode==null)
            return null;
        if(headNode.nextNode==null)
            return headNode;
        //节点数为2的情况
        if(headNode.nextNode.nextNode==null){
            headNode.nextNode.nextNode=headNode;
            headNode.nextNode=null;
            return headNode.nextNode;
        }

        LNode beforeNode=headNode;
        LNode curNode=headNode.nextNode;
        LNode afterNode=curNode.nextNode;
        beforeNode.nextNode=null;

        //节点大于两个的情况
        while (curNode!=null){
            curNode.nextNode=beforeNode;
            beforeNode=curNode;
            curNode=afterNode;
            if(afterNode!=null){
                afterNode=afterNode.nextNode;
            }
        }

        return beforeNode;
    }
}

/*
*   Question24测试函数
*       LinkList dataStruct=new LinkList(6);
        //LNode testNode=new LNode(76);
        LNode headNode=dataStruct.createLinklist();
        Question24 question24=new Question24();
        LNode newHeadNode=question24.reverseLinkList(headNode);
        System.out.println();
* */
