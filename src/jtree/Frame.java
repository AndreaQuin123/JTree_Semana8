package jtree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Frame extends javax.swing.JFrame {

    private DefaultTreeModel modelo;
    private DefaultMutableTreeNode NodoSeleccionado;
    private DefaultMutableTreeNode NodoCopiado;

    private File root;

    public Frame() {
        initComponents();

        setLocationRelativeTo(null);

        root = new File("root");

        if (!root.exists()) {
            root.mkdirs();
        }

        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(root.getName());
        buildTree(root, rootNode);

        modelo = new DefaultTreeModel(rootNode);
        Jtree.setModel(modelo);

        AñadirNodoArchivo.addActionListener(e -> AñadirNodoArchivoActionPerformed(e));
        AñadirNodoFolder.addActionListener(e -> AñadirNodoFolderActionPerformed(e));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AñadirNodoArchivo = new javax.swing.JButton();
        AñadirNodoFolder = new javax.swing.JButton();
        NombreNodo = new javax.swing.JTextField();
        OrganizarNodo = new javax.swing.JButton();
        BorrarNodoBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtree = new javax.swing.JTree();
        OrdenarNodos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CopiarNodo = new javax.swing.JButton();
        PegarNodo = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        ModificarNodoBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JTREE - DIRECTORY");

        AñadirNodoArchivo.setText("Añadir nuevo nodo (Archivo)");
        AñadirNodoArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirNodoArchivoActionPerformed(evt);
            }
        });

        AñadirNodoFolder.setText("Añadir nuevo nodo (Folder)");
        AñadirNodoFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirNodoFolderActionPerformed(evt);
            }
        });

        NombreNodo.setBackground(new java.awt.Color(255, 255, 255));
        NombreNodo.setForeground(new java.awt.Color(0, 0, 0));
        NombreNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreNodoActionPerformed(evt);
            }
        });

        OrganizarNodo.setText("Organizar Nodo");
        OrganizarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrganizarNodoActionPerformed(evt);
            }
        });

        BorrarNodoBTN.setText("Borrar nodo");
        BorrarNodoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarNodoBTNActionPerformed(evt);
            }
        });

        Jtree.setBackground(new java.awt.Color(255, 255, 255));
        Jtree.setForeground(new java.awt.Color(0, 0, 0));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("JTree");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("colors");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("purple");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("blue");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("red");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("food");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hello");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("hello");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("AAA");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        Jtree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Jtree.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JtreeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Jtree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtreeMouseClicked(evt);
            }
        });
        Jtree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                JtreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Jtree);

        OrdenarNodos.setBackground(new java.awt.Color(255, 255, 255));
        OrdenarNodos.setForeground(new java.awt.Color(0, 0, 0));
        OrdenarNodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Fecha", "Tipo", "Tamaño" }));
        OrdenarNodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdenarNodosActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ordenar por:");

        CopiarNodo.setText("Copiar nodo seleccionado");
        CopiarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiarNodoActionPerformed(evt);
            }
        });

        PegarNodo.setText("Pegar nodo seleccionado");
        PegarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PegarNodoActionPerformed(evt);
            }
        });

        jButton8.setText("Registrar Datos en nodo seleccionado");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        ModificarNodoBTN.setText("Cambiar nombre en nodo seleccionado");
        ModificarNodoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarNodoBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(AñadirNodoArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NombreNodo)
                        .addComponent(OrganizarNodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BorrarNodoBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(OrdenarNodos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CopiarNodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PegarNodo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ModificarNodoBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AñadirNodoFolder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(ModificarNodoBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AñadirNodoArchivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AñadirNodoFolder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BorrarNodoBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NombreNodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(OrganizarNodo)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(OrdenarNodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(CopiarNodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PegarNodo)
                        .addGap(40, 40, 40)
                        .addComponent(jButton8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buildTree(File file, DefaultMutableTreeNode parentNode) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File child : files) {
                    DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(child.getName());
                    parentNode.add(childNode);
                    buildTree(child, childNode);
                }
            }
        }
    }

    private File srchDirectory(String name, File root) {
        if (name.equals("root")) {
            return root;
        } else {
            if (root.listFiles() != null) {
                for (File parent : root.listFiles()) {
                    if (parent.isDirectory()) {
                        String ParentName = parent.getName();
                        if (ParentName.equals(name)) {
                            return parent;
                        } else {
                            File child = srchDirectory(name, parent);
                            if (child != null) {
                                return child;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private void AñadirNodoArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirNodoArchivoActionPerformed
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) Jtree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            String fileName = NombreNodo.getText();
            if (!fileName.isEmpty()) {
                File selectedFile = srchDirectory((String) selectedNode.getUserObject(), root);
                File newFile = new File(selectedFile, fileName + ".txt");
                try {
                    if (!newFile.exists()) {
                        if (newFile.createNewFile()) {
                            DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(newFile.getName());
                            selectedNode.add(newNode);
                            ((DefaultTreeModel) Jtree.getModel()).reload(selectedNode);
                        }
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Frame.this, "Error: No se pudo crear el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(Frame.this, "Error: Nombre de archivo inválido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_AñadirNodoArchivoActionPerformed

    private void CopiarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiarNodoActionPerformed
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) Jtree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            NodoCopiado = new DefaultMutableTreeNode(selectedNode.getUserObject());
            JOptionPane.showMessageDialog(Frame.this, "Nodo copiado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(Frame.this, "Seleccione un nodo para copiar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_CopiarNodoActionPerformed


    private void OrdenarNodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdenarNodosActionPerformed

        String itemSeleccionado = (String) OrdenarNodos.getSelectedItem();

        JTree funcion = new JTree();

        DefaultTreeModel treeModel = (DefaultTreeModel) Jtree.getModel();

        if (itemSeleccionado.equals("Nombre")) {
            funcion.sortAlfabeto(treeModel);
            Jtree.updateUI();
        }

        if (itemSeleccionado.equals("Fecha")) {
            funcion.sortFecha(treeModel);
            Jtree.updateUI();
        }

        if (itemSeleccionado.equals("Tipo")) {
            funcion.sortTipo(treeModel);
            Jtree.updateUI();
        }


    }//GEN-LAST:event_OrdenarNodosActionPerformed

    private void BorrarNodoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarNodoBTNActionPerformed
        if (NodoSeleccionado != null && modelo != null) {
            DefaultMutableTreeNode parent = (DefaultMutableTreeNode) NodoSeleccionado.getParent();
            if (parent != null) {
                File selectedFile = srchDirectory((String) NodoSeleccionado.getUserObject(), root);

                if (selectedFile != null) {
                    if (selectedFile.isDirectory()) {
                        deleteDirectory(selectedFile);
                    } else {
                        if (!selectedFile.delete()) {
                            JOptionPane.showMessageDialog(Frame.this, "Error: No se pudo borrar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                }

                modelo.removeNodeFromParent(NodoSeleccionado);
            }
        }
    }//GEN-LAST:event_BorrarNodoBTNActionPerformed
    private static void deleteDirectory(File directory) {
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    deleteDirectory(file);
                }
            }
        }
        if (!directory.delete()) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo borrar el directorio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void JtreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_JtreeValueChanged
        NodoSeleccionado = (DefaultMutableTreeNode) Jtree.getLastSelectedPathComponent();
        if (NodoSeleccionado != null) {
            this.NombreNodo.setText((String) NodoSeleccionado.getUserObject());
        }
    }//GEN-LAST:event_JtreeValueChanged

    private void ModificarNodoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarNodoBTNActionPerformed
        NodoSeleccionado = (DefaultMutableTreeNode) Jtree.getLastSelectedPathComponent();

        if (NodoSeleccionado != null) {
            String nuevoNombre = NombreNodo.getText();
            if (!nuevoNombre.isEmpty()) {
                DefaultMutableTreeNode parent = (DefaultMutableTreeNode) NodoSeleccionado.getParent();
                if (parent != null) {
                    File selectedFile = srchDirectory((String) NodoSeleccionado.getUserObject(), root);

                    if (selectedFile != null) {
                        File nuevoArchivo = new File(selectedFile.getParentFile(), nuevoNombre);
                        if (selectedFile.renameTo(nuevoArchivo)) {
                            NodoSeleccionado.setUserObject(nuevoNombre);
                            modelo.nodeChanged(NodoSeleccionado);
                        } else {
                            JOptionPane.showMessageDialog(Frame.this, "Error: No se pudo cambiar el nombre", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_ModificarNodoBTNActionPerformed

    private void NombreNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreNodoActionPerformed

    }//GEN-LAST:event_NombreNodoActionPerformed

    private void JtreeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JtreeAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_JtreeAncestorAdded

    private void JtreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtreeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JtreeMouseClicked

    private void AñadirNodoFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirNodoFolderActionPerformed
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) Jtree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            String folderName = NombreNodo.getText();
            if (!folderName.isEmpty()) {
                File selectedFile = srchDirectory((String) selectedNode.getUserObject(), root);
                File newFolder = new File(selectedFile, folderName);
                if (!newFolder.exists() && newFolder.mkdirs()) {
                    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(newFolder.getName());
                    selectedNode.add(newNode);
                    ((DefaultTreeModel) Jtree.getModel()).reload(selectedNode);
                }
            }
        }
    }//GEN-LAST:event_AñadirNodoFolderActionPerformed

    private void PegarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PegarNodoActionPerformed

        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) Jtree.getLastSelectedPathComponent();
        if (selectedNode != null && NodoCopiado != null) {
            selectedNode.add(NodoCopiado);
            ((DefaultTreeModel) Jtree.getModel()).reload(selectedNode);
            JOptionPane.showMessageDialog(Frame.this, "Nodo pegado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(Frame.this, "Seleccione un nodo y copie antes de pegar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_PegarNodoActionPerformed

    private void organize(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    String fileType = getFileType(file);
                    File destinationFolder = getDestinationFolder(folder, fileType);
                    File newFile = new File(destinationFolder, file.getName());

                    if (!destinationFolder.exists()) {
                        destinationFolder.mkdirs();
                    }

                    if (file.renameTo(newFile)) {
                        DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) NodoSeleccionado.getParent();
                        parentNode.remove(NodoSeleccionado);
                        ((DefaultTreeModel) Jtree.getModel()).reload(parentNode);
                    } else {
                        JOptionPane.showMessageDialog(Frame.this, "Error al organizar archivos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }
    }

    private String getFileType(File file) {
        return "Documentos";
    }

    private File getDestinationFolder(File folder, String fileType) {
        return new File(folder, fileType);
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) Jtree.getLastSelectedPathComponent();
        File selectedFile = srchDirectory((String) nodoSeleccionado.getUserObject(), root);
        System.out.println("llega a donde no es null");

        if (selectedFile != null) {
            System.out.println(selectedFile.isDirectory());

            if (!selectedFile.isDirectory()) {
                System.out.println("llega a donde no es directory");
                String inputData = JOptionPane.showInputDialog(Frame.this, "Ingrese datos de texto:");

                if (inputData != null) {
                    try (PrintWriter writer = new PrintWriter(selectedFile)) {
                        writer.write(inputData);
                        JOptionPane.showMessageDialog(Frame.this, "Datos registrados con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(Frame.this, "Error al registrar datos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(Frame.this, "Seleccione un archivo para registrar datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(Frame.this, "No se encontró el nodo seleccionado", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void OrganizarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrganizarNodoActionPerformed
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) Jtree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            File selectedFolder = srchDirectory((String) selectedNode.getUserObject(), root);
            if (selectedFolder != null && selectedFolder.isDirectory()) {
                organize(selectedFolder);
                ((DefaultTreeModel) Jtree.getModel()).reload(selectedNode);
                JOptionPane.showMessageDialog(Frame.this, "Archivos organizados con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(Frame.this, "Seleccione una carpeta para organizar archivos", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        }    }//GEN-LAST:event_OrganizarNodoActionPerformed

    private static void copyDirectory(File source, File destination) {
        if (!destination.exists()) {
            destination.mkdir();
        }

        File[] files = source.listFiles();
        if (files != null) {
            for (File file : files) {
                File newFile = new File(destination, file.getName());
                if (file.isDirectory()) {
                    copyDirectory(file, newFile);
                } else {
                    copyFile(file, newFile);
                }
            }
        }
    }

    private static void copyFile(File source, File destination) {
        try (FileInputStream fis = new FileInputStream(source); FileOutputStream fos = new FileOutputStream(destination)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AñadirNodoArchivo;
    private javax.swing.JButton AñadirNodoFolder;
    private javax.swing.JButton BorrarNodoBTN;
    private javax.swing.JButton CopiarNodo;
    private javax.swing.JTree Jtree;
    private javax.swing.JButton ModificarNodoBTN;
    private javax.swing.JTextField NombreNodo;
    private javax.swing.JComboBox<String> OrdenarNodos;
    private javax.swing.JButton OrganizarNodo;
    private javax.swing.JButton PegarNodo;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
