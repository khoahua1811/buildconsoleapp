package models;
import java.util.Date;
public class Dependent extends Customer {
    private PolicyHolder policyHolder;

    public Dependent(String id, String fullName, PolicyHolder policyHolder) {
        super(id, fullName);
        this.policyHolder = policyHolder;
    }

    // Getter and setter for policyHolder (inherited getters/setters for id and fullName)
}
