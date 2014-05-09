package facturacion.renderer;

import facturacion.entities.Producto;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ProductoRenderer extends DefaultTableCellRenderer {

    @Override
    protected void setValue(Object value) {
        String nombreProducto = "";
        //Comprobar que no es un valor nulo, y asegurar que se trata de un objeto Producto
        if (value != null && (value instanceof Producto)) {
            //Convertir el valor recibido al tipo Producto
            Producto producto = (Producto) value;
            //Obtener el nombre del producto
            nombreProducto = producto.getNombre();
        }
        //Asignar el nombre del producto como valor de la celda
        setText(nombreProducto);
    }

}
