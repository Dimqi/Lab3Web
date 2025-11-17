package validation;


import java.math.BigDecimal;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;
import jakarta.faces.validator.FacesValidator;

@FacesValidator("validatorR")
public class ValidatorR implements Validator<Object> {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) {

        BigDecimal r;
        BigDecimal min = new BigDecimal("1");
        BigDecimal max = new BigDecimal("4");
        
        try {
            r = new BigDecimal(value.toString().replace(",", "."));
        } catch (NumberFormatException e) {
            throw new ValidatorException(
                new FacesMessage( "Некорректный формат числа")
            );
        }

        if (r.compareTo(min) < 0 || r.compareTo(max) > 0) {
            throw new ValidatorException(
                new FacesMessage("R должен быть от 1 до 4")
            );
        }
    }
}
