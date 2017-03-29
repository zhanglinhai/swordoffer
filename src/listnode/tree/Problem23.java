package listnode.tree;

import listnode.function.ListNodeCommon;
import listnode.function.TreeCommon;
import listnode.model.tree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上到下遍历二叉树【宽度优先遍历算法】
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/26.
 * 从上到下打印出二叉树的每个结点，同一层按照从左到右的顺序打印
 *             8
 *           6  10
 *         5 7 9 11
 */
public class Problem23 {
     //打印顺序为8,6,10,5,7,9,11。辅助空间:queue
    public static void printTree(BinaryTreeNode root){
        LinkedList<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
        if(root==null){
            return;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTreeNode node=queue.pop();
            System.out.println(node.data);
            if(node.leftTreeNode!=null){
                queue.add(node.leftTreeNode);
            }
            if(node.rightTreeNode!=null){
                queue.add(node.rightTreeNode);
            }
        }
    }

    public static void main(String[] args){
        BinaryTreeNode root= TreeCommon.getTestTreeRoot();
        printTree(root);
    }

}
