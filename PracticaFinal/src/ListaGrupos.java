import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListaGrupos implements Utilizable,Serializable{
    private List<GrupoMusica> lista;

    private File archivoGuardado;

    public ListaGrupos() {
        lista=new ArrayList<>();
    }

    public String muestraTodos(){
        String salida="";

        if (lista.size()==0){
            return "No tienes grupos en la lista";
        }else{
            for (GrupoMusica g: lista) {
                salida+=g.info()+"\n";
            }
        }

        return salida;
    }

    public void anyadeGrupo(){
        VentanaOpciones opciones = new VentanaOpciones();
        lista.add(opciones.getGrupoMusica());
    }

    public String tipoGrupo(){
        List<String> tipos = new ArrayList<>();
        tipos.add("BANDA");
        tipos.add("DUO");

        String tipo=(String) JOptionPane.showInputDialog(null,
                "¿Qué tipo de grupo quieres añadir a la lista?",
                "Elige un tipo de grupo",
                JOptionPane.WARNING_MESSAGE,
                null,
                tipos.toArray(),
                tipos.get(0));
        return tipo;
    }

    @Override
    public String toString() {
        return "ListaGrupo{" +
                "lista=" + lista +
                '}';
    }

    public void existeFichero(String nombre){
        archivoGuardado = Paths.get(nombre).toFile();
        if (archivoGuardado.exists()){
            ListaGrupos nuevaLista;
            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoGuardado))){
                nuevaLista = (ListaGrupos) ois.readObject();
                this.lista = nuevaLista.getLista();
            } catch (Exception e){
                e.printStackTrace();
            }
        }else{
            try(ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(archivoGuardado))) {
                oos.writeObject(this.lista);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void guardaListaFichero(String nombre) throws IOException {
        archivoGuardado = Paths.get(nombre).toFile();
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoGuardado))){
            oos.writeObject(this);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public List<GrupoMusica> getLista() {
        return lista;
    }
}