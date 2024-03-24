package Project.pifinity.serviceInterface;

import Project.pifinity.entity.Returns;

import java.util.List;

public interface ReturnService {
    List<Returns> getAllReturns();
     Returns addReturn(Returns r);
    Returns updateReturn(long idR ,Returns r);
    void deleteReturn(Long idR);
}
