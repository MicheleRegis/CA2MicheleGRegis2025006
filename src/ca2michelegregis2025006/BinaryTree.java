/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca2michelegregis2025006;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Binary Tree implementation for Employee Hierarchy
 * Uses level-order (breadth-first) insertion
 * 
 * This binary tree represents organizational structure in the department store.
 * Level-order insertion ensures balanced tree growth by filling each level
 * from left to right before moving to the next level.
 */
public class BinaryTree {
    
    /**
     * Inner class representing a node in the binary tree
     * Each node stores an Employee and references to left and right children
     */
    private class TreeNode {
        Employee employee;
        TreeNode left;
        TreeNode right;
        
        /**
         * Constructor for TreeNode
         * @param employee Employee data to store in this node
         */
        TreeNode(Employee employee) {
            this.employee = employee;
            this.left = null;
            this.right = null;
        }
    }
    
    private TreeNode root;  // Root of the binary tree
    private int nodeCount;  // Total number of nodes in tree
    
    /**
     * Constructor initializes empty tree
     */
    public BinaryTree() {
        this.root = null;
        this.nodeCount = 0;
    }
    
    /**
     * Inserts employee into tree using level-order (breadth-first) insertion
     * This ensures tree is filled level by level, left to right
     * 
     * @param employee Employee to insert
     */
    public void insertLevelOrder(Employee employee) {
        TreeNode newNode = new TreeNode(employee);
        
        // If tree is empty, new node becomes root
        if (root == null) {
            root = newNode;
            nodeCount++;
            return;
        }
        
        // Use queue for level-order traversal to find insertion point
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            
            // Check if left child is empty
            if (current.left == null) {
                current.left = newNode;
                nodeCount++;
                return;
            } else {
                queue.offer(current.left);
            }
            
            // Check if right child is empty
            if (current.right == null) {
                current.right = newNode;
                nodeCount++;
                return;
            } else {
                queue.offer(current.right);
            }
        }
    }
    
    /**
     * Displays tree in level-order (breadth-first) traversal
     * Shows organizational hierarchy level by level
     */
    public void displayLevelOrder() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        int level = 1;
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            System.out.println("\nLevel " + level + ":");
            System.out.println("--------");
            
            // Process all nodes at current level
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                
                // Display employee information
                System.out.printf("%d. %s | %s | %s%n", 
                    (i + 1),
                    current.employee.getName(),
                    current.employee.getManagerType(),
                    current.employee.getDepartment());
                
                // Add children to queue for next level
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            
            level++;
        }
    }
    
    /**
     * Calculates and returns height of tree
     * Height is the number of edges on longest path from root to leaf
     * @return Height of tree
     */
    public int getHeight() {
        return calculateHeight(root);
    }
    
    /**
     * Recursive helper method to calculate tree height
     * @param node Current node being examined
     * @return Height of subtree rooted at node
     */
    private int calculateHeight(TreeNode node) {
        // Base case: empty tree has height 0
        if (node == null) {
            return 0;
        }
        
        // Recursively calculate height of left and right subtrees
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);
        
        // Height is maximum of subtree heights plus 1 for current node
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    /**
     * Gets total number of nodes in tree
     * @return Node count
     */
    public int getNodeCount() {
        return nodeCount;
    }
    
    /**
     * Checks if tree is empty
     * @return true if tree has no nodes
     */
    public boolean isEmpty() {
        return root == null;
    }
    
    /**
     * Displays tree structure in a visual format (optional enhancement)
     * Shows parent-child relationships more clearly
     */
    public void displayTreeStructure() {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }
        
        System.out.println("\nTree Structure (Indented):");
        System.out.println("==========================");
        displayTreeStructureRecursive(root, "", true);
    }
    
    /**
     * Recursive helper for visual tree display
     * @param node Current node
     * @param prefix Indentation prefix
     * @param isTail Whether this is the last child
     */
    private void displayTreeStructureRecursive(TreeNode node, String prefix, boolean isTail) {
        if (node == null) {
            return;
        }
        
        System.out.println(prefix + (isTail ? "└── " : "├── ") + 
                         node.employee.getName() + " (" + 
                         node.employee.getManagerType() + ")");
        
        // Recursively display children
        if (node.left != null || node.right != null) {
            if (node.right != null) {
                displayTreeStructureRecursive(node.right, 
                    prefix + (isTail ? "    " : "│   "), false);
            }
            if (node.left != null) {
                displayTreeStructureRecursive(node.left, 
                    prefix + (isTail ? "    " : "│   "), true);
            }
        }
    }
    
    /**
     * Clears the entire tree
     * Resets root to null and node count to 0
     */
    public void clear() {
        root = null;
        nodeCount = 0;
    }
}

