// Read-only currentDate
import java.time.LocalDate;public class Q04 {public static class DateBean {public DateBean(){}public LocalDate getCurrentDate(){return LocalDate.now();}}public static void main(String[] args){System.out.println(new DateBean().getCurrentDate());}}
