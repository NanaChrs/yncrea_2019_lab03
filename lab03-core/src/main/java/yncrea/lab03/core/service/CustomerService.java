package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.dao.CustomerDAO;
import yncrea.lab03.core.entity.Customer;

@Service
@Transactional
public class CustomerService {

    CustomerDAO dao;

    public CustomerService(CustomerDAO dao) {
        super();
        this.dao = dao;
    }

    public void deleteAll() {
        dao.deleteAll();
    }


    public void save(Customer customer) {
        dao.save(customer);
    }


    public long countAll() {
        return dao.count();
    }
}
