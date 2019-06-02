package com.msproject.myhome.thirdteenager.CustomObject;

import com.msproject.myhome.thirdteenager.CustomObject.Bucket;
import com.msproject.myhome.thirdteenager.CustomObject.Comment;

import java.util.ArrayList;

public class SharedBucket extends Bucket {
    String writer;
    int like;
    String chatURL;
    ArrayList<Comment> comments;

    public SharedBucket(String name, String imgURL, String description) {
        super(name, imgURL, description);
    }

    public SharedBucket(String name, String imgURL, String description, String writer, String chatURL) {
        super(name, imgURL, description);
        this.writer = writer;
        this.chatURL = chatURL;
        this.comments = new ArrayList<>();
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getChatURL() {
        return chatURL;
    }

    public void setChatURL(String chatURL) {
        this.chatURL = chatURL;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "SharedBucket{" +
                "writer='" + writer + '\'' +
                ", like=" + like +
                ", chatURL='" + chatURL + '\'' +
                ", comments=" + comments +
                '}';
    }
}
