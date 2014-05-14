package facturacion.renderer;

import facturacion.entities.FactDetalle;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ModeloTabla extends AbstractTableModel {

    List<FactDetalle> list;
    
    public void setDataList(List<FactDetalle> list) {
        this.list = list;
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0:
                return "Cantidad";
            case 1:
                return "Producto";
            case 2:
                return "Precio Unit.";
            case 3:
                return "IVA";
            default:
                return "";
        }
    }        
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FactDetalle factDetalle = list.get(rowIndex);
        switch(columnIndex) {
            case 0:
                return factDetalle.getCantidad();
            case 1:
                return factDetalle.getProductoId();
            case 2:
                return factDetalle.getPrecioUnit();
            case 3:
                return factDetalle.getIva();
            default:
                return null;
        }
    }

    
    
}
