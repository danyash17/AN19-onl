package NikitaVecherski.lesson7;

import java.util.Random;

public class Patient {

    private Integer illnes;
    private boolean cured;
    private String name;
    private TreatmentPlan plan = null;

    public Patient(String name) {
        Random random = new Random();
        illnes = random.nextInt(1, 5);
        this.name = name;
    }

    public void setIllnes(Integer illnes) {
        this.illnes = illnes;
    }

    public Integer getIllnes() {
        return illnes;
    }

    public void setCured(boolean cured) {
        this.cured = cured;
    }


    public String getProfile() {
        return "Name: " + name + "\n" + "Illness: " + illnes + "\nCured: " + cured;
    }

    public TreatmentPlan getPlan() {
        return plan;
    }

    public void setPlan(TreatmentPlan plan) {
        this.plan = plan;
    }


}



