import java.io.*;
import java.nio.file.Paths;
import java.util.Set;
import java.util.TreeSet;

public class ListaUsuarios {
    Set<Usuario> lista = new TreeSet<>();
    File fichero=new File("Usuarios.txt");
    FileReader fr = null;
    BufferedReader br = null;
    FileWriter fw = null;
    PrintWriter pw = null;

    ListaUsuarios(){
        try {
            fr = new FileReader (fichero);
            br = new BufferedReader(fr);
            String linea;
            while((linea=br.readLine())!=null)
                lista.add(new Usuario(linea));
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

    public Set<Usuario> getLista() {
        return lista;
    }

    public boolean compruebaLista(String usuarioIntroducido){
        Usuario u2 = new Usuario(usuarioIntroducido);
        for (Usuario u: lista) {
            int posicionUsuario = u.getUsuario().indexOf(":");
            if (u.getUsuario().substring(0,posicionUsuario).equals(u2.getUsuario())){
                return true;
            }
        }
        return false;
    }

    public void anyadeUsuario(String usuario, String nombre, String apellidos, String email){
        try{
            fw = new FileWriter(fichero,true);
            pw = new PrintWriter(fw);
            pw.println(usuario+":"+nombre+":"+apellidos+":"+email);
            lista.add(new Usuario(usuario));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero)
                    fw.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "ListaUsuarios{" +
                "lista=" + lista +
                '}';
    }

    public static void main(String[] args) {
        ListaUsuarios l = new ListaUsuarios();
        System.out.println(l.compruebaLista("------"));
    }
}