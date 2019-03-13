package offer.dataStruct;

import offer.tree.BinaryTree;

public class QueenNode {
    public BinaryTree binaryTree;
    public QueenNode nextNode;

    public QueenNode(BinaryTree binaryTree) {
        this.binaryTree=binaryTree;
        nextNode=null;
    }

    public QueenNode(){

    }
}
