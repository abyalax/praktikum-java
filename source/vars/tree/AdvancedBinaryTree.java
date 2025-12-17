package vars.tree;

import node.TreeNode;

public class AdvancedBinaryTree<T extends Comparable<? super T>> {
  private TreeNode<T> root;

  // Constructor
  public AdvancedBinaryTree() {
    root = null;
  }

  // In-order traversal
  public void inOrderTraversal() {
    inOrder(root);
  }

  private void inOrder(TreeNode<T> node) {
    if (node != null) {
      inOrder(node.getLeft());
      System.out.print(node.getValue() + " ");
      inOrder(node.getRight());
    }
  }

  // Pre-order traversal
  public void preOrderTraversal() {
    preOrder(root);
  }

  private void preOrder(TreeNode<T> node) {
    if (node != null) {
      System.out.println(node.getValue() + " ");
      preOrder(node.getLeft());
      preOrder(node.getRight());
    }
  }

  // Post-order traversal
  public void postOrderTraversal() {
    postOrder(root);
  }

  private void postOrder(TreeNode<T> node) {
    if (node != null) {
      postOrder(node.getLeft());
      postOrder(node.getRight());
      System.out.print(node.getValue() + " ");
    }
  }

  // Find the smallest value in the tree
  public T findSmallest() {
    if (root == null) {
      System.out.println("The tree is empty.");
      return null;
    }
    return findSmallest(root).getValue();
  }

  private TreeNode<T> findSmallest(TreeNode<T> node) {
    if (node.getLeft() == null) {
      return node;
    }
    return findSmallest(node.getLeft());
  }

  // Find the largest value in the tree
  public T findLargest() {
    if (root == null) {
      System.out.println("The tree is empty.");
      return null;
    }
    return findLargest(root).getValue();
  }

  private TreeNode<T> findLargest(TreeNode<T> node) {
    if (node.getRight() == null) {
      return node;
    }
    return findLargest(node.getRight());
  }

  // Insert a node into the tree
  public void insertNode(T value) {
    root = insert(root, value);
  }

  private TreeNode<T> insert(TreeNode<T> node, T value) {
    if (node == null) {
      return new TreeNode<>(value); // Use the correct constructor for TreeNode
    }
    int cmp = ((Comparable<? super T>) value).compareTo(node.getValue());
    if (cmp < 0) {
      node.setLeft(new TreeNode<>(value));
    } else if (cmp > 0) {
      node.setRight(new TreeNode<>(value));
    }
    return node;
  }

  // Find and delete a node with the given value
  public void delete(T value) {
    root = delete(root, value);
  }

  private TreeNode<T> delete(TreeNode<T> node, T value) {
    if (node == null) {
      System.out.println("The tree is empty.");
      return null;
    }

    int cmp = ((Comparable<? super T>) value).compareTo(node.getValue());

    if (cmp < 0) {
      node.setLeft(delete(node.getLeft(), value));
    } else if (cmp > 0) {
      node.setRight(delete(node.getRight(), value));
    } else {
      // Node with one child or no children
      if (node.getLeft() == null) {
        return node.getRight();
      } else if (node.getRight() == null) {
        return node.getLeft();
      }

      // Node with two children: find the in-order successor (smallest in the right
      // subtree)
      TreeNode<T> temp = findSmallest(node.getRight());
      node.setValue(temp.getValue()); // Replace value
      node.setRight(delete(node.getRight(), temp.getValue())); // Delete the in-order successor
    }
    return node;
  }

}