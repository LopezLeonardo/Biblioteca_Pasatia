
package controller;

import entity.Autores;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import model.AutoresFacadeLocal;


@Named(value = "autorBean")
@RequestScoped
public class AutorBean {

    @EJB
    private AutoresFacadeLocal autoresFacade;
    private Autores autores;
            
    public AutorBean() {
        autores = new Autores();
    }
    
    public List<Autores>getAutoreses(){
        return autoresFacade.findAll();
    }

    public void insertar(){
        if (autores.getIdAutor()==null) {
            autoresFacade.create(autores);
        } else {
            autoresFacade.edit(autores);
        }
        autores = new Autores();
    }
    
    public void quitar(Autores a){
        if (a.getIdAutor()!=null) {
            autoresFacade.remove(a);
        }
    }
    
    public Autores getAutores() {
        return autores;
    }

    public void setAutores(Autores autores) {
        this.autores = autores;
    }
    
    
    
}
