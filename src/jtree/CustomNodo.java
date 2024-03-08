
package jtree;

import java.util.Date;
import javax.swing.tree.DefaultMutableTreeNode;

public class CustomNodo extends DefaultMutableTreeNode {

    private String type;
    private Date fechaCreacion;
    private double tamaño;

    public CustomNodo(String name, String type, Date fechaCreacion) {
        super(name);
        this.type = type;
        this.fechaCreacion = new Date();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Date getFecha() {
        return fechaCreacion;
    }
    
}
