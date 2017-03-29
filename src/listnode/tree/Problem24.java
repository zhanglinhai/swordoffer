package listnode.tree;

import java.util.Arrays;

/**
 * 二叉树的后序遍历排列
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/26.
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。是则返回true，否则返回false
 * 8
 * 6    10
 * 5 7  9 11
 * {5.7.6.9.11.10.8}
 */
public class Problem24 {
    public static boolean verifySequenceOfBST(int sequence[]) {
        if (sequence == null || sequence.length <= 0) {
            return false;
        }
        int length = sequence.length;
        int root = sequence[length - 1];//根结点
        int i = 0;//小于根结点的元素下标
        for (; i < length - 1; i++) {
            if (sequence[i] > root) {
                break;
            }
        }
        int j = i;
        for (; j < length - 1; j++) {
            if (sequence[j] < root) {
                return false;
            }
        }
        //以i为分界线，i-1为左子树最后一个结点，i为右子树第一个结点
        boolean left = true;
        if (i > 0) {
            left = verifySequenceOfBST(Arrays.copyOfRange(sequence, 0, i));
        }
        boolean right = true;
        if (i < length - 1) {
            right = verifySequenceOfBST(Arrays.copyOfRange(sequence, i, length - 1));
        }
        return (left && right);
    }

    public static void main(String[] args){
        int[] arrays={5,7,8,9,11,10,8};
        System.out.println(verifySequenceOfBST(arrays));
    }
}
