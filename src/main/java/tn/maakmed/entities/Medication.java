package tn.maakmed.entities;

public class Medication {
    private int id;
    private String name;
    private String description;
    private boolean insured;

    public Medication(String name, String description, boolean insured) {
        this.name = name;
        this.description = description;
        this.insured = insured;
    }

    public Medication(int id, String name, String description, boolean insured) {
        this(name, description, insured);
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isInsured() {
        return insured;
    }

    public void setInsured(boolean insured) {
        this.insured = insured;
    }

    @Override
    public String toString() {
        return "Medication{id=%d, name='%s', description='%s', insured=%b}".formatted(id,
                name,
                description,
                insured);
    }

}
