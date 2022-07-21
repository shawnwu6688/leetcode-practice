package ninetyonedaylearnalgorithm.rotatelist;

import problems.mergetwosortedlists.ListNode;

/**
 * @ProjectName: leetcode-practice
 * @Package: ninetyonedaylearnalgorithm.rotatelist
 * @ClassName: Solution
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/21 23:18
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class Solution {
    /**
     * 循环链表
     * 链表尾部向前数k个元素作为头，原来的头接到原来的尾上
     * 如果需要旋转必须将单向链表收尾相连成循环链表，便于断开时形成新的链表
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int count = 1; // 同于统计总节点数
        ListNode tempHead =head;
        while (tempHead.next != null){
            count++;//初始化总节点数
            tempHead = tempHead.next;//初始化链表尾
        }
        k %= count;//取模

        if (k == 0) return head;
        //以上都不满足开始旋转
        tempHead.next = head; //链表收尾相连
        for (int i = 0; i < count - k; i++) {
            tempHead = tempHead.next; //从链表尾开始向后数count - k -1个也就是向前数k个就是新的节点
        }

        ListNode newHead = tempHead.next;
        tempHead.next = null;
        return newHead;
    }
}
