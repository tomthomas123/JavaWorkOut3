import java.lang.reflect.Array;
import java.util.ArrayList;

class Student
{
    int roll_no;
    int percentage;

    public Student() {

    }

    public Student(int roll_no, int percentage) {
        this.roll_no = roll_no;
        this.percentage = percentage;
    }

    void show(String Name ,int percentage)
    {
        System.out.println("Percentage of the "+ Name + percentage);
    }

}

class CollegeStudent extends Student
{
    int semester;

    public CollegeStudent() {

    }

    public CollegeStudent(int roll_no, int percentage, int semester) {
        super(roll_no, percentage);
        this.semester = semester;
    }


    void show(int semester)
    {
        System.out.println("This is in this semestry "+ semester);
    }
}

class SchoolStudent extends Student
{
    int Standard;

    public SchoolStudent() {

    }

    public SchoolStudent(int roll_no, int percentage, int standard) {
        super(roll_no, percentage);
        Standard = standard;
    }

    void show(int stand)
    {
        System.out.println("the student is studing in "+ stand);
    }

}

public class XYZ {
    public static void main(String[] args) {
        ArrayList<Integer> objName = new ArrayList();
        CollegeStudent clg1 = new CollegeStudent(1,88,4);
        CollegeStudent clg2 = new CollegeStudent(2,75,5);
        SchoolStudent sch1 = new SchoolStudent(10,80,12);
        SchoolStudent sch2 = new SchoolStudent(11,70,12);
        SchoolStudent sch3 = new SchoolStudent(14,90,12);

        objName.add(clg1.roll_no);
        objName.add(clg1.percentage);
        objName.add(clg1.semester);
        objName.add(clg2.roll_no);
        objName.add(clg2.percentage);
        objName.add(clg2.semester);

        objName.add(sch1.roll_no);
        objName.add(sch1.percentage);
        objName.add(sch1.Standard);
        objName.add(sch2.roll_no);
        objName.add(sch2.percentage);
        objName.add(sch2.Standard);
        objName.add(sch3.roll_no);
        objName.add(sch3.percentage);
        objName.add(sch3.Standard);

        System.out.println(objName);
        int count = 0;

        for(int i=0 ; i< objName.size() ; i++)
        {
            if (objName.get(i) == clg1.roll_no)
            {
                System.out.println("roll number belong to collage");
                // System.out.println(clg1.roll_no);
                if (objName.get(i+1) > 75 )
                {
                    count = count + 1;
                }

            } else if (objName.get(i) == clg2.roll_no) {
                System.out.println("roll number belong to collage");
                // System.out.println(clg2.roll_no);
                if (objName.get(i+1) > 75)
                {
                    count = count + 1;
                }

            }
            else if (objName.get(i) == sch1.roll_no){
                System.out.println("roll number belong to school");
                // System.out.println(sch1.roll_no);
                if(objName.get(i+1)>75)
                {
                    count = count +1;
                }
            } else if (objName.get(i) == sch2.roll_no) {
                System.out.println("roll number belong to school");
                // System.out.println(sch2.roll_no);
                try
                {
                    if(objName.get(i+1)>75)
                    {
                        count = count +1;
                    }
                }
                catch (IndexOutOfBoundsException e)
                {
                    System.out.println(e);
                }
            } else if (objName.get(i) == sch3.roll_no) {
                System.out.println("roll number belong to school");
                // System.out.println(sch3.roll_no);
                if(objName.get(i+1)>75)
                {
                    count = count +1;
                }
            }
        }
        System.out.println("No of students who get Grade A = "+ count);
    }
}




