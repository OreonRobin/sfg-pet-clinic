package io.oreon.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    public Vet(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Vet() {
    }

    public void addSpecialty(Specialty specialty) {
        this.specialties.add(specialty);

    }

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
