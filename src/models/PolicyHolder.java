package models;
import java.util.ArrayList;
import java.util.List;
public class PolicyHolder extends Customer {
    private List<Dependent> dependents;

    public PolicyHolder(String id, String fullName) {
        super(id, fullName);
        this.dependents = new ArrayList<>();
    }

    // Getters and setters for dependents (inherited getters/setters for id and fullName)

    public void addDependent(Dependent dependent) {
        this.dependents.add(dependent);
    }

    // Other methods specific to PolicyHolder functionality (optional)
}
