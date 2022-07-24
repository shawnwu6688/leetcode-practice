package ninetyonedaylearnalgorithm.intersectionoftwolinkedlists;

/**
 * @ProjectName: leetcode-practice
 * @Package: ninetyonedaylearnalgorithm.intersectionoftwolinkedlists
 * @ClassName: Solution
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/24 19:01
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: 160. 相交链表 160. Intersection of Two Linked Lists
 * 1. 若相交必在短链表处
 * 2. 同步A链(长)和B链(短)遍历位置至B链head处,在同时向后遍历查找相交点
 * 同步遍历方法
 * a + b = b + a;
 * 同时在A head处和B head处遍历长度 a+b,最终会在b head处同步遍历位置
 *
 **/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //if (headA == null || headB == null) return null;
        //ListNode countHeadA = headA;
        //ListNode countHeadB = headB;
        //int count = 0;
        ////常规思路处理:
        ////计算 a+b
        //while (countHeadA.next != null){
        //    count++;
        //    countHeadA = countHeadA.next;
        //}
        //while (countHeadB.next != null){
        //    count++;
        //    countHeadB = countHeadB.next;
        //}
        //
        //
        //ListNode pA = headA;
        //ListNode pB = headB;
        //while (count != 0){
        //    //同步到B head位置
        //    pA = pA == null ? headB: pA.next;
        //    pB = pB == null ? headA: pB.next;
        //    count--;
        //}
        ////如果有相交点会在pA = pB处相交,如果没有,则会在链尾相交
        //while (pA != pB){
        //    pA = pA.next;
        //    pB = pB.next;
        //}
        //标准思路处理
        if (headA == null || headB == null) return null;
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}