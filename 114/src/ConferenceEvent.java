public class ConferenceEvent extends Event{
    private boolean breakfastRequired;
    private double breakfastCost;
    private boolean lunchRequired;
    private double lunchCost;
    private boolean dinnerRequired;
    private double dinnerCost;
    private double ConferenceEventCost;

    public double getBreakfastCost(){
        return breakfastCost;
    }

    public void setBreakfastCost(double breakfastCost){
        this.breakfastCost = breakfastCost;
    }

    public double getLunchCost(){
        return lunchCost;
    }

    public void setLunchCost(double lunchCost){
        this.lunchCost = lunchCost;
    }

    public double getDinnerCost(){
        return dinnerCost;
    }

    public ConferenceEvent(String eventID,String eventName,String eventLocation,String pointOfContact,double eventCost,int totalParticipants,int totalEventDay ){
         super(eventID, eventName, eventLocation, pointOfContact, eventCost, totalParticipants, totalEventDay);
         this.breakfastCost = breakfastCost;
         this.lunchCost = lunchCost;
         this.dinnerCost = dinnerCost;
    }

    @Override
    public void calculateEventCost(){
        ConferenceEventCost = getEventCost() + ((getBreakfastCost() + getLunchCost() + getDinnerCost() + getTotalParticipants() + getTotalEventDay()))
    }

    @Override
    public String toString(){
        return"Conference event details" + "\n" +
        "Event ID:" + getEventId() + "\n" +
        "Event Name" + getEventName() + "\n" +
        "Event Location:" + getEventLocation() + "\n" +
        "Total participants:" + getTotalParticipants() + "\n" +
        "Total Conference Cost:" + ConferenceEventCost;
    }
    }