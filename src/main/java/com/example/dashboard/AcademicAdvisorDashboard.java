package com.example.dashboard;

import java.util.ArrayList;
import java.util.List;

// Class representing student performance data
class StudentPerformance {
    private String studentId;
    private String studentName;
    private int attendancePercentage;
    private double averageGrade;
    private double dropoutRiskScore;

    public StudentPerformance(String studentId, String studentName, int attendancePercentage, double averageGrade, double dropoutRiskScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.attendancePercentage = attendancePercentage;
        this.averageGrade = averageGrade;
        this.dropoutRiskScore = dropoutRiskScore;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAttendancePercentage() {
        return attendancePercentage;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public double getDropoutRiskScore() {
        return dropoutRiskScore;
    }

    @Override
    public String toString() {
        return "StudentPerformance{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", attendancePercentage=" + attendancePercentage +
                ", averageGrade=" + averageGrade +
                ", dropoutRiskScore=" + dropoutRiskScore +
                '}';
    }
}

// Dashboard class for academic advisors
public class AcademicAdvisorDashboard {
    private List<StudentPerformance> studentPerformanceList;

    public AcademicAdvisorDashboard() {
        this.studentPerformanceList = new ArrayList<>();
    }

    // Method to add student performance data
    public void addStudentPerformance(StudentPerformance performance) {
        studentPerformanceList.add(performance);
    }

    // Method to display a dashboard summary
    public void displayDashboard() {
        System.out.println("Academic Advisor Dashboard - Student Performance Analytics");
        System.out.println("--------------------------------------------------------------");
        for (StudentPerformance sp : studentPerformanceList) {
            System.out.println(sp.toString());
        }
    }

    public static void main(String[] args) {
        AcademicAdvisorDashboard dashboard = new AcademicAdvisorDashboard();

        // Example Data
        dashboard.addStudentPerformance(new StudentPerformance("S001", "John Doe", 95, 88.5, 0.05));
        dashboard.addStudentPerformance(new StudentPerformance("S002", "Jane Smith", 80, 74.0, 0.20));
        dashboard.addStudentPerformance(new StudentPerformance("S003", "Jim Brown", 60, 65.0, 0.40));

        // Display the dashboard
        dashboard.displayDashboard();
    }
}
