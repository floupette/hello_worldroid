package com.mozilla.helloworld.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.mozilla.helloworld.domain.Task;
import com.mozilla.helloworld.R;

import java.util.List;
import java.util.Objects;

public class TaskAdapter extends ArrayAdapter<Task> {

    private final int resourceId;

    public TaskAdapter(@NonNull Context context, int resource, @NonNull List<Task> objects) {
        super(context, resource, objects);
        this.resourceId = resource;
    }

    @NonNull
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        @NonNull Task task = Objects.requireNonNull(getItem(position));
        if ( convertView == null ) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(this.resourceId, parent, false);
        }
        TextView taskTitle = convertView.findViewById(R.id.task_title_text_view);
        taskTitle.setText(task.getTitle());
        return convertView;
    }
}
