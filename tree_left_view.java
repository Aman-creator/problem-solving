import java.util.ArrayList;
import java.util.*;
class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
public class tree_left_view {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);

        ArrayList<Integer> arr = new ArrayList<>();
        arr = leftView(root);
    }
    
    public static ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> arr = new ArrayList<>();
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      //arr.add(root.data);
      while(q.size()!=0){
          int n = q.size();
          for(int i=0;i<n;i++){
              Node temp = q.remove();
              if(i== 0){
                  arr.add(temp.data);
              }
              if(temp.left!=null){
                    q.add(temp.left);
                    
              }
              if(temp.right!=null){
                    q.add(temp.right);
                    
              }
          }
      }
      return arr;
    }
}
