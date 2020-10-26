package selab.threetier.presentation;

import org.json.JSONObject;
import selab.threetier.logic.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AddTaskPresentation extends JSONPresentation {

    @Override
    public JSONObject getData(String method, InputStream body) throws IOException {
        if (!method.equals("POST"))
            throw new IOException("Method not supported");

        JSONObject request = new JSONObject(new BufferedReader(new InputStreamReader(body)).lines().collect(Collectors.joining("\n")));

        Task newTask = new Task();
        newTask.setTitle(request.getString("title"));
        try {
            newTask.setStart(new SimpleDateFormat("y-M-d H:m:s").parse(request.getString("start")));
            newTask.setEnd(new SimpleDateFormat("y-M-d H:m:s").parse(request.getString("end")));
        } catch (ParseException ex) {
            throw new IOException("Invalid date/time format");
        }
        if (newTask.getEndTime().compareTo(newTask.getStartTime()) <= 0){
            throw new IOException("End time must be after Start time");
        }

        ArrayList<Task> allTasks = Task.getAll();
    //        for(Task t: allTasks) {
    //            if (t.getStartDate().equals(newTask.getStartDate())) {
    //                if (t.getStartTime().compareTo(newTask.getStartTime()) < 0) {
    //                    if ((newTask.getStartTime().compareTo(t.getEndTime()) <= 0  && t.getStartTime().compareTo(newTask.getStartTime()) <= 0) || (newTask.getEndTime().compareTo(t.getEndTime()) <= 0 && t.getStartTime().compareTo(newTask.getEndTime()) <= 0))
    //                        throw new IOException("Overlap with previous dates");
    //                }
    //            }
    //        }
        newTask.save();

        Map<String, String> result = new HashMap<>();
        result.put("success", "true");
        return new JSONObject(result);
    }
}
