import java.util.UUID;

public class Account
{
    private String FirstName;
    private String LastName;
    private String username;
    private String password;
    private UUID accountID;


    public boolean validatePassword(String enteredPassword)
    {
        boolean Statues = false;
        if (enteredPassword.equals(password))
        {
            Statues = true;
        }
        return Statues;
    }

    public void changeUsername(String newUsername)
    {
        username = newUsername;
    }

    public void setFirstUsername(String FN, String LN)
    {
        FirstName = FN;
        LastName = LN;
        username = FN + " " + LN;
    }


    public void changePassword(String newPassword)
    {
        password = newPassword;
    }
}
