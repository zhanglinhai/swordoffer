package array;

/**
 * Swordoffer demo practice
 * Created by zhanglinhai on 2017/3/30.
 *
 * 题目：输入一个整型数组，数组里有正数也有负数。数组中一个或连续的多个整数组成一个子数组。
 * 求所有子数组的和的最大值。要求时间复杂度为O(n)。
 * 例如输入的数组为{1，-2,3,10，-4,7,2，-5}，和最大的子数组为{3,10，-4,7,2}
 */
public class Problem31 {
    public static void main(String[] args) {
        Problem31 p=new Problem31();
        int[] array={1,-2,3,10,-4,7,2,-5};
        System.out.println(p.findGreatestSubArray(array));
    }
    public int findGreatestSubArray(int[] array){
        if(array==null){
            return 0;
        }
        int currentSum=0;
        int greatSum=0;
        for (int i = 0; i <array.length ; i++) {
            if(currentSum<=0){
                currentSum=array[i];
            }else{
                currentSum+=array[i];
            }
            if(currentSum>greatSum){
                greatSum=currentSum;
            }
        }
        return greatSum;
    }
}
