package Project.pifinity.serviceInterface;

import Project.pifinity.entity.Project;

import java.util.List;

public interface ProjectService {

     List<Project> getAllProject();

    Project addProject(Project project);
     Project updateProject(Project project, long idP);
    Project retrieveProject (long idP);
    void removeProject(long idP);
}
