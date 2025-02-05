import java.util.*;
 class BFSNode
{
    int data;
    BFSNode left,right;
    public  BFSNode(int data)
    {
        this.data=data;
        left=right=null;
    }
}
public class bfs {
    BFSNode root;
    public void BFS(BFSNode node)
    {
        Queue<BFSNode> avs=new LinkedList<>();
        avs.add(node);
        while(!avs.isEmpty()) {
            BFSNode t = avs.poll();
            System.out.print(t.data + " ");
            if (t.left != null) avs.add(t.left);
            if (t.right != null) avs.add(t.right);
        }

    }
    public static void main(String[] args) {
        bfs tree=new bfs();
        tree.root=new BFSNode(23);
        tree.root.left=new BFSNode(290);
        tree.root.right=new BFSNode(20);
        tree.BFS(tree.root);




    }
}
