package com.mozilla.helloworld;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import com.mozilla.helloworld.domain.Task;

public class MainActivity extends AppCompatActivity {

    private final ArrayList<Task> tasks = new ArrayList<>();

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void addTask(String task) {
        this.tasks.add(new Task(null, null, task));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}