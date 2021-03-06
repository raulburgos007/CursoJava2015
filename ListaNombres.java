import java.util.ArrayList; //Los import deben ir siempre al principio antes de declarar la clase

public class ListaNombres {

    private ArrayList<String> listadenombres; //Declaramos un ArrayList que contiene objetos String

    public ListaNombres (String nombre) {    //Constructor: crea una lista de nombres vacía

        listadenombres = new ArrayList<String>(); //Creamos el objeto de tipo ArrayList

    } //Cierre del constructor


    public void addNombre (String valor_nombre) { listadenombres.add (valor_nombre); } //Cierre del método
 

    public String getNombre (int posicion) { //Método

        if (posicion >= 0 && posicion < listadenombres.size() ) {

            return listadenombres.get(posicion); }

        else { return "No existe nombre para la posición solicitada";}

    } //Cierre del método  

 

    public int getTamano () { return listadenombres.size(); } //Cierre del método

 

    public void removeNombre (int posicion) {  //Método

        if (posicion >= 0 && posicion < listadenombres.size() ) {

            listadenombres.remove(posicion); }

        else { } //else vacío. No existe nombre para la posición solicitada, no se ejecuta ninguna instrucción

    } //Cierre del método removeNombre

} //Cierre de la clase