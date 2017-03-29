package listnode;

import listnode.model.tree.BinaryTreeNode;

/**
 *二叉搜索树与双向链表，输入一棵二叉搜索树，将二叉搜索树转换成一个排序的双向链表
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/26.
 */
public class Problem27 {

    /**
     * 二叉搜索树转换为双向链表
     * @param root
     * @return
     */
    public BinaryTreeNode convert(BinaryTreeNode root){
        BinaryTreeNode pLastNodeInList=null;
        converNode(root,pLastNodeInList);
        //返回的是尾节点，我们需要头结点
        while(pLastNodeInList!=null && pLastNodeInList.leftTreeNode!=null){
            pLastNodeInList=pLastNodeInList.leftTreeNode;
        }
        System.out.println(pLastNodeInList.data);
        return pLastNodeInList;
    }
    /**
     * @param root 当前节点
     * @param pLastNodeInList 双向链表的最后一个节点
     */
    public void converNode(BinaryTreeNode root,BinaryTreeNode pLastNodeInList){
        if(root==null){
            return;
        }
        BinaryTreeNode current=root;
        if(current.leftTreeNode!=null){
            converNode(current.leftTreeNode,pLastNodeInList);
        }
        current.leftTreeNode=pLastNodeInList;//左子树第一个节点为链表最后一个节点: 左

        if(pLastNodeInList!=null){
            pLastNodeInList.rightTreeNode=current;//中间节点连接：中
        }
        pLastNodeInList=current;//更新最后一个节点
        if(current.rightTreeNode!=null){
            converNode(current.rightTreeNode,pLastNodeInList);//右
        }






    }
}
