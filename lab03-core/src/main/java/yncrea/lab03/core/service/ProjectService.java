package yncrea.lab03.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yncrea.lab03.core.dao.ProjectDAO;
import yncrea.lab03.core.entity.Project;

import java.util.List;

@Service
@Transactional
public class ProjectService {

    ProjectDAO dao;

    public ProjectService(ProjectDAO dao) {
        super();
        this.dao = dao;
    }

    public void deleteAll() {
        dao.deleteAll();
    }

    public void save(Project project){
        dao.save(project);
    }

    public long countAll() {
        return dao.count();
    }

    public List<Project> findAll(){
        return (List<Project>) dao.findAll();
    }
}
