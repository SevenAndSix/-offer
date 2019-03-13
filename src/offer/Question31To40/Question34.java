package offer.Question31To40;

import offer.dataStruct.SeqStack;
import offer.tree.BinaryTree;

public class Question34 {
    private SeqStack stack;

    public Question34(int stackSize){
        stack=new SeqStack(stackSize);
    }

    public void pathEqualValue(BinaryTree binaryTree,int pathValue){
        if(binaryTree==null)
            return;

        stack.push(binaryTree.getTreeValue());
        if(binaryTree.getLeftTree()==null&&binaryTree.getRightTree()==null){
            if(stack.totalValue()==pathValue){
                stack.printStack();
                stack.pop();
                return;
            }
            else{
                stack.pop();
                return;
            }
        }

        pathEqualValue(binaryTree.getLeftTree(),pathValue);
        pathEqualValue(binaryTree.getRightTree(),pathValue);
        stack.pop();
    }
}

/*
*   Question34测试函数
*       Question34 question34=new Question34(25);
        BinaryTree binaryTree1=new BinaryTree(10);
        BinaryTree binaryTree2=new BinaryTree(5);
        BinaryTree binaryTree3=new BinaryTree(12);
        BinaryTree binaryTree4=new BinaryTree(4);
        BinaryTree binaryTree5=new BinaryTree(7);

        binaryTree1.setLeftTree(binaryTree2);
        binaryTree1.setRightTree(binaryTree3);
        binaryTree2.setLeftTree(binaryTree4);
        binaryTree2.setRightTree(binaryTree5);

        question34.pathEqualValue(binaryTree1,22);
* */
