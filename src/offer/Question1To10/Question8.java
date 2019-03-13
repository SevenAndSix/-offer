package offer.Question1To10;

import offer.tree.ParentNodeTree;

public class Question8 {
    public ParentNodeTree findNextNode(ParentNodeTree flagNode){
        ParentNodeTree resultNode=null;

        //有右子树的情况
        if(flagNode.getRightNode()!=null){
            resultNode=flagNode.getRightNode();
            while(resultNode.getLeftNode()!=null){
                resultNode=resultNode.getLeftNode();
            }
        }

        //没有右子树的情况
        if(flagNode.getRightNode()==null){
            //排除该节点一个父节点没有的情况
            if(flagNode.getParentNode()==null){
                return null;
            }
            else{
                resultNode=flagNode.getParentNode();
            }

            //该节点是其父节点的右子节点时
            if(resultNode.getLeftNode()!=flagNode){
                if(resultNode.getParentNode()!=null){
                    ParentNodeTree tempNode=resultNode.getParentNode();
                    while(tempNode.getLeftNode()!=resultNode&&tempNode.getParentNode()!=null){
                        resultNode=tempNode;
                        tempNode=tempNode.getParentNode();
                    }
                    if(tempNode.getParentNode()==null&&tempNode.getLeftNode()!=resultNode){   //没找到可行解
                        resultNode=null;
                    }
                    else{
                        resultNode=tempNode;
                    }
                }
                else{ //该节点的父节点没有父节点时
                    return null;
                }
            }
        }

        return resultNode;
    }
}

/*
*      Question8测试代码
*       Question8 question8=new Question8();
        ParentNodeTree aTree=new ParentNodeTree('a');
        ParentNodeTree bTree=new ParentNodeTree('b');
        ParentNodeTree cTree=new ParentNodeTree('c');
        ParentNodeTree dTree=new ParentNodeTree('d');
        ParentNodeTree eTree=new ParentNodeTree('e');
        ParentNodeTree fTree=new ParentNodeTree('f');
        ParentNodeTree gTree=new ParentNodeTree('g');
        ParentNodeTree hTree=new ParentNodeTree('h');
        ParentNodeTree iTree=new ParentNodeTree('i');

        aTree.setParentNode(null);
        aTree.setLeftNode(bTree);
        aTree.setRightNode(cTree);

        bTree.setParentNode(aTree);
        bTree.setLeftNode(dTree);
        bTree.setRightNode(eTree);

        cTree.setParentNode(aTree);
        cTree.setLeftNode(fTree);
        cTree.setRightNode(gTree);

        eTree.setParentNode(bTree);
        eTree.setLeftNode(hTree);
        eTree.setRightNode(iTree);

        dTree.setParentNode(bTree);
        dTree.setLeftNode(null);
        dTree.setRightNode(null);

        hTree.setParentNode(eTree);
        hTree.setLeftNode(null);
        hTree.setRightNode(null);

        iTree.setParentNode(eTree);
        iTree.setLeftNode(null);
        iTree.setRightNode(null);

        fTree.setParentNode(cTree);
        fTree.setLeftNode(null);
        fTree.setRightNode(null);

        gTree.setParentNode(cTree);
        gTree.setLeftNode(null);
        gTree.setRightNode(null);

        ParentNodeTree resultNode=question8.findNextNode(gTree);
* */
