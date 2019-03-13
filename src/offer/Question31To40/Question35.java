package offer.Question31To40;

import offer.dataStruct.ComplexNode;

public class Question35 {
    public ComplexNode clone(ComplexNode headNode){
        if(headNode==null)
            return null;

        ComplexNode headNode_1=clone_1(headNode);
        ComplexNode headNode_2=clone_2(headNode_1);

        return clone_3(headNode_2);
    }

    //将复制的链表和原链表连城一个链表
    public ComplexNode clone_1(ComplexNode headNode){
        ComplexNode complexNode=headNode;

        while(complexNode!=null){
            ComplexNode tempNode=complexNode.getNextNode(); // 当前节点下一结点
            ComplexNode cloneNode=new ComplexNode(complexNode.getNodeValue());  //复制的节点
            complexNode.setNextNode(cloneNode);   //插入复制的节点
            cloneNode.setNextNode(tempNode);
            complexNode=tempNode;
        }
        return headNode;
    }

    //通过原链表的radomNode找到复制节点的radomNode的指向
    public ComplexNode clone_2(ComplexNode headNode){
        ComplexNode complexNode=headNode;

        while(complexNode!=null){
            ComplexNode radomNode=complexNode.getRadomNode();
            ComplexNode cloneNode=complexNode.getNextNode();
            if(radomNode==null){
                cloneNode.setRadomNode(null);
            }
            else{
                cloneNode.setRadomNode(radomNode.getNextNode());
            }
            complexNode=cloneNode.getNextNode();
        }

        return headNode;
    }

    //将链表拆分成原链表和复制链表
    public ComplexNode clone_3(ComplexNode headNode){
        ComplexNode complexNode=headNode;
        ComplexNode resultHeadNode=headNode.getNextNode();
        ComplexNode traverNode=resultHeadNode;

        while(traverNode.getNextNode()!=null){
            complexNode.setNextNode(traverNode.getNextNode());
            complexNode=traverNode.getNextNode();
            traverNode.setNextNode(complexNode.getNextNode());
            traverNode=complexNode.getNextNode();
        }

        return resultHeadNode;
    }
}

/*
*   Question35测试函数
*       Question35 question35=new Question35();

        ComplexNode node1=new ComplexNode(1);
        ComplexNode node2=new ComplexNode(2);
        ComplexNode node3=new ComplexNode(3);
        ComplexNode node4=new ComplexNode(4);
        ComplexNode node5=new ComplexNode(5);

        node1.setNextNode(node2);
        node1.setRadomNode(node3);

        node2.setNextNode(node3);
        node2.setRadomNode(node5);

        node3.setNextNode(node4);
        node3.setRadomNode(node1);

        node4.setNextNode(node5);
        node4.setRadomNode(node2);

        node5.setNextNode(null);
        node5.setRadomNode(null);

        ComplexNode resultNode=question35.clone(node1);
* */
