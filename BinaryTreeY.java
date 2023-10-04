import java.util.*;

import javax.lang.model.element.Element;
class BinaryTreeY{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void inOrder(Node root) {
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
        
    }
    public static void postOrder(Node root) {
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

        
    }
    public static void levelOrder(Node root) {
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            } 
        }
        
    }

    public static int countOfNodes(Node root) {
        if(root==null)
        {
            return 0;
        }
        int leftNodes=countOfNodes(root.left);
        int rightNodes=countOfNodes(root.right);
        return leftNodes+rightNodes+1;
        
    }
    public static int sumOfNodes(Node root) {
        if(root==null)
        {
            return 0;
        }
        int leftNodes=sumOfNodes(root.left);
        int rightNodes=sumOfNodes(root.right);
        return leftNodes+rightNodes+root.data;
        
    }

    public static int height(Node root) {
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        int myHeight=Math.max(leftHeight,rightHeight)+1;
        return myHeight;
    }
    public static int diameter(Node root) {
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=height(root.left)+height(root.right)+1;
        return Math.max(diam3, Math.max(diam1,diam2));
        
    }
    static class TreeInfo{
        int height;
        int diameter;
        TreeInfo(int height,int diameter){
            this.height=height;
            this.diameter=diameter;
        }
    }
    public static TreeInfo diameter2(Node root) {
        if (root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);
        int myHeight=Math.max(left.height,right.height)+1;
        int diam1=left.diameter;
        int diam2=right.diameter;
        int diam3=left.height+right.height+1;

        int myDiameter=Math.max(Math.max(diam1,diam2),diam3);
        TreeInfo myInfo=new TreeInfo(myHeight, myDiameter);
        return myInfo;
        
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        // preOrder(root);
        // inOrder(root);
        // postOrder(root);
        // levelOrder(root);
        System.out.println(diameter2(root).diameter);
        // System.out.println(root.data);
    }
}