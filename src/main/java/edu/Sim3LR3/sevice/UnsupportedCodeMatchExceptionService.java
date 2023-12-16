package edu.Sim3LR3.sevice;

import edu.Sim3LR3.exception.UnsupportedCodeException;
import edu.Sim3LR3.model.Request;
import org.springframework.stereotype.Service;

@Service
public interface UnsupportedCodeMatchExceptionService {
    void isUidMatch(Request request) throws UnsupportedCodeException;
}
