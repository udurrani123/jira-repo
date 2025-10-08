package com.academic.dashboard;

import java.util.List;

public class StudentPerformanceDashboard {

    // Class representing student performance data
    public static class StudentPerformance {
        private String studentId;
        private String studentName;
        private double attendancePercentage;
        private double averageGrades;
        private double dropoutRiskScore;

        public StudentPerformance(String studentId, String studentName, double attendancePercentage, double averageGrades, double dropoutRiskScore) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.attendancePercentage = attendancePercentage;
            this.averageGrades = averageGrades;
            this.dropoutRiskScore = dropoutRiskScore;
        }

        public String getStudentId() {
            return studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public double getAttendancePercentage() {
            return attendancePercentage;
        }

        public double getAverageGrades() {
            return averageGrades;
        }

        public double getDropoutRiskScore() {
            return dropoutRiskScore;
        }
    }

    // Interface representing a data source for retrieving student performance data
    public interface StudentPerformanceDataSource {
        List<StudentPerformance> fetchRealTimeStudentPerformance();
    }

    private StudentPerformanceDataSource dataSource;

    public StudentPerformanceDashboard(StudentPerformanceDataSource dataSource) {
        this.dataSource = dataSource;
    }

    // Fetch real-time student performance data
    public List<StudentPerformance> getRealTimeStudentPerformance() {
        return dataSource.fetchRealTimeStudentPerformance();
    }

    // Generate dashboard view (simple text-based representation for demonstration)
    public void displayDashboard() {
        List<StudentPerformance> performanceList = getRealTimeStudentPerformance();
        System.out.println("Academic Advisor Dashboard - Real-Time Student Performance Analytics");
        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-15s %-25s %-15s %-15s %-20s%n", "Student ID", "Student Name", "Attendance (%)", "Grades", "Dropout Risk Score");
        System.out.println("---------------------------------------------------------------------");
        for (StudentPerformance sp : performanceList) {
            System.out.printf("%-15s %-25s %-15.2f %-15.2f %-20.2f%n",
                    sp.getStudentId(),
                    sp.getStudentName(),
                    sp.getAttendancePercentage(),
                    sp.getAverageGrades(),
                    sp.getDropoutRiskScore());
        }
    }
}
