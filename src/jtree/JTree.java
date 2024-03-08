
package jtree;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;

public class JTree {

    private boolean order;
    
   
    public boolean isAlphabeticalOrder() {
        return order;
    }

    public void setAlphabeticalOrder(boolean order) {
        this.order = order;
    }

    public void sortAlfabeto(DefaultTreeModel treeModel) {
        DefaultMutableTreeNode rootNode = (DefaultMutableTreeNode) treeModel.getRoot();

        if (rootNode == null) {
            return;
        }

        Enumeration<TreeNode> enumeration = rootNode.children();
        List<TreeNode> childrenList = Collections.list(enumeration);

        Object[] childrenArray = childrenList.toArray();

        Arrays.sort(childrenArray, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (order) {
                    return ((DefaultMutableTreeNode) o1).getUserObject().toString().compareTo(
                            ((DefaultMutableTreeNode) o2).getUserObject().toString());
                } else {
                    return ((DefaultMutableTreeNode) o2).getUserObject().toString().compareTo(
                            ((DefaultMutableTreeNode) o1).getUserObject().toString());
                }
            }
        });

        rootNode.removeAllChildren();

        for (Object child : childrenArray) {
            rootNode.add((DefaultMutableTreeNode) child);
        }

        treeModel.nodeStructureChanged(rootNode);
    }

    public void sortFecha(DefaultTreeModel treeModel) {
        /*
        wip
         */

    }

    public void sortTipo(DefaultTreeModel treeModel) {
    }
}
