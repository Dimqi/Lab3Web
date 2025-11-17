package validation;

import java.math.BigDecimal;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;
import jakarta.faces.validator.FacesValidator;

@FacesValidator("validatorY")
public class ValidatorY implements Validator<Object> {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) {

        BigDecimal y;
        BigDecimal min = new BigDecimal("-5");
        BigDecimal max = new BigDecimal("5");
        
        try {
            y = new BigDecimal(value.toString().replace(",", "."));
        } catch (NumberFormatException e) {
            throw new ValidatorException(
                new FacesMessage( "Некорректный формат числа")
            );
        }

        if (y.compareTo(min) < 0 || y.compareTo(max) > 0) {
            throw new ValidatorException(
                new FacesMessage("Y должен быть от -5 до 5")
            );
        }
    }
}

