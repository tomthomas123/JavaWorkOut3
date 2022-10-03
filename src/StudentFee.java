class InvalidFeeException extends Exception
{
    InvalidFeeException()
    {
        super();
    }
}

public interface StudentFee {
    double getFee(String  name ,int fees) throws InvalidFeeException;
}
class Student1 implements StudentFee
{
    //String name = "Maha";
    public double getFee(String name ,int fees){
        int fee = fees;
        System.out.println("Name of the student : "+name);
        return fee;
    }

}
class interclass{
    public static void main(String[] args) {
        Student1 stud = new Student1();
        double a = stud.getFee("Maha",15000);
        System.out.println("Fees of the student : "+ a);
    }
}