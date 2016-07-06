package myTime; 
import java.util.Date;
import javax.ejb.*; 
@Stateless 
public class CurrTimeBean implements TimeGeter { 
    public TimeContainer getTimeContainer() { 
        Date d=new Date();
        return new TimeContainer(d.getHours(),d.getMinutes()); 
    } 
}