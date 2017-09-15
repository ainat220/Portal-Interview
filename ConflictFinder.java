public class ConflictFinder
{
    public static void main (String [] args)
    {
        Schedule appt1= new Schedule();
        
        Schedule appt2= new Schedule();
        appt2.setName("Lunch with Cindy");
        appt2.setDate(022517);
        appt2.setStart(1200);
        appt2.setEnd(1300);
        
        
        Schedule appt3= new Schedule();
        appt3.setName("Dinner with John");
        appt3.setDate(022417);
        appt3.setStart(1700);
        appt3.setEnd(1730);
        
        
        Schedule appt4= new Schedule();
        appt4.setName("Conference");
        appt4.setDate(022417);
        appt4.setStart(1100);
        appt4.setEnd(1730);
        
        Schedule appt5= new Schedule();
        appt5.setName("ICS Project");
        appt5.setDate(022617);
        appt5.setStart(800);
        appt5.setEnd(1000);
        
        Schedule appt6= new Schedule();
        appt6.setName("7Leaves Fundraiser");
        appt6.setDate(022017);
        appt6.setStart(1200);
        appt6.setEnd(1330);
        
        Schedule appt7= new Schedule();
        appt7.setName("Babysitting");
        appt7.setDate(022717);
        appt7.setStart(900);
        appt7.setEnd(1530);
        
        Schedule appt8= new Schedule();
        appt8.setName("Disneyland");
        appt8.setDate(022017);
        appt8.setStart(1300);
        appt8.setEnd(1500);
        
        Schedule events[]={appt8, appt6, appt1, appt3, appt4, appt2, appt5, appt7}; //put in date order
       
       for (int i=0; i<events.length; i++){
           for (int j=events.length-1; j>i; j--){
               if (events[i].getDate()==events[j].getDate()){
                   if ((events[i].getStart()<= events[j].getEnd()) && (events[i].getStart() >= events[j].getStart())){
                       System.out.println(events[i].getName()+" conflicts with "+events[j].getName());
                    }
                }
       }
      }
    }
}
