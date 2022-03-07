package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public String getName(){
        return name;
    }
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();

    }
//    public Student (String name)

    //add  given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    //returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        double studentNumber = grades.size();
        for(int i  = 0; i < studentNumber; i++){
            sum +=grades.get(i);
        }
        double average = sum/ studentNumber;
        return average;
    }

    public static void main(String[] args) {

        Student student1 = new Student("mina");
        student1.addGrade(80);
        student1.addGrade(46);
        student1.addGrade(90);
        student1.addGrade(79);
        student1.addGrade(68);
        System.out.println("student1.grades.size() = " + student1.grades.size());
        System.out.println("student1.getGradeAverage() = " + student1.getGradeAverage());
        System.out.println("student1.getName() = " + student1.getName());

        Student student2 = new Student("jane");
        student2.addGrade(90);
        student2.addGrade(80);
        student2.addGrade(90);
        student2.addGrade(40);
        student2.addGrade(98);
        System.out.println("student2.grades.size() = " + student2.grades.size());
        System.out.println("student2.getGradeAverage() = " + student2.getGradeAverage());
        System.out.println("student2.getName() = " + student2.getName());




    }





}
