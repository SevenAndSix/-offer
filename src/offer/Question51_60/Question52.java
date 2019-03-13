package offer.Question51_60;

import offer.dataStruct.LNode;

public class Question52 {
    public LNode firstCommonNode(LNode headNode_1,LNode headNode_2){
        if(headNode_1==null||headNode_2==null)
            return null;

        LNode curNode_1=headNode_1,curNode_2=headNode_2;
        //计算两个链表长度
        int count_1=0,count_2=0;
        while (curNode_1!=null){
            curNode_1=curNode_1.nextNode;
            count_1++;
        }
        while (curNode_2!=null){
            curNode_2=curNode_2.nextNode;
            count_2++;
        }

        int distinctValue=Math.abs(count_1-count_2);
        if(distinctValue!=0){
            if(count_1>count_2){
                curNode_1=headNode_1;
                curNode_2=headNode_2;
                for(int i=0;i<distinctValue;i++){
                    curNode_1=curNode_1.nextNode;
                }
            }
            else {
                curNode_1=headNode_1;
                curNode_2=headNode_2;
                for(int i=0;i<distinctValue;i++){
                    curNode_2=curNode_2.nextNode;
                }
            }
        }

        while (curNode_1!=curNode_2){
            curNode_1=curNode_1.nextNode;
            curNode_2=curNode_2.nextNode;
        }

        return curNode_1;
    }
}

/*
* 测试函数
* Question52 question52=new Question52();
        LNode node1_1=new LNode(1);
        LNode node1_2=new LNode(3);
        LNode node1_3=new LNode(5);
        LNode node2_1=new LNode(2);
        LNode node2_2=new LNode(4);
        LNode node3=new LNode(6);
        LNode node4=new LNode(7);
        LNode node5=new LNode(8);

        node1_1.nextNode=node1_2;
        node1_2.nextNode=node1_3;
        node1_3.nextNode=node3;
        node3.nextNode=node4;
        node4.nextNode=node5;

        node2_1.nextNode=node2_2;
        node2_2.nextNode=node3;
        node3.nextNode=node4;
        node4.nextNode=node5;

        LNode resultNode=question52.firstCommonNode(node1_1,node2_1);
* */
