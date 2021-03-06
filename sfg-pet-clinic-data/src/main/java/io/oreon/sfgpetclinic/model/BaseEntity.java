package io.oreon.sfgpetclinic.model;

import java.io.Serializable;

public abstract class BaseEntity implements Serializable {
    private Long id;

    public BaseEntity() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNew() {
        return this.getId() == null;
    }
}
