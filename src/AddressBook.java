import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook(){
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        if(buddy != null){
            buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy){
        if(buddies.contains(buddy)){
          buddies.remove(buddy);
        }
        else{
            System.out.println("Buddy not found");
        }
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}

