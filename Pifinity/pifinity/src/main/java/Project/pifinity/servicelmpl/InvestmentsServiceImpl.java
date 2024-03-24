package Project.pifinity.servicelmpl;


import Project.pifinity.entity.Investment;
import Project.pifinity.entity.Returns;
import Project.pifinity.repository.InvestmentRepo;
import Project.pifinity.serviceInterface.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentsServiceImpl implements InvestmentService {

    @Autowired
    private InvestmentRepo investmentRepo ;

    @Override
   public List<Investment> getAllInvestment()
   {
       return (List<Investment>) investmentRepo.findAll();
   }

    @Override
    public  Investment addInvestment(Investment Investment)
    {
        return investmentRepo.save(Investment) ;
    }

    @Override
    public Investment updateInvestment(Investment investment, long id) {
        investment.setIdI(id);
        return investmentRepo.save(investment);
    }

    @Override
    public Investment retrieveInvestment(long id) {
        return null;
    }


    @Override
    public void removeInvestment(long idP)
    {
        investmentRepo.deleteById(idP);
    }



}
