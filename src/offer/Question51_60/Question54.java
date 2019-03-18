package offer.Question51_60;

import offer.tree.BinaryTree;

public class Question54 {
    public BinaryTree findKthNode(BinaryTree head,int k){
        if(head==null||k<1)
            return null;

        BinaryTree[] binaryTree=new BinaryTree[1];
        return kthNode(head,binaryTree,new int[1],k);
    }

    //因为每次递归的时候内层的基本数据类型改变无法反映到外层，所以用数组来存储值
    public BinaryTree kthNode(BinaryTree curNode,BinaryTree[] binaryTree,int[] index,int k){
        if(curNode==null)
            return null;

        kthNode(curNode.getLeftTree(),binaryTree,index,k);
        index[0]++;
        if(index[0]==k){
            binaryTree[0]=curNode;
        }
        kthNode(curNode.getRightTree(),binaryTree,index,k);

        return binaryTree[0];
    }
}

/*
* 测试函数
*
        BinaryTree head=new BinaryTree(5);
        BinaryTree node1=new BinaryTree(3);
        BinaryTree node2=new BinaryTree(7);
        BinaryTree node3=new BinaryTree(2);
        BinaryTree node4=new BinaryTree(4);
        BinaryTree node5=new BinaryTree(6);
        BinaryTree node6=new BinaryTree(8);

        head.setLeftTree(node1);
        head.setRightTree(node2);

        node1.setLeftTree(node3);
        node1.setRightTree(node4);

        node2.setLeftTree(node5);
        node2.setRightTree(node6);

        Question54 question54=new Question54();
        question54.setK(3);
        BinaryTree resultNode=question54.findKthNode(head,question54.getK());
* */
