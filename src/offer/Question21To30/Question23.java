package offer.Question21To30;

import offer.dataStruct.LNode;

public class Question23 {
    public LNode ringEntranceNode(LNode headNode){
        //当链表为空或者只有一个节点时
        if(headNode==null||headNode.nextNode==null)
            return null;

        LNode beforeNode=headNode;
        LNode afterNode=headNode;
        LNode meetNode=meetingNode(headNode);
        //链表中没有环的时候
        if(meetNode==null)
            return null;

        int ringNodes=ringNodeNumbers(meetNode);
        //让前一个引用先走环节点数步
        for(int i=0;i<ringNodes;i++){
            beforeNode=beforeNode.nextNode;
        }
        while (beforeNode!=afterNode){
            beforeNode=beforeNode.nextNode;
            afterNode=afterNode.nextNode;
        }

        return beforeNode;
    }

    //寻找两对象引用相遇的节点
    public LNode meetingNode(LNode headNode){
        if(headNode==null)
            return null;

        LNode beforeNode=headNode.nextNode;
        LNode afterNode=headNode;
        while((beforeNode!=afterNode)&&(beforeNode.nextNode!=null)){
            beforeNode=beforeNode.nextNode.nextNode;
            afterNode=afterNode.nextNode;
        }

        if(beforeNode.nextNode==null)
            return null;
        return beforeNode;
    }

    //找出环的节点数
    public int ringNodeNumbers(LNode meetNode){
        if(meetNode==null)
            return 0;

        int count=0;
        LNode flagNode=meetNode;
        do{
            meetNode=meetNode.nextNode;
            count++;
        }while (meetNode!=flagNode);

        return count;
    }
}

/*
*   Question23测试函数
*       LNode node1=new LNode(1);
        LNode node2=new LNode(2);
        LNode node3=new LNode(3);
        LNode node4=new LNode(4);
        LNode node5=new LNode(5);
        LNode node6=new LNode(6);

        node1.nextNode=node2;
        node2.nextNode=node3;
        node3.nextNode=node4;
        node4.nextNode=node5;
        node5.nextNode=node6;
        node6.nextNode=null;

        Question23 question23=new Question23();
        LNode entranceNode=question23.ringEntranceNode(node1);
        System.out.println();
* */
