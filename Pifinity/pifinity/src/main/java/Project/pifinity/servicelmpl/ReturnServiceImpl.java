package Project.pifinity.servicelmpl;


import Project.pifinity.entity.Project;
import Project.pifinity.entity.Returns;
import Project.pifinity.repository.ReturnRepo;
import Project.pifinity.serviceInterface.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class ReturnServiceImpl implements ReturnService {


    @Autowired
    private ReturnRepo returnRepo;

        @Override
        public List<Returns> getAllReturns()
        {return returnRepo.findAll();}

        @Override
        public Returns updateReturn(long idR ,Returns r) {
            Optional<Returns> existingProjectOptional = returnRepo.findById(idR);

            return returnRepo.save(r);

        }

        @Override
     public   Returns addReturn(Returns r){
            return returnRepo.save(r) ;
     }


        @Override
            public void deleteReturn(Long idR)
            {
                  returnRepo.deleteById(idR);
            }

}
