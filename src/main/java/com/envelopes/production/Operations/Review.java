package com.envelopes.production.Operations;

import com.envelopes.production.Operations.PriorityScale;

public class Review {

     private PriorityScale scale;
     private String comments;

    public Review(PriorityScale scale, String comments) {
        this.scale = scale;
        this.comments = comments;
    }

    public PriorityScale getScale() {
        return scale;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Review{" +
                "scale=" + scale +
                ", comments='" + comments + '\'' +
                '}';
    }

}
