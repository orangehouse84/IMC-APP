/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BMIHistoryList {
    private static BMIHistoryList instance;
    private List<BMIHistory> historyList;

    private BMIHistoryList() {
        historyList = new ArrayList<>();
    }

    public static synchronized BMIHistoryList getInstance() {
        if (instance == null) {
            instance = new BMIHistoryList();
        }
        return instance;
    }

    public void addHistory(BMIHistory history) {
        historyList.add(history);
    }

    public List<BMIHistory> getHistoryForUser(String username) {
        // Replace this with your actual database logic to retrieve history for the specific user
        // For now, filtering the in-memory list based on username (assuming BMIHistory has a username property)
        return historyList.stream()
                .filter(history -> history.getUsername().equals(username)) 
                .collect(Collectors.toList());
    }
}

