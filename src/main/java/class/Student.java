public class Student {
private String name; // Student's name.
public double test1, test2, test3; // Grades on three tests.
Student(String theName) {
// Constructor for Student objects;
// provides a name for the Student.
name = theName;
}
public String getName() {
// Accessor method for reading value of private
// instance variable, name.
return name;
}
public double getAverage() {
// Compute average test grade.
return (test1 + test2 + test3) / 3;
}
} // end of class Student