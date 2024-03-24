package Project.pifinity.controller;

import Project.pifinity.entity.Project;
import Project.pifinity.entity.Returns;
import Project.pifinity.serviceInterface.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Project")
public class ProjectController {
    @Autowired
    ProjectService projectService;

    @GetMapping("/allP")
    public List<Project> getAllProject()
    {
        return projectService.getAllProject();
    }

    @PostMapping("/addP")
    public Project addProject(@RequestBody Project project) {
        return projectService.addProject(project);}



    @PutMapping("/updateP/{idP}")
    public Project updateProject(@PathVariable Long idP, @RequestBody Project project)
    {
        return projectService.updateProject(project,idP);}

@GetMapping("/Project/{idP}")
public Project retrieveProject (@PathVariable long idP)
    {
        return projectService.retrieveProject(idP);
    }

@DeleteMapping("/deleteProject/{idP}")
public void removeProject(@PathVariable long idP)
    {
         projectService.removeProject(idP);
    }


}
