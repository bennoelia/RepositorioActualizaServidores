import javax.swing.table.DefaultTableModel;
 
 
public class ModeloTabla2 extends DefaultTableModel{
  
 String[] titulos;
 Object[][] datos;
  
//
// Determina el modelo con el que se va a construir la tabla
// @param datos
// @param titulos
//
 public ModeloTabla2(Object[][] datos, String[] titulos) {
  super();
  this.titulos=titulos;
  this.datos=datos;
  setDataVector(datos, titulos);
 }
  
 public ModeloTabla2() {
  // TODO Auto-generated constructor stub
 }
 
 public boolean isCellEditable (int row, int column)
 {
  //Definimos si una celda puede ser o no editable
  //if (column!=Utilidades.PERFIL && column!=Utilidades.EVENTO && column!=Utilidades.NOTA1 && column!=Utilidades.NOTA2 && column!=Utilidades.NOTA3){   
  if (column==2 && this.getColumnName(column)=="Archivo" ||  column==1 && this.getColumnName(column)=="FechaArchivo"){
          return true; 
        }else{
         return false;
        }
 }
}
