package edu.Sim3LR3.sevice;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import edu.Sim3LR3.exception.ValidationFailedException;

@Service
public interface ValidationService{
    void isValid(BindingResult bindingResult) throws ValidationFailedException;
}
