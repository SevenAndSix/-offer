package offer.Question31To40;

import offer.tree.BinaryTree;

public class Question36 {
    public BinaryTree convert(BinaryTree root){
        BinaryTree pLastNode=null;
        pLastNode=convertNode(root,pLastNode);

        //返回头结点
        BinaryTree headNode=pLastNode;
        while(headNode!=null&&headNode.getLeftTree()!=null){
            headNode=headNode.getLeftTree();
        }

        return headNode;
    }

    public BinaryTree convertNode(BinaryTree root,BinaryTree pLastNode){
        if(root==null)
            return null;

        BinaryTree currentNode=root;
        if(currentNode.getLeftTree()!=null)
            pLastNode=convertNode(currentNode.getLeftTree(),pLastNode);

        currentNode.setLeftTree(pLastNode);
        if(pLastNode!=null)
            pLastNode.setRightTree(currentNode);

        pLastNode=currentNode;

        if(currentNode.getRightTree()!=null)
            pLastNode=convertNode(currentNode.getRightTree(),pLastNode);

        return pLastNode;
    }
}

/*
*   Question36测试函数
*       Question36 question36=new Question36();
        BinaryTree binaryTree1=new BinaryTree(10);
        BinaryTree binaryTree2=new BinaryTree(6);
        BinaryTree binaryTree3=new BinaryTree(14);
        BinaryTree binaryTree4=new BinaryTree(4);
        BinaryTree binaryTree5=new BinaryTree(8);
        BinaryTree binaryTree6=new BinaryTree(12);
        BinaryTree binaryTree7=new BinaryTree(16);

        binaryTree1.setLeftTree(binaryTree2);
        binaryTree1.setRightTree(binaryTree3);
        binaryTree2.setLeftTree(binaryTree4);
        binaryTree2.setRightTree(binaryTree5);
        binaryTree3.setLeftTree(binaryTree6);
        binaryTree3.setRightTree(binaryTree7);

        BinaryTree doubleLinkList=question36.convert(binaryTree1);
* */
