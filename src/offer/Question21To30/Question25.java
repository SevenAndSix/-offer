package offer.Question21To30;

import offer.dataStruct.LNode;

public class Question25 {
    public LNode mergeTwoLinkList(LNode headNode_1,LNode headNode_2){
        //考虑链表1或者链表2为空或者两者都为空的情况
        if(headNode_1==null)
            return headNode_2;
        else if (headNode_2==null)
            return headNode_1;

        LNode mergeHeaadNode=null;
        if(headNode_1.data<=headNode_2.data){
            mergeHeaadNode=headNode_1;
            mergeHeaadNode.nextNode=mergeTwoLinkList(headNode_1.nextNode,headNode_2);
        }
        else{
            mergeHeaadNode=headNode_2;
            mergeHeaadNode.nextNode=mergeTwoLinkList(headNode_1,headNode_2.nextNode);
        }

        return mergeHeaadNode;
    }
}

/*
*   Question25测试函数
*       LinkList linkList1=new LinkList(1);
        LinkList linkList2=new LinkList(1);
        LNode lNode1=linkList1.createLinklist();
        LNode lNode2=linkList2.createLinklist();
        Question25 question25=new Question25();
        LNode mergeNode=question25.mergeTwoLinkList(lNode1,lNode2);
        System.out.println();
* */
