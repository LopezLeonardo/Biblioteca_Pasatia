
package controller;

import entity.Autores;
import entity.Libros;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import model.AutoresFacadeLocal;
import model.LibrosFacadeLocal;

@Named(value = "libroBean")
@RequestScoped
public class LibroBean {

    @EJB
    private AutoresFacadeLocal autoresFacade;
    private Autores autores;
    
    @EJB
    private LibrosFacadeLocal librosFacade;
    private Libros libros;
    
    
    public LibroBean() {
        libros = new Libros();
        autores = new Autores();
    }
    
    public List<Libros>getLibroses(){
        return librosFacade.findAll();
    }
    
    public List<Autores>getAutoreses(){
        return autoresFacade.findAll();
    }
    
    public void insertar(){
        libros.setIdAutor(autores);
        if (libros.getIdLibro()==null) {
            librosFacade.create(libros);
        } else {
            librosFacade.edit(libros);
        }
        libros = new Libros();
        autores = new Autores();
    }
    
    public void quitar(Libros l){
        if (l.getIdLibro()!=null) {
            librosFacade.remove(l);
        }
    }

    public Autores getAutores() {
        return autores;
    }

    public void setAutores(Autores autores) {
        this.autores = autores;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
        this.autores = libros.getIdAutor();
    }
    
    
    
}
