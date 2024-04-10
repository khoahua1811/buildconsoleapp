package models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String id;
    private String fullName;
    private List<InsuranceCard> insuranceCards;

    public Customer(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
        this.insuranceCards = new ArrayList<>();
    }

    // Getters and setters for id, fullName, insuranceCards

    public void addInsuranceCard(InsuranceCard insuranceCard) {
        this.insuranceCards.add(insuranceCard);
    }

    // Other methods specific to models.Customer functionality (optional)
}
