package test;

import dao.impl.CategoryDAOImplHibernate;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Category;
import utils.SiscomException;

/**
 *
 * @author LLira
 */
public class TestCategory {
    public static void main(String[] args) {
        try {
            CategoryDAOImplHibernate dao = new CategoryDAOImplHibernate();
            Category category = new Category();
            category.setCategoryName("Bebidas");
            category.setDescription("Muchas bebidas");
            dao.saveOrUpdate(category);
        } catch (SiscomException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}//End class
