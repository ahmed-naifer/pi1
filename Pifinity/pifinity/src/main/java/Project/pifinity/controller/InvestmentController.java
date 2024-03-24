package Project.pifinity.controller;

import Project.pifinity.entity.Investment;
import Project.pifinity.serviceInterface.InvestmentService;
import Project.pifinity.servicelmpl.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investments")
public class InvestmentController {

    @Autowired
    private NotificationService notificationService;
    @Autowired
    private InvestmentService investmentService;

    @GetMapping
    public List<Investment> getAllInvestments() {
        return investmentService.getAllInvestment();
    }

    @PostMapping("/add")
    public Investment addInvestment(@RequestBody Investment investment) {
        Investment newInvestment = investmentService.addInvestment(investment);

        notificationService.createNotification("Nouvel investissement créé le " + newInvestment.getIdate());

        return investmentService.addInvestment(investment);
    }

    @PutMapping("/update/{id}")
    public Investment updateInvestment(@RequestBody Investment investment, @PathVariable("id") long id) {
        Investment updatedInvestment = investmentService.updateInvestment(investment,id);
        notificationService.createNotification("Investissement mis à jour le " + updatedInvestment.getIdI());
        return updatedInvestment;
    }

    @GetMapping("/{id}")
    public Investment retrieveInvestment(@PathVariable("id") long id) {
        return investmentService.retrieveInvestment(id);
    }

    @DeleteMapping("/remove/{id}")
    public void removeInvestment(@PathVariable("id") long id) {

        notificationService.createNotification("Investissement supprimé : " + id);
        investmentService.removeInvestment(id);
    }
}
