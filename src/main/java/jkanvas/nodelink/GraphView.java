package jkanvas.nodelink;

/**
 * A view on an undirected graph.
 * 
 * @author Joschi <josua.krause@googlemail.com>
 */
public interface GraphView {

  /**
   * Getter.
   * 
   * @return The number of nodes.
   */
  int nodeCount();

  /**
   * Whether two nodes are connected. The order of the nodes is unimportant.
   * 
   * @param a One node.
   * @param b Another node.
   * @return Whether both nodes are connected via an edge.
   */
  boolean areConnected(int a, int b);

}