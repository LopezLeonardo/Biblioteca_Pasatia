package entity;

import entity.Libros;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-14T10:59:27")
@StaticMetamodel(Autores.class)
public class Autores_ { 

    public static volatile SingularAttribute<Autores, Integer> idAutor;
    public static volatile ListAttribute<Autores, Libros> librosList;
    public static volatile SingularAttribute<Autores, String> nombreAutore;

}