package offer.tree;

public class ParentNodeTree {
    public char getTreeValue() {
        return treeValue;
    }

    public void setTreeValue(char treeValue) {
        this.treeValue = treeValue;
    }

    public ParentNodeTree getParentNode() {
        return parentNode;
    }

    public void setParentNode(ParentNodeTree parentNode) {
        this.parentNode = parentNode;
    }

    public ParentNodeTree getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(ParentNodeTree leftNode) {
        this.leftNode = leftNode;
    }

    public ParentNodeTree getRightNode() {
        return rightNode;
    }

    public void setRightNode(ParentNodeTree rightNode) {
        this.rightNode = rightNode;
    }

    private char treeValue;
    private ParentNodeTree parentNode;
    private ParentNodeTree leftNode;
    private ParentNodeTree rightNode;

    public ParentNodeTree(char treeValue){
        this.treeValue=treeValue;
    }
}
