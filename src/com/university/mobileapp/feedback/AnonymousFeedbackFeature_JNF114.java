package com.university.mobileapp.feedback;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// Feedback class with text and rating, anonymous ID generated
public class Feedback {
    private final String anonymousId;
    private String courseId;
    private String feedbackText;
    private int rating; // Example rating scale 1 to 5

    public Feedback(String courseId, String feedbackText, int rating) {
        this.anonymousId = UUID.randomUUID().toString();
        this.courseId = courseId;
        this.feedbackText = feedbackText;
        this.rating = rating;
    }

    public String getAnonymousId() {
        return anonymousId;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public int getRating() {
        return rating;
    }
}

// FeedbackManager manages feedback collection storing anonymously
public class FeedbackManager {
    private List<Feedback> feedbackList = new ArrayList<>();

    // Submit feedback anonymously
    public void submitFeedback(String courseId, String feedbackText, int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be 1 to 5");
        }
        Feedback newFeedback = new Feedback(courseId, feedbackText, rating);
        feedbackList.add(newFeedback);
        System.out.println("Thank you for your anonymous feedback!");
    }

    // Retrieve all feedback (for admin use)
    public List<Feedback> getAllFeedback() {
        return new ArrayList<>(feedbackList);
    }
}

// Sample usage for testing feedback submission
class Main {
    public static void main(String[] args) {
        FeedbackManager manager = new FeedbackManager();

        // Students submit feedback anonymously
        manager.submitFeedback("CS101", "Great course, very informative!", 5);
        manager.submitFeedback("MATH201", "Challenging but rewarding", 4);

        // Retrieve and display feedback (admin view)
        for (Feedback fb : manager.getAllFeedback()) {
            System.out.println("Course: " + fb.getCourseId() +
                ", Rating: " + fb.getRating() +
                ", Feedback: " + fb.getFeedbackText() +
                ", Anonymous ID: " + fb.getAnonymousId());
        }
    }
}
