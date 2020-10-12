package com.oak.java;

/**
 * @author 季于东
 * @date 2019/9/21
 */
public class Heros {

    private String name;
    private String gender;
    private String faction;
    private String skill_1;
    private String skill_2;
    private String skill_3;
    private String passive;

    public Heros(String name, String gender, String faction, String skill_1, String skill_2, String skill_3, String passive) {
        this.name = name;
        this.gender = gender;
        this.faction = faction;
        this.skill_1 = skill_1;
        this.skill_2 = skill_2;
        this.skill_3 = skill_3;
        this.passive = passive;
    }

    public Heros() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public String getSkill_1() {
        return skill_1;
    }

    public void setSkill_1(String skill_1) {
        this.skill_1 = skill_1;
    }

    public String getSkill_2() {
        return skill_2;
    }

    public void setSkill_2(String skill_2) {
        this.skill_2 = skill_2;
    }

    public String getSkill_3() {
        return skill_3;
    }

    public void setSkill_3(String skill_3) {
        this.skill_3 = skill_3;
    }

    public String getPassive() {
        return passive;
    }

    public void setPassive(String passive) {
        this.passive = passive;
    }

    @Override
    public String toString() {
        return "<tr>" +
                "<td>" + name + "</td>" +
                "<td>" + gender + "</td>" +
                "<td>" + faction + "</td>" +
                "<td>" + skill_1 + "</td>" +
                "<td>" + skill_2 + "</td>" +
                "<td>" + skill_3 + "</td>"+
                "<td>" + passive + "</td>"+
                "</tr>";
    }
}
