import java.util.ArrayList;

class Faculty
{
    int facultyId,salary;
}

class FullTimeFaculty extends Faculty
{
    int basic , allowance;
    int sum(int b,int a)
    {
        basic = b;
        allowance = a;
        salary = b + a;
        return salary;
    }
}

class PartTimeFaculty extends Faculty
{
    int hour,rate;
    int sum(int h,int r)
    {
        hour = h;
        rate = r;
        salary = h * r;
        return  salary;
    }
}

public class XYZ1 {
    public static void main(String[] args) {
        ArrayList<Integer> inf = new ArrayList<>();
        FullTimeFaculty f1 = new FullTimeFaculty();
        FullTimeFaculty f2 = new FullTimeFaculty();
        PartTimeFaculty p1 = new PartTimeFaculty();
        PartTimeFaculty p2 = new PartTimeFaculty();
        int d1;
        d1 = f1.sum(3,8);
        inf.add(d1);
        d1 = f2.sum(5,9);
        inf.add(d1);
        d1 = p1.sum(3,6);
        inf.add(d1);
        d1 = p2.sum(2,6);
        inf.add(d1);

        inf.add(f1.basic);//, f1.allowance);
        inf.add(f1.allowance);
        inf.add(f2.basic);//, f2.allowance);
        inf.add(f2.allowance);
        inf.add(p1.hour);//, p1.rate);
        inf.add(p1.rate);
        inf.add(p2.hour);//, p2.rate);
        inf.add(p2.rate);

        System.out.println(inf);
    }
}
