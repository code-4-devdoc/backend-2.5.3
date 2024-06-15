// ResumeDTO.java
package com.devdoc.backend.dto;

import java.util.List;

public class ResumeDTO {
    private int id;
    private String title;
    private List<SkillDTO> skills;

    public ResumeDTO() {
    }

    public ResumeDTO(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public ResumeDTO(int id, String title, List<SkillDTO> skills) {
        this.id = id;
        this.title = title;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SkillDTO> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillDTO> skills) {
        this.skills = skills;
    }
}
