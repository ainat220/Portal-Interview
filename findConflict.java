
import java.util.Scanner;
public class findConflict
{
    public static void main (String [] args){
       Schedule appt1=new Schedule();
       appt1.setName("Interview at the Portal");
       appt1.setDate(1487890800);
       appt1.setTime(1487896200);
       
       Schedule appt2=new Schedule();
       appt2.setName("Lunch with Cindy");
       appt2.setDate(1488052800);
       appt2.setTime(1488056400);
       
       Schedule appt3=new Schedule();
       appt3.setName("Dinner with John");
       appt3.setDate(1487984400);
       appt3.setTime(1487986200);
       
       
       Schedule events[]={appt1, appt2, appt3};
       
       for (int i=0; i<events.length; i++){
           for (int j=events.length-1; j>i; j--){
               if (events[i].getDate()==events[j].getDate()){
                   if (events[i].getTime()==events[j].getTime()){
                       System.out.println(events[i].getName()+" conflicts with "+events[j].getName());
                    }
                   else {
                       System.out.println(events[i].getName()+" shares a date with "+events[j].getName());
                   }
                }
               else{
                   System.out.println(events[i].getName()+" does not conflict "+events[j].getName());
                }
       }
   }
  }
}
