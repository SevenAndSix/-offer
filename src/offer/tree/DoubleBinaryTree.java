package offer.tree;

public class DoubleBinaryTree {
    public double getTreeValue() {
        return treeValue;
    }

    public void setTreeValue(double treeValue) {
        this.treeValue = treeValue;
    }

    public DoubleBinaryTree getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(DoubleBinaryTree leftTree) {
        this.leftTree = leftTree;
    }

    public DoubleBinaryTree getRightTree() {
        return rightTree;
    }

    public void setRightTree(DoubleBinaryTree rightTree) {
        this.rightTree = rightTree;
    }

    public DoubleBinaryTree(double treeValue){
        this.treeValue=treeValue;
    }

    private double treeValue;
    private DoubleBinaryTree leftTree;
    private DoubleBinaryTree rightTree;
}
