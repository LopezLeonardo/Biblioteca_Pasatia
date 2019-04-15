package entity;

import entity.Autores;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-14T10:59:27")
@StaticMetamodel(Libros.class)
public class Libros_ { 

    public static volatile SingularAttribute<Libros, String> editorial;
    public static volatile SingularAttribute<Libros, Integer> idLibro;
    public static volatile SingularAttribute<Libros, Autores> idAutor;
    public static volatile SingularAttribute<Libros, String> nombreLibro;
    public static volatile SingularAttribute<Libros, Integer> fechaPublicacion;

}