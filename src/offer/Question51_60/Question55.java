package offer.Question51_60;

import offer.tree.BinaryTree;

public class Question55 {
    public int binaryTreeDepth(BinaryTree rootNode){
        if(rootNode==null)
            return 0;

        int leftHeight=binaryTreeDepth(rootNode.getLeftTree());
        int rightHeight=binaryTreeDepth(rootNode.getRightTree());

        return leftHeight>rightHeight?(leftHeight+1):(rightHeight+1);
    }

    public boolean isBalanceTree(BinaryTree root){
        if(root==null)
            return true;

        //先判断最大的子树
        int left=isAVLTree(root.getLeftTree());
        int right=isAVLTree(root.getRightTree());
        int diff=left-right;
        if(diff>1||diff<-1)
            return false;

        return isBalanceTree(root.getLeftTree())&&isBalanceTree(root.getRightTree());
    }

    public int isAVLTree(BinaryTree root){
        if(root==null){
            return 0;
        }

        int left=isAVLTree(root.getLeftTree());
        int right=isAVLTree(root.getRightTree());


        return Math.max(left,right)+1;
    }
}

/*
* 测试函数
*       BinaryTree root=new BinaryTree(1);
        BinaryTree node1=new BinaryTree(2);
        BinaryTree node2=new BinaryTree(3);
        BinaryTree node3=new BinaryTree(4);
        BinaryTree node4=new BinaryTree(5);
        BinaryTree node5=new BinaryTree(6);
        BinaryTree node6=new BinaryTree(7);

        root.setLeftTree(node1);
        root.setRightTree(node2);

        node1.setLeftTree(node3);
        node1.setRightTree(node4);

        node2.setRightTree(node5);

        node4.setLeftTree(node6);

        Question55 question55=new Question55();
        int treeHeight=question55.binaryTreeDepth(root);
        boolean isAVLTree=question55.isBalanceTree(root);
* */
