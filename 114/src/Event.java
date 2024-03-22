public class Event {

    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDay;

    public Event(String eventID,String eventName,String eventLocation,String pointOfContact,double eventCost,int totalParticipants,int totalEventDay){
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.pointOfContact = pointOfContact;
        this.eventCost = eventCost;
        this.totalParticipants = totalParticipants;
        this.totalEventDay = totalEventDay;

    }
    
    public String getEventId(){
        return eventID;
    }

    public void setEventID(String eventID){
        this.eventID = eventID;
    }

    public String getEventName(){
        return eventName;
    }

    public void setEventName(String eventName){
        this.eventName = eventName;
    }

    public String getEventLocation(){
        return eventLocation;
    }

    public void setEventLocation(String eventLocation){
        this.eventLocation = eventLocation;
    }

    public String getPointOfContact(){
        return pointOfContact;
    }

    public void setPointOfContact(String pointOfContact){
        this.pointOfContact = pointOfContact;
    }

    public double getEventCost(){
        return eventCost;
    }

    public void setEventCost(double eventCost){
        this.eventCost = eventCost;
    }

    public int getTotalParticipants(){
        return totalParticipants;
    }

    public void setTotalParticipants(int totalParticipants){
        this.totalParticipants = totalParticipants;
    }

    public int getTotalEventDay(){
        return totalEventDay;
    }

    public void setTotalEventDay(int totalEventDay){
        this.totalEventDay = totalEventDay;
    }

    public String toString(){
        return eventID + " " + eventName + " " + eventLocation + " " + pointOfContact + " " + eventCost + " " + totalParticipants + " " + totalEventDay;
    }

    public void calculateEventCost(){
        this.eventCost = eventCost + (eventCost + tax) + insuranceCost;

    }
    }
}
