package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {

    public static Node takeInput(boolean isRoot,int parentData,boolean isLeft){
        if(isRoot){
            System.out.print("Enter root data: ");
        }else {
            if(isLeft){
                System.out.print("Enter left of "+parentData+": ");
            }else{
                System.out.print("Enter right of "+parentData+": ");
            }
        }

        Scanner sc=new Scanner(System.in);
        int rootdata=sc.nextInt();
        if(rootdata==-1){
            return null;
        }
            Node root=new Node(rootdata);
            root.left=takeInput(false,rootdata,true);
            root.right=takeInput(false,rootdata,false);

        return root;
    }

    public static Node takeInputLevelWise(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter root data: ");
        int rootdata=sc.nextInt();
        if(rootdata==-1){
            return null;
        }
        Node root=new Node(rootdata);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node front=q.poll();
            System.out.print("Enter left of "+front.data+": ");
            int left=sc.nextInt();
            if(left!=-1){
                Node leftChild=new Node(left);
                front.left=leftChild;
                q.add(leftChild);
            }
            System.out.print("Enter right of "+front.data+": ");
            int right=sc.nextInt();
            if(right!=-1){
                Node rightChild=new Node(right);
                front.right=rightChild;
                q.add(rightChild);
            }

        }
        return root;
    }

    public static void printTree(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+": ");
        if(root.left!=null){
            System.out.print("l"+root.left.data+",");
        }
        if(root.right!=null){
            System.out.print("R"+root.right.data);
        }
        System.out.println();

        printTree(root.left);
        printTree(root.right);
    }

    public static void printTreeLevelWise(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node front=q.poll();
            System.out.print(front.data+": ");
            if(front.left!=null){
                System.out.print("l"+front.left.data+",");
                q.add(front.left);
            }
            if(front.right!=null){
                System.out.print("R"+front.right.data);
                q.add(front.right);
            }
            System.out.println();
        }
    }

    public static int noOFNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftcount=noOFNodes(root.left);
        int rightcount=noOFNodes(root.right);
        return 1+leftcount+rightcount;
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftsum=sumOfNodes(root.left);
        int rightsum=sumOfNodes(root.right);
        return root.data+leftsum+rightsum;
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static int largestNode(Node root){
        if(root==null){
            return -1;
        }
        int largestleft=largestNode(root.left);
        int largestright=largestNode(root.right);
        return Math.max(root.data,Math.max(largestleft,largestright));
    }

    public static int NodesGreaterThanX(Node root,int x){
        if(root==null){
            return 0;
        }
        int left=NodesGreaterThanX(root.left,x);
        int right=NodesGreaterThanX(root.right,x);
        if(root.data>x){
            return left+right+1;
        }
        return left+right;
    }

    public static int heightOfTree(Node root){
        if(root==null){
            return 0;
        }
        int left=heightOfTree(root.left);
        int right=heightOfTree(root.right);
        return Math.max(left,right)+1;
    }

    public static int NoOfLeafNodes(Node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return NoOfLeafNodes(root.left)+NoOfLeafNodes(root.right);
    }

    public static void printNodesAtDepthK(Node root,int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.print(root.data+" ");
            return;
        }
        printNodesAtDepthK(root.left,k-1);
        printNodesAtDepthK(root.right,k-1);
    }

    public static void replaceNodesWithDepth(Node root,int level){
        if(root==null){
            return;
        }
        root.data=level;
        replaceNodesWithDepth(root.left,level+1);
        replaceNodesWithDepth(root.right,level+1);
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean isNodePresent(Node root,int n){
        if(root==null){
            return false;
        }
        if(root.data==n){
            return true;
        }
        return (isNodePresent(root.left,n) || isNodePresent(root.right,n));
    }

    public static void NodesWithoutSiblings(Node root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right!=null){
            System.out.print(root.right.data+" ");
        }else if(root.left!=null && root.right==null){
            System.out.print(root.left.data+" ");
        }
        NodesWithoutSiblings(root.left);
        NodesWithoutSiblings(root.right);
    }

    public static Node removeLeafNode(Node root){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return null;
        }
        root.left= removeLeafNode(root.left);
        root.right= removeLeafNode(root.right);
        return root;
    }

    public static Node mirrorBinaryTree(Node root){
        if(root==null){
            return null;
        }
        if(root.left==null && root.right==null){
            return root;
        }
        Node rootright=root.right;
        root.right= mirrorBinaryTree(root.left);
        root.left= mirrorBinaryTree(rootright);
        return root;
    }

    public static boolean isBalanced(Node root){
        if(root==null){
            return true;
        }
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        if(Math.abs(leftHeight-rightHeight) > 1){
            return false;
        }
        boolean isLeftBal=isBalanced(root.left);
        boolean isRightBal=isBalanced(root.right);
        return isLeftBal && isRightBal;
    }

    public static int diameterOfTree(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        int dist=leftHeight+rightHeight+1;
        int leftD=diameterOfTree(root.left);
        int rightD=diameterOfTree(root.right);
        return Math.max(leftD,Math.max(dist,rightD));
    }

    public static Node buildTreeFromInPre(int pre[],int in[]){
        return buildTreeFromInPreHelper(pre,in,0,pre.length-1,0,in.length-1);
    }

    private static Node buildTreeFromInPreHelper(int[] pre, int[] in, int sipre, int eipre, int siin, int eiin) {
        if(sipre>eipre || siin>eiin){
            return null;
        }
        int rootdata=pre[sipre];
        Node root=new Node(rootdata);
        int rootIndex=-1;
        for(int i=siin;i<=eiin;i++){
            if(in[i]==rootdata){
                rootIndex=i;
                break;
            }
        }

        int sipreleft=sipre+1;

        int siinleft=siin;
        int eiinleft=rootIndex-1;

        int eipreright=eipre;
        int siinright=rootIndex+1;
        int eiinright=eiin;
        int inleftlen=eiinleft-siinleft+1;
        int eipreleft=sipreleft+inleftlen-1;
        int sipreright=eipreleft+1;

        Node leftsubtree= buildTreeFromInPreHelper(pre,in,sipreleft,eipreleft,siinleft,eiinleft);
        Node rightsubtree= buildTreeFromInPreHelper(pre,in,sipreright,eipreright,siinright,eiinright);
        root.left=leftsubtree;
        root.right=rightsubtree;
        return root;
    }

    public static void main(String[] args) {
//        Node root=takeInput(true,0,false);
        int pre[]={1,2 ,4, 5, 3,6 ,7};
        int in[]={4 ,2 ,5 ,1 ,6 ,3 ,7};
//        Node root=takeInputLevelWise();
        Node root=buildTreeFromInPre(pre,in);
        printTreeLevelWise(root);
//         Node newroot=mirrorBinaryTree(root);
//        System.out.println(diameterOfTree(root));
//         printTreeLevelWise(newroot);
//        printTreeLevelWise(root);
//        postOrder(root);
//        replaceNodesWithDepth(root,0);
//        inorder(root);
//        NodesWithoutSiblings(root);
//        System.out.println(isNodePresent(root,1));
//        printNodesAtDepthK(root,2);

    }
}
