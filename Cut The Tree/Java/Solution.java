import java.util.*;
 
 public class Solution {
    static class TreeNode{
         int value;
         int number;
         ArrayList<TreeNode> children;
         public TreeNode(int value,int number){
             this.value = value;
             this.number = number;
             children = new ArrayList<TreeNode>();
         }
     }
     
     private static int dfs(TreeNode root,boolean[] visited){
         visited[root.number]=true;
         for(TreeNode child:root.children){
             if(!visited[child.number]){
                 root.value += dfs(child, visited);
             }
         }
         return root.value;
     }
     
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         TreeNode[] treeNodes = new TreeNode[n];
         int W  = 0;
         
         for(int i = 0;i < n;i++)
         {
             int value = in.nextInt();
             treeNodes[i]=new TreeNode(value,i);
             W += value;
         }
         
         for(int i = 0;i < n-1;i++){
             int a = in.nextInt();
             int b = in.nextInt();
             treeNodes[a-1].children.add(treeNodes[b-1]);
             treeNodes[b-1].children.add(treeNodes[a-1]);
         }
         
         boolean[] visited = new boolean[n];
         
         dfs(treeNodes[0], visited);
         int miniDif = Integer.MAX_VALUE;
         
         for(TreeNode t:treeNodes){
             miniDif = Math.min(miniDif, Math.abs(W-2*t.value));
         }
         
         System.out.println(miniDif);
         
         
         
     }
 }