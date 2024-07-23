/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//hiii
class Solution {
    Integer result;
    public int countPairs(TreeNode root, int distance) {
        result=0;
        countPairsHelper(root,distance);
        return result;
    }
    private int[] countPairsHelper(TreeNode root,int distance){
        int[] arr = new int[10];
        if(root==null){
            return arr;
        }
        else if(root.left==null && root.right==null){
            arr[0]=1;
            return arr;
        }
        int[] leftArr = countPairsHelper(root.left,distance);
        int[] rightArr = countPairsHelper(root.right,distance);
        for(int loop1=0;loop1<10;loop1++){
            for(int loop2=0;loop2<10;loop2++){
                if(loop1+loop2+2<=distance){
                    result += (leftArr[loop1]*rightArr[loop2]);
                }
            }
        }
        for(int loop=0;loop<9;loop++){
            arr[loop+1]= leftArr[loop]+rightArr[loop];
        }
        return arr;
    }
}
