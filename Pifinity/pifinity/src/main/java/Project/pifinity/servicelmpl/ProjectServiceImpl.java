package Project.pifinity.servicelmpl;

import Project.pifinity.entity.Project;
import Project.pifinity.repository.ProjectRepo;
import Project.pifinity.serviceInterface.ProjectService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService { 


    @Autowired
    private ProjectRepo projectRepo;

    @Override
    public List<Project> getAllProject()
    {return projectRepo.findAll();}
    @Override
    public Project addProject(Project project )
    {
        return projectRepo.save(project);}
    @Override
    public Project updateProject(Project project, long idP) {
        Optional<Project> existingProjectOptional = projectRepo.findById(idP);

            return projectRepo.save(project);

    }

    @Override
        public Project retrieveProject (long idP)
        {
            return projectRepo.findById(idP).orElse(null);
        }

    @Override
   public void removeProject(long idP)
    {
        projectRepo.deleteById(idP);
    }

}


