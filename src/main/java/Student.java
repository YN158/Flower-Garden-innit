import java.util.ArrayList;

public class Student extends Account
{
    ArrayList<Courses> StudentCourses = new ArrayList<Courses>();

    public Student (String FN, String LN, String PW)
    {
        setFirstUsername(FN, LN);
        changePassword(PW);
    }
}
