package lk.ijse.d24hostelsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "studentId")
    String studentId;
    @Column(name = "studentName")
    String studentName;
    @Column(name = "nic")
    String nic;
    @Column(name="homeTown")
    String homeTown;
    @Column(name = "dob")
    Date dob;
    @Column(name = "gender")
    String gender;
    @Column(name = "phoneNumber")
    int phoneNumber;
    @Column(name = "university")
    String university;

    public Student() {
    }

    public Student(String studentId, String studentName, String nic, String homeTown, Date dob, String gender, int phoneNumber, String university) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.nic = nic;
        this.homeTown = homeTown;
        this.dob = dob;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", nic='" + nic + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", university='" + university + '\'' +
                '}';
    }


}
