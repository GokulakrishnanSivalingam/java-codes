import java.util.*;
class BNode{
    int data;
    BNode left,right;
    public  BNode(int data)
        {
            this.data=data;
            left=right=null;
        }
        }
public class BST {
    BNode root;
    BNode insert(BNode root ,int key)
    {
        if(root==null) return new BNode(key);

            if(key<root.data) root.left=insert(root.left ,key);
            if(key>root.data) root.right=insert(root.right ,key);
return root;

    }
    public void display(BNode node)
    {        if (node == null) return;

        Queue<BNode>queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            BNode t=queue.remove();
            System.out.print(t.data+" ");
            if(t.left!=null)queue.add(t.left);
            if(t.right!=null)queue.add(t.right);

        }
    }
    public static void main(String[] args) {
        BST tree =new BST();
        tree.root=tree.insert(tree.root,50);
        tree.insert(tree.root,30);
        tree.insert(tree.root,70);

        tree.insert(tree.root,40);

        tree.insert(tree.root,20);

        tree.insert(tree.root,10);
      tree.display(tree.root);

    }
}
