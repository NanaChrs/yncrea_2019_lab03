package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.dao.BusinessTypeDAO;
import yncrea.lab03.core.entity.BusinessType;

@Service
@Transactional
public class BusinessTypeService {
    BusinessTypeDAO dao;

    public BusinessTypeService(BusinessTypeDAO dao) {
        super();
        this.dao = dao;
    }

    public void deleteAll() {
        dao.deleteAll();
    }


    public void save(final BusinessType businessType) {
        dao.save(businessType);
    }


    public long countAll() {
        return dao.count();
    }
}
