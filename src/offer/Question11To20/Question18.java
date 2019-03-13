package offer.Question11To20;

import offer.dataStruct.LNode;

public class Question18 {
    public void deleteNode(LNode headNode,LNode deleteNode){
        if(headNode==null||deleteNode==null)
            return;

        //只有一个节点时
        if(headNode==deleteNode){
            headNode=null;
            deleteNode=null;
        }

        //待删节点为尾节点时
        else if((headNode!=deleteNode)&&(deleteNode.nextNode==null)){
            LNode tempNode=headNode;
            while(tempNode.nextNode!=deleteNode){
                tempNode=tempNode.nextNode;
            }
            tempNode.nextNode=null;
        }
        else{
            LNode afterNode=deleteNode.nextNode;
            deleteNode.data=afterNode.data;
            deleteNode.nextNode=afterNode.nextNode;
        }

    }
}
