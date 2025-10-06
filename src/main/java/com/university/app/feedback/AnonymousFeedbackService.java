package com.university.app.feedback;

import java.util.ArrayList;
import java.util.List;

// Class representing anonymous feedback with text and rating
public class Feedback {
    private String text;
    private int rating; // e.g., rating on a scale of 1 to 5

    public Feedback(String text, int rating) {
        this.text = text;
        this.rating = rating;
    }

    public String getText() {
        return text;
    }

    public int getRating() {
        return rating;
    }
}

// Service to handle anonymous course feedback submissions
public class AnonymousFeedbackService {
    private List<Feedback> feedbackList;

    public AnonymousFeedbackService() {
        this.feedbackList = new ArrayList<>();
    }

    // Submit anonymous feedback
    public void submitFeedback(String text, int rating) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
        Feedback feedback = new Feedback(text, rating);
        feedbackList.add(feedback);
        System.out.println("Received anonymous feedback: " + text + " with rating: " + rating);
    }

    // Get all feedbacks (without any student identifiers)
    public List<Feedback> getAllFeedback() {
        return new ArrayList<>(feedbackList);
    }
}

// Example usage
class UniversityAppFeedback {
    public static void main(String[] args) {
        AnonymousFeedbackService feedbackService = new AnonymousFeedbackService();

        feedbackService.submitFeedback("Great course, learned a lot!", 5);
        feedbackService.submitFeedback("Could use more practical examples.", 3);

        System.out.println("All collected anonymous feedback:");
        for (Feedback f : feedbackService.getAllFeedback()) {
            System.out.println("Feedback: " + f.getText() + ", Rating: " + f.getRating());
        }
    }
}
