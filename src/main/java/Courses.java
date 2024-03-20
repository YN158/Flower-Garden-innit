import java.util.ArrayList;
import java.util.UUID;

public class Courses
{
    String  CourseName;
    private UUID CourseID;
    int CourseDay;
    int CourseTime;
    int CourseExamMonth;
    int CourseExamDate;
    Professor prof = new Professor();
    ArrayList<Courses> StudentCourses = new ArrayList<Courses>();
}
