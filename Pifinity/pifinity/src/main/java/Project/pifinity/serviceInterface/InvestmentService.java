package Project.pifinity.serviceInterface;

import Project.pifinity.entity.Investment;

import java.util.List;

public interface InvestmentService {

    List<Investment> getAllInvestment();

    Investment addInvestment(Investment Investment);
    Investment updateInvestment(Investment Investment, long id);
    Investment retrieveInvestment(long id);
    void removeInvestment(long id);
}
