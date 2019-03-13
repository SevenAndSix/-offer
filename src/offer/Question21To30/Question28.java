package offer.Question21To30;

import offer.tree.BinaryTree;

public class Question28 {
    public boolean symmetryBinaryTree(BinaryTree binaryTree){
        if(binaryTree==null)
            return false;
        if(binaryTree.getLeftTree()==null&&binaryTree.getRightTree()==null)
            return true;

        return nodeValueEqual(binaryTree.getLeftTree(),binaryTree.getRightTree());
    }

    public boolean nodeValueEqual(BinaryTree binaryTree1,BinaryTree binaryTree2){
        if(binaryTree1==null&&binaryTree2==null)
            return true;
        if((binaryTree1!=null&&binaryTree2==null)||(binaryTree1==null&&binaryTree2!=null))
            return false;

        boolean isSymmetry=false;
        if(binaryTree1.getTreeValue()==binaryTree2.getTreeValue()){
            isSymmetry=nodeValueEqual(binaryTree1.getLeftTree(),binaryTree2.getRightTree())
                    &&nodeValueEqual(binaryTree1.getRightTree(),binaryTree2.getLeftTree());
        }
        else {
            return false;
        }

        return isSymmetry;
    }
}

/*
*   Question28测试函数
*       BinaryTree tree1=new BinaryTree(8);
        BinaryTree tree2=new BinaryTree(6);
        BinaryTree tree3=new BinaryTree(6);
        BinaryTree tree4=new BinaryTree(5);
        BinaryTree tree5=new BinaryTree(7);
        BinaryTree tree6=new BinaryTree(7);
        BinaryTree tree7=new BinaryTree(5);

        tree1.setLeftTree(tree2);
        tree1.setRightTree(tree3);
        tree2.setLeftTree(tree4);
        tree2.setRightTree(tree5);
        tree3.setLeftTree(tree6);
        tree3.setRightTree(tree7);

        Question28 question28=new Question28();
        boolean isSymmetry=question28.symmetryBinaryTree(tree1);
* */
