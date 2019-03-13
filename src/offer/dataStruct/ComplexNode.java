package offer.dataStruct;

public class ComplexNode {
    public int getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(int nodeValue) {
        this.nodeValue = nodeValue;
    }

    public ComplexNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ComplexNode nextNode) {
        this.nextNode = nextNode;
    }

    public ComplexNode getRadomNode() {
        return radomNode;
    }

    public void setRadomNode(ComplexNode radomNode) {
        this.radomNode = radomNode;
    }

    private int nodeValue;
    private ComplexNode nextNode;
    private ComplexNode radomNode;

    public ComplexNode(int nodeValue){
        this.nodeValue=nodeValue;
        nextNode=null;
        radomNode=null;
    }
}
