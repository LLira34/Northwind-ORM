package dao;

import java.io.Serializable;
import java.util.List;
import utils.SiscomException;

/**
 *
 * @author LLira
 */
public interface DAO<T, ID extends Serializable> {

    T create() throws SiscomException;

    void saveOrUpdate(T entity) throws SiscomException;

    T get(ID id) throws SiscomException;

    void delete(ID id) throws SiscomException;

    List<T> findAll() throws SiscomException;

}//End class
