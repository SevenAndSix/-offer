package offer.dataStruct;

import offer.tree.BinaryTree;

//链表实现队列
public class Queen {
    private QueenNode topNode;
    private QueenNode endNode;

    //队列是否为空
    public boolean queenEmpty(){
        if(topNode==null)
            return true;
        else
            return false;
    }

    //入列
    public void push(BinaryTree binaryTree){
        QueenNode newNode=new QueenNode(binaryTree);
        if(topNode==null&&endNode==null){
            topNode=newNode;
            endNode=topNode;
        }
        else {
            endNode.nextNode=newNode;
            endNode=endNode.nextNode;
        }
    }

    //出列
    public void pop(){
        if(topNode!=null){
            topNode=topNode.nextNode;
        }
    }

    //队头元素
    public BinaryTree topElement(){
        if(topNode!=null)
            return topNode.binaryTree;
        else
            return null;
    }

    //队尾元素
    public BinaryTree endElement(){
        if(endNode!=null)
            return endNode.binaryTree;
        else
            return null;
    }
}
