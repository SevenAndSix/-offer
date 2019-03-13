package offer.tree;

public class BinaryTree {

    public int getTreeValue() {
        return treeValue;
    }

    public void setTreeValue(int treeValue) {
        this.treeValue = treeValue;
    }

    public BinaryTree getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(BinaryTree leftTree) {
        this.leftTree = leftTree;
    }

    public BinaryTree getRightTree() {
        return rightTree;
    }

    public void setRightTree(BinaryTree rightTree) {
        this.rightTree = rightTree;
    }

    private int treeValue;
    private BinaryTree leftTree;
    private BinaryTree rightTree;

    public BinaryTree(int treeValue){
        this.treeValue=treeValue;
        this.leftTree=null;
        this.rightTree=null;
    }
    public BinaryTree(){

    }

    //判断一个结点是否为叶结点
    public boolean isLeafNode(){
        if(this.leftTree==null&&this.rightTree==null)
            return true;
        else
            return false;
    }

}
