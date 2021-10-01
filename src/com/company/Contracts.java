package com.company;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contracts {
    private final List<Contract> contracts;

    public Contracts(){
        contracts = new ArrayList<>();
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void add(Contract contract){
        this.contracts.add(contract);
    }

    public void remove(Contract contract){
        this.contracts.remove(contract);
    }

    @Override
    public String toString() {
        return "Contracts{" + contracts + "," + '}';
    }

    public void RandomContract(int n){
        for (int i = 0; i < n; i++){
            contracts.add(Contract.generate());
        }
    }

    public Contracts findTerm_5day(){
        Contracts term_five = new Contracts();
        for (Contract contract : this.contracts){
            if (Duration.between(contract.startDate.plusDays(contract.termDate), LocalDateTime.now()).toDays() >= 1 &&
                    Duration.between(contract.startDate.plusDays(contract.termDate), LocalDateTime.now()).toDays() <= 5){
                term_five.add(contract);
            }
        }
        return term_five;
    }
}
