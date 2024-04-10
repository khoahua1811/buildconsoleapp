package managers;

import models.Claim;

import java.util.List;
public interface ClaimProcessManager {

    /**
     * Add a new insurance claim
     * @param claim The insurance claim to be added
     */
    void add(Claim claim);

    /**
     * Update information of an insurance claim
     * @param claim The insurance claim with updated information
     */
    void update(Claim claim);

    /**
     * Delete an insurance claim
     * @param id The ID of the insurance claim to be deleted
     */
    void delete(String id);

    /**
     * Get information of an insurance claim by ID
     * @param id The ID of the insurance claim
     * @return The insurance claim with corresponding ID, or null if not found
     */
    Claim getOne(String id);

    /**
     * Get a list of all insurance claims
     * @return A list of all insurance claims
     */
    List<Claim> getAll();
}
