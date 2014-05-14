package facturacion;

import facturacion.entities.FactDetalle;
import facturacion.entities.Producto;
import java.awt.Frame;

public class PanelDetalle extends javax.swing.JPanel {

    private FactDetalle factDetalle;
    private Producto producto;

    public Producto getProducto() {
        return producto;
    }
        
    /**
     * Creates new form PanelDetalle
     */
    public PanelDetalle() {
        initComponents();
    }

    public FactDetalle getFactDetalle() {
        return factDetalle;
    }

    public void setFactDetalle(FactDetalle factDetalle) {
        this.factDetalle = factDetalle;
    }    
    
    public void showData() {
        producto = factDetalle.getProductoId();
        showProducto();
        jTextFieldPrecioUnit.setText(String.valueOf(factDetalle.getPrecioUnit()));
        jTextFieldCantidad.setText(String.valueOf(factDetalle.getCantidad()));
        jTextFieldIVA.setText(String.valueOf(factDetalle.getIva()));
    }
    
    public void showProducto() {
        if(producto != null) {
            jTextFieldProductoId.setText(producto.getCodigo() + " - " + producto.getNombre());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPrecioUnit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIVA = new javax.swing.JTextField();
        jTextFieldProductoId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Producto:");

        jLabel2.setText("Cantidad:");

        jTextFieldCantidad.setColumns(5);

        jLabel3.setText("Precio Unitario:");

        jTextFieldPrecioUnit.setColumns(10);

        jLabel4.setText("IVA:");

        jTextFieldIVA.setColumns(5);

        jTextFieldProductoId.setEditable(false);
        jTextFieldProductoId.setColumns(5);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPrecioUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldProductoId, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldProductoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPrecioUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Tomar una referencia al JFrame que contiene este panel
        Frame frameParent = Frame.getFrames()[0];
        DialogListaProductos dialogListaProductos = new DialogListaProductos(frameParent, true);
        dialogListaProductos.setVisible(true);
        //Obtener el producto que se ha seleccionado en la ventana de diálogo
        producto = dialogListaProductos.getProductoSelec();
        showProducto();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldIVA;
    private javax.swing.JTextField jTextFieldPrecioUnit;
    private javax.swing.JTextField jTextFieldProductoId;
    // End of variables declaration//GEN-END:variables
}
