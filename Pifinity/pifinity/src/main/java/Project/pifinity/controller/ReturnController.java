package Project.pifinity.controller;


import Project.pifinity.entity.Returns;
import Project.pifinity.serviceInterface.ReturnService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Returns")
public class ReturnController {

    @Autowired
    private  ReturnService returnService;

    @GetMapping("/allR")
    public List<Returns> getAllReturns()
    {
        return returnService.getAllReturns();
    }
    @PostMapping("/addR")
    public Returns addReturn(@RequestBody Returns r) {
        return returnService.addReturn(r);
    }
    @PutMapping("/updateR/{id}")

    public Returns updateReturn(@PathVariable Long idR, @RequestBody Returns r)
    {
        r.setIdR(idR);
        return returnService.updateReturn(idR,r);}

    @DeleteMapping("/deleteR/{id}")
    public void deleteReturn(@PathVariable Long idR)
    { returnService.deleteReturn(idR);}
}
