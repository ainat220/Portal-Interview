public class Schedule
{
    private String eventName;
    private int date;
    private int startTime;
    private int endTime;

    public Schedule()
    {
        eventName="Interview at the Portal"; //initialize to given first event
        date=022317; //feb 23 2017--> 02/23/17--> 022317
        startTime=1500; //military time (3:00pm)
        endTime=1630; //4:30pm
    }
    
    //name
    public String getName ()
    {
        return eventName;
    }
    
    public String setName (String namee)
    {
        eventName=namee;
        return eventName;
    }
    
    //date
    public int getDate ()
    {
        return date;
    }
    
    public int setDate (int datee)
    {
        date=datee;
        return date;
    }
    
    //start time
    public int getStart ()
    {
        return startTime;
    }
    
    public int setStart (int startt)
    {
        startTime=startt;
        return startTime;
    }
    
    //end time
    public int getEnd ()
    {
        return endTime;
    }
    
    public int setEnd (int endd)
    {
        endTime=endd;
        return endTime;
    }
}
