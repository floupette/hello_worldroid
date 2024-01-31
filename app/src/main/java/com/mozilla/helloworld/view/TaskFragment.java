package com.mozilla.helloworld.view;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mozilla.helloworld.MainActivity;
import com.mozilla.helloworld.R;

public class TaskFragment extends Fragment {
    public TaskFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_task, container, false);
    }

    private ListView listView;

    private TaskAdapter taskAdapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = view.findViewById(R.id.tasks_list_view);
        FloatingActionButton floatingActionButton = view.findViewById(R.id.add_task_button);
        ((MainActivity) requireActivity()).addTask("Android Course");
        floatingActionButton.setOnClickListener(v -> openDialogAddTask());
        taskAdapter = new TaskAdapter(
                requireActivity(),
                R.layout.task_item,
                ((MainActivity) requireActivity()).getTasks());
        listView.setAdapter(taskAdapter);
        listView.setOnItemClickListener((parent, view1, position, id) -> {
            //TODO
        });
    }

    private void openDialogAddTask() {
        EditText editText = new EditText(getContext());
        AlertDialog dialog = new AlertDialog
                .Builder(getContext())
                .setTitle("Add a new task")
                .setMessage("Whatcha wanna do?")
                .setView(editText)
                .setPositiveButton("Add", (dialogInterface, i) -> {
                    ((MainActivity) requireActivity()).addTask(editText.getText().toString());
                    taskAdapter.notifyDataSetChanged();
                })
                .setNegativeButton(("Cancel"), null)
                .create();
        dialog.show();
    }
}