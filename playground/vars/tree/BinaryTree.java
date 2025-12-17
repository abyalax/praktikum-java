package vars.tree;

import node.TreeNode;

public class BinaryTree {
  TreeNode<Integer> root;

  public BinaryTree() {
    root = null;
  }

  public void insertNode(int value) {
    root = insert(root, value);
  }

  private TreeNode<Integer> insert(TreeNode<Integer> node, int value) {
    if (node == null) {
      return new TreeNode<Integer>(value);
    }
    if (value < node.getData()) {
      node.setLeft(insert(node.getLeft(), value));
    } else {
      node.setRight(insert(node.getRight(), value));
    }
    return node;
  }

  public void inOrder() {
    inOrder(root);
  }

  private void inOrder(TreeNode<Integer> node) {
    if (node != null) {
      inOrder(node.getLeft());
      System.out.print(node.getData() + " ");
      inOrder(node.getRight());
    }
  }

}
