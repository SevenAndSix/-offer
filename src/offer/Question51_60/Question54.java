package offer.Question51_60;

import offer.tree.BinaryTree;

public class Question54 {
    private int k;
    public Question54(int k){
        this.k=k;
    }

    public BinaryTree findKthNode(BinaryTree head,int k){
        if(head==null||k<1)
            return null;

        return kthNode(head,k);
    }

    public BinaryTree kthNode(BinaryTree curNode,int k){
        if(curNode==null||curNode.isLeafNode())
            return curNode;
        BinaryTree targetNode=null;

        if(k!=0){
            targetNode=kthNode(curNode.getLeftTree(),k);
            if(k!=0)
                k--;
        }
        if(k!=0){
            k--;
            targetNode=curNode;
        }
        if(k!=0){
            targetNode=kthNode(curNode.getRightTree(),k);
            k--;
        }

        return targetNode;
    }
}
