package offer.Question1To10;

import offer.tree.BinaryTree;

public class Question7 {
    public BinaryTree buildBinaryTree(BinaryTree binaryTree,int[] preOrder,int[] inOrder){
        if(preOrder.length==0&&inOrder.length==0){
            return null;
        }

        if(preOrder.length>0){
            binaryTree.setTreeValue(preOrder[0]);
        }
        int rootIndex=0;
        for(int i=0;i<inOrder.length;i++){
            if(inOrder[i]==preOrder[0])
                rootIndex=i;
        }
        //左子树
        if(rootIndex>0){
            int[] newLeftPreOrder=new int[rootIndex];
            int[] newLeftInOrder=new int[rootIndex];
            for(int j=0;j<rootIndex;j++){
                newLeftPreOrder[j]=preOrder[j+1];
                newLeftInOrder[j]=inOrder[j];
            }
            BinaryTree newLeftTree=new BinaryTree();
            binaryTree.setLeftTree(newLeftTree);
            buildBinaryTree(newLeftTree,newLeftPreOrder,newLeftInOrder);
        }
        else{
            binaryTree.setLeftTree(null);
        }

        //右子树
        if(rootIndex<(inOrder.length-1)){
            int inOrederLength=inOrder.length-rootIndex-1;
            int[] newRightPreOrder=new int[inOrederLength];
            int[] newRightInOrder=new int[inOrederLength];
            for(int k=0;k<inOrederLength;k++){
                newRightPreOrder[k]=preOrder[rootIndex+k+1];
                newRightInOrder[k]=inOrder[rootIndex+k+1];
            }
            BinaryTree newRightTree=new BinaryTree();
            binaryTree.setRightTree(newRightTree);
            buildBinaryTree(newRightTree,newRightPreOrder,newRightInOrder);
        }
        else{
            binaryTree.setRightTree(null);
        }

        return binaryTree;
    }
}
