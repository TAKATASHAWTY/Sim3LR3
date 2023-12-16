package edu.Sim3LR3.sevice;

import edu.Sim3LR3.model.Response;
import org.springframework.stereotype.Service;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
