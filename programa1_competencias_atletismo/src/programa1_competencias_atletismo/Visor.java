package programa1_competencias_atletismo;
import java.util.ArrayList;
public class Visor extends Atleta {
    private ArrayList<Prueba> listaPruebas;
    private String nombre,apellido1,apellido2,identificacion,pais,
                   fechanacimiento,correo,telefono;

    public Visor(String pNombre,String pApellido1,String pApellido2,String pIdentificacion,
        String pPais, String pFechanacimiento,String pCorreo,String pTelefono){
        super(pNombre, pApellido1, pApellido2, pIdentificacion,
         pPais,  pFechanacimiento, pCorreo, pTelefono);
        listaPruebas = new ArrayList<>();
    }
}
