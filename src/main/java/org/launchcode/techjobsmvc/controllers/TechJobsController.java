package org.launchcode.techjobsmvc.controllers;

import org.launchcode.techjobsmvc.models.JobData;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

public class TechJobsController {

    static HashMap<String, String> actionChoices = new HashMap<>();
    static HashMap<String, String> columnChoices = new HashMap<>();
    static HashMap<String, Object> tableChoices = new HashMap<>();


    public TechJobsController() {
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");

        tableChoices.put("employer", JobData.getAllEmployers());
        tableChoices.put("location", JobData.getAllLocations());
        tableChoices.put("positionType", JobData.getAllPositionTypes());
        tableChoices.put("coreCompetency", JobData.getAllCoreCompetency());
    }

    @ModelAttribute("actionChoices")
    public static HashMap<String, String> getActionChoices(Model model) {
        model.addAttribute("actions", actionChoices);
        return actionChoices;
    }

    @ModelAttribute("columnChoices")
    public static HashMap<String, String> getColumnChoices(Model model) {
        model.addAttribute("columns", columnChoices);
        return columnChoices;
    }

    @ModelAttribute("tableChoices")
    public static HashMap<String, Object> getTableChoices(Model model) {
        model.addAttribute("tableChoices", tableChoices);
        model.addAttribute("employers", JobData.getAllEmployers());
        model.addAttribute("locations", JobData.getAllLocations());
        model.addAttribute("positions", JobData.getAllPositionTypes());
        model.addAttribute("skills", JobData.getAllCoreCompetency());
        return tableChoices;
    }

}