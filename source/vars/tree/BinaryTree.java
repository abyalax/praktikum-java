package vars.tree;

import node.TreeNode;

public class BinaryTree {
  TreeNode<Integer> root;

  public BinaryTree() {
    root = null;
  }

  // Insert a node into the tree
  public void insertNode(int value) {
    root = insert(root, value);
  }

  private TreeNode<Integer> insert(TreeNode<Integer> node, int value) {
    if (node == null) {
      return new TreeNode<Integer>(value);
    }
    if (value < node.getValue()) {
      node.setLeft(new TreeNode<>(value));
    } else if (value > node.getValue()) {
      node.setRight(new TreeNode<>(value));
    }
    return node;
  }
}