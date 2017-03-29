package listnode.model;

/**
 * 链表节点类
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/25.
 */
public class ListNode {

    public int data;
    public ListNode next;

    public ListNode() {
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public boolean equals(ListNode obj) {
        if(obj.next==this.next && this.data==obj.data){
            return true;
        }else{
            return false;
        }
    }


}
