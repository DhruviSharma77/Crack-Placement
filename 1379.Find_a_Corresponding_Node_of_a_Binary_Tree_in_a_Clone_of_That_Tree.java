class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        int l=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(cloned);
        q.offer(null);
        while(q.size()>1)
        {
            TreeNode t=q.poll();
            if(t==null)
            {
                l++;
                q.offer(null);
                continue;
            }
            if(t.val==target.val)
            {
                return  t; 
            }
            if(t.left!=null)
                q.offer(t.left);
            if(t.right!=null)
                q.offer(t.right);
        }
        return null;
    }
}
