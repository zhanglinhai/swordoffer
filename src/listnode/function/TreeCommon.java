package listnode.function;

import listnode.model.tree.BinaryTreeNode;

/**
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/29.
 *           7
 *        4    10
 *       3 5
 */
public class TreeCommon {

    public static BinaryTreeNode getTestTreeRoot(){
        BinaryTreeNode root=new BinaryTreeNode(7);
        root.leftTreeNode=new BinaryTreeNode(4);
        root.rightTreeNode=new BinaryTreeNode(10);
        root.leftTreeNode.leftTreeNode=new BinaryTreeNode(3);
        root.leftTreeNode.rightTreeNode=new BinaryTreeNode(5);
        return root;
    }
}
