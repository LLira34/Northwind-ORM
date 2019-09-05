package test;

import dao.impl.CustomerDAOImplHibernate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Customer;
import utils.SiscomException;

/**
 *
 * @author LLira
 */
public class Test {
    public static void main(String[] args) {
        try {
            CustomerDAOImplHibernate dao = new CustomerDAOImplHibernate();
            Customer customer = new Customer();
            customer.setCompanyName("Google");
            customer.setContactName("Perla Marmolejo");
            
            customer.setAddress("Av. Universidad");
            customer.setCity("Queretaro");
            customer.setCountry("Mexico");
            customer.setPhone("418-113-7817");
            //dao.saveOrUpdate(customer);
            
            //Update
            //customer.setCustomerID(1);
            //dao.saveOrUpdate(customer);
            
            //Delete
            //dao.delete(4);
            
            List<Customer> customers = dao.findAll();
            for (Customer c1 : customers) {
                System.out.println(c1);
            }
        } catch (SiscomException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}//End
