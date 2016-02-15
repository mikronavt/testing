package accountServer;

/**
 * Created by User on 15.02.2016.
 */
public class AccountServer implements AccountServerI {
    private int usersCount;
    private int usersLimit;

    public AccountServer(int usersLimit){
        this.usersCount = 0;
        this.usersLimit = usersLimit;
    }

    @Override
    public void addNewUser(){
        usersCount++;
    }

    @Override
    public void removeUser(){
        usersCount--;
    }

    @Override
    public int getUsersLimit(){
        return usersLimit;
    }

    @Override
    public int getUsersCount(){
        return usersCount;
    }

    @Override
    public void setUsersLimit(int usersLimit){
        this.usersLimit = usersLimit;
    }
}
