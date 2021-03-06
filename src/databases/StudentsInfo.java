package databases;

import java.io.Serializable;

public class StudentsInfo implements Serializable {

    /*
     * Student class have 4 variables which will be constructed as Student Object into List<Student>.
     */
    private String firstName;
    private String lastName;
    private String score;
    private String id;

    public StudentsInfo(){}

    public StudentsInfo(String firstName, String lastName, String score, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString(){
        return "Student" + "("+"id= "+id+")"+ firstName+" "+lastName+" "+" Grade = "+score;
    }

}
