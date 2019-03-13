package offer.Question31To40;

import offer.dataStruct.Queen;
import offer.tree.BinaryTree;

public class Question32 {
    private Queen queen;

    public Question32(){
        queen=new Queen();
    }

    public void printTreeNodeSingleLine(BinaryTree root){
        if(root==null)
            return;

        queen.push(root);
        while (!queen.queenEmpty()){
            BinaryTree toptree=queen.topElement();
            System.out.print(toptree.getTreeValue()+"\t");
            if(toptree.getLeftTree()!=null)
                queen.push(toptree.getLeftTree());
            if(toptree.getRightTree()!=null)
                queen.push(toptree.getRightTree());

            queen.pop();
        }
    }
}

/*
*   Question32测试函数
*       Question32 question32=new Question32();
        BinaryTree binaryTree1=new BinaryTree(8);
        BinaryTree binaryTree2=new BinaryTree(6);
        BinaryTree binaryTree3=new BinaryTree(10);
        BinaryTree binaryTree4=new BinaryTree(5);
        BinaryTree binaryTree5=new BinaryTree(7);
        BinaryTree binaryTree6=new BinaryTree(9);
        BinaryTree binaryTree7=new BinaryTree(11);

        binaryTree1.setLeftTree(binaryTree2);
        binaryTree1.setRightTree(binaryTree3);
        binaryTree2.setLeftTree(binaryTree4);
        binaryTree2.setRightTree(binaryTree5);
        binaryTree3.setLeftTree(binaryTree6);
        binaryTree3.setRightTree(binaryTree7);

        question32.printTreeNodeSingleLine(binaryTree1);
* */
