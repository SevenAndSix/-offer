package offer.dataStruct;

public class LinkList {
    private int linkLength;

    public LinkList(int linkLength){
        this.linkLength=linkLength;
    }

    public LNode createLinklist(){
        int i=1;
        LNode headNode=new LNode();
        headNode.data=i;
        LNode locNode=headNode;
        while(locNode.data!=linkLength){
            i++;
            locNode.nextNode=new LNode();
            locNode=locNode.nextNode;
            locNode.data=i;
        }
        return headNode;
    }

    public void printLinkList(LNode lNode){
        while(lNode!=null){
            System.out.print(lNode.data+" ");
            lNode=lNode.nextNode;
        }
    }
}
