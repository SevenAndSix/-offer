package offer.Question21To30;

import offer.tree.BinaryTree;

public class Question27 {
    public BinaryTree mirrorBinaryTree(BinaryTree rootNode){
        if(rootNode==null)
            return null;
        else if(rootNode.getLeftTree()==null&&rootNode.getRightTree()==null)
            return rootNode;
        else {
            BinaryTree nodeRecord=rootNode.getLeftTree();
            rootNode.setLeftTree(rootNode.getRightTree());
            rootNode.setRightTree(nodeRecord);
            mirrorBinaryTree(rootNode.getLeftTree());
            mirrorBinaryTree(rootNode.getRightTree());
        }

        return rootNode;
    }
}

/*
*   Question27测试函数
*       BinaryTree tree1=new BinaryTree(8);
        BinaryTree tree2=new BinaryTree(6);
        BinaryTree tree3=new BinaryTree(10);
        BinaryTree tree4=new BinaryTree(5);
        BinaryTree tree5=new BinaryTree(7);
        BinaryTree tree6=new BinaryTree(9);
        BinaryTree tree7=new BinaryTree(11);

        tree1.setLeftTree(tree2);
        tree1.setRightTree(tree3);
        tree2.setLeftTree(tree4);
        tree2.setRightTree(tree5);
        tree3.setLeftTree(tree6);
        tree3.setRightTree(tree7);

        Question27 question27=new Question27();
        BinaryTree resultTree=question27.mirrorBinaryTree(tree1);
* */
