package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees_0 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // time complexity => O(n)
    public static void printPreOrderTraversalTree(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printPreOrderTraversalTree(root.left);
        printPreOrderTraversalTree(root.right);
    }

    // time complexity => O(n)
    public static void printPostOrderTraversalTree(Node root) {
        if (root == null) {
            return;
        }
        printPostOrderTraversalTree(root.left);
        printPostOrderTraversalTree(root.right);
        System.out.print(root.data + " ");
    }

    // time complexity => O(n)
    public static void printInOrderTraversalTree(Node root) {
        if (root == null) {
            return;
        }
        printInOrderTraversalTree(root.left);
        System.out.print(root.data + " ");
        printInOrderTraversalTree(root.right);
    }

    // time complexity => O(n)
    public static void printLevelOrderTraversalTree(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            if (currentNode == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
    }

    // time complexity => O(n)
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countOfNodes(root.left);
        int rightCount = countOfNodes(root.right);
        int totalCount = leftCount + rightCount + 1;
        return totalCount;
    }

    // time complexity => O(n)
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        int totalSum = leftSum + rightSum + root.data;
        return totalSum;
    }

    // time complexity => O(n)
    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int totalHeight = Math.max(leftHeight, rightHeight) + 1;
        // if (leftHeight >= rightHeight) {
        // totalHeight = leftHeight + 1;
        // } else {
        // totalHeight = rightHeight + 1;
        // }
        return totalHeight;
    }

    // time complexity => O(n^2)
    public static int diameterOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int diameter1 = diameterOfTree(root.left);
        int diameter2 = diameterOfTree(root.right);
        int diameter3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;
        return Math.max(diameter3, Math.max(diameter1, diameter2));
    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    // time complexity => O(n)
    public static TreeInfo diameterOfTree2(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameterOfTree2(root.left);
        TreeInfo right = diameterOfTree2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;
        int myDiam = Math.max(diam3, Math.max(diam1, diam2));

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }

    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    public static boolean isSubTree(Node root, Node subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

    public static void main(String[] args) {
        int[] nodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // printPreOrderTraversalTree(root);
        // System.out.println();
        // printInOrderTraversalTree(root);
        // System.out.println();
        // printPostOrderTraversalTree(root);
        // System.out.println();
        // printLevelOrderTraversalTree(root);
        // System.out.println();
        // System.out.println("Count of nodes is : " + countOfNodes(root));
        // System.out.println("Sum of nodes is : " + sumOfNodes(root));
        // System.out.println("Height of tree is : " + heightOfTree(root));
        // System.out.println("Diameter of tree is : " + diameterOfTree(root));
        // System.out.println("Diameter 2 of tree is : " + diameterOfTree2(root).diam);
        int[] nodes2 = { 2, 4, -1, -1, 5, -1, -1 };
        BinaryTree.idx = -1;
        BinaryTree tree2 = new BinaryTree();
        Node root2 = tree2.buildTree(nodes2);
        System.out.println(isSubTree(root, root2));
    }
}
