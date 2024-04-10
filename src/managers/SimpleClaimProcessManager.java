package managers;

import models.Claim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SimpleClaimProcessManager implements ClaimProcessManager {

    private HashMap<String, Claim> claims;

    public SimpleClaimProcessManager() {
        this.claims = new HashMap<>();
    }

    @Override
    public void add(Claim claim) {
        if (claim == null || claim.getId() == null) {
            throw new IllegalArgumentException("Invalid claim object or ID");
        }
        claims.put(claim.getId(), claim);
    }

    @Override
    public void update(Claim claim) {
        if (claim == null || claim.getId() == null) {
            throw new IllegalArgumentException("Invalid claim object or ID");
        }
        if (!claims.containsKey(claim.getId())) {
            throw new IllegalArgumentException("models.Claim with ID " + claim.getId() + " not found");
        }
        claims.put(claim.getId(), claim);
    }

    @Override
    public void delete(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Invalid claim ID");
        }
        claims.remove(id);
    }

    @Override
    public Claim getOne(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Invalid claim ID");
        }
        return claims.get(id);
    }

    @Override
    public List<Claim> getAll() {
        return new ArrayList<>(claims.values());
    }
}