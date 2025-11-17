package validation;

import java.math.BigDecimal;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.validator.FacesValidator;
import jakarta.faces.validator.Validator;
import jakarta.faces.validator.ValidatorException;

@FacesValidator("validatorX")
public class ValidatorX implements Validator<Object> {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) {

        BigDecimal x;
        BigDecimal min = new BigDecimal("-5");
        BigDecimal max = new BigDecimal("5");
        
        try {
            x = new BigDecimal(value.toString().replace(",", "."));
        } catch (NumberFormatException e) {
            throw new ValidatorException(
                new FacesMessage( "Некорректный формат числа")
            );
        }

        if (x.compareTo(min) < 0 || x.compareTo(max) > 0) {
            throw new ValidatorException(
                new FacesMessage("X должен быть от -5 до 5")
            );
        }
    }
}