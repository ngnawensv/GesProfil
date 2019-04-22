/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import entities.Pays;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lucien FOTSA
 */
@Local
public interface PaysFacadeLocal {

    void create(Pays pays);

    void edit(Pays pays);

    void remove(Pays pays);

    Pays find(Object id);

    List<Pays> findAll();

    List<Pays> findRange(int[] range);

    int count();
    
    int nextId();
    
    List<Pays> findByNom(String nom);
}
