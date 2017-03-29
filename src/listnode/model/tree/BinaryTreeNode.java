package listnode.model.tree;

/**
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/26.
 */
public class BinaryTreeNode {
    public int data;
    public BinaryTreeNode leftTreeNode;
    public BinaryTreeNode rightTreeNode;

    public BinaryTreeNode() {
    }

    public BinaryTreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryTreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(BinaryTreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public BinaryTreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(BinaryTreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }
}
