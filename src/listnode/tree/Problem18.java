package listnode.tree;

import listnode.model.tree.BinaryTreeNode;

/**
 * 树的子结构
 * 输入两棵二叉树A和B，判断B是不是A的子结构
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/26.
 *  *          8            10
 *           6  10         9 11
 *         5 7 9 11
 */
public class Problem18 {

    public static boolean hasSubTree(BinaryTreeNode root,BinaryTreeNode subRoot){
        boolean result=false;
        if(root!=null && subRoot!=null){
            if(root.data==subRoot.data){//根结点相等，递归判断两个结点的左右结点
                result=doesHasSubTree(root, subRoot);
            }
            if(!result){//根结点不相等，判断两个结点的左结点
                result=hasSubTree(root.leftTreeNode,subRoot);
            }
            if(!result){//根结点不相等，判断两个结点的右结点
                result=hasSubTree(root.rightTreeNode,subRoot);
            }
        }
        return result;
    }

    public static boolean doesHasSubTree(BinaryTreeNode root,BinaryTreeNode subRoot){
        if(subRoot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.data!=subRoot.data){
            return false;
        }
        return doesHasSubTree(root.leftTreeNode,subRoot.leftTreeNode)&&doesHasSubTree(root.rightTreeNode,subRoot.rightTreeNode);
    }

}
