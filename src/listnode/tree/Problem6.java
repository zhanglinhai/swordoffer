package listnode.tree;

import listnode.model.tree.BinaryTreeNode;

import java.util.Arrays;

/**
 * 重建二叉树
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/26.
 * 根据先序和后序遍历的结果，重建二叉树
 */
public class Problem6 {

    public static BinaryTreeNode constructCore(int[] preSort,int[] inSort){
        if(preSort==null||inSort==null){
            return null;
        }
        if(preSort.length!=inSort.length){
            System.out.println("非法输入");
            return null;
        }
        BinaryTreeNode root=new BinaryTreeNode();
        for(int i=0;i<inSort.length;i++){
            if(inSort[i]==preSort[0]){
                root.data=inSort[i];
                System.out.println(root.data);
                root.leftTreeNode=constructCore(Arrays.copyOfRange(preSort,1,i+1),Arrays.copyOfRange(inSort,0,i));
                root.rightTreeNode=constructCore(Arrays.copyOfRange(preSort,i+1,preSort.length),Arrays.copyOfRange(inSort,i+1,inSort.length));
            }
        }
        return root;
    }
    public static void main(String[] args){
        int[] preSort={1,2,4,7,3,5,6,8};
        int[] inSort={4,7,2,1,5,3,8,6};
        BinaryTreeNode root=constructCore(preSort,inSort);
    }

}
