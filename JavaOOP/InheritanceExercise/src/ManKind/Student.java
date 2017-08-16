package ManKind;

/**
 * Created by Todor Popov using Lenovo on 1.3.2017 г. at 20:53.
 */
public class Student extends Human{

    private String facultyNunber;

    public Student(String firstName, String lastName,String facultyNunber) {
        super(firstName, lastName);
        this.setFacultyNunber(facultyNunber);
    }


    public String getFacultyNunber() {
        return this.facultyNunber;
    }

    private void setFacultyNunber(String facultyNunber) {
        if (facultyNunber.length()<5 || facultyNunber.length()>10){
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNunber = facultyNunber;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString())
                .append(String.format("Faculty number: %s",this.getFacultyNunber())).append(System.lineSeparator());
        return sb.toString();
    }
}
