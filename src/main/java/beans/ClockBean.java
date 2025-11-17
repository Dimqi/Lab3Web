package beans;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;



@Named
@SessionScoped
public class ClockBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String currentTime;

    public void updateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        currentTime = sdf.format(new Date());
    }

    public String getCurrentTime() {
        return currentTime;
    }
    
    
    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }
}
