package org.example;

import java.util.Objects;

public class Heroi {
    private String name;
    private int xp;

    public Heroi() {
        this.name = name;
        this.xp = xp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getXp() {
        return xp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Heroi heroi = (Heroi) o;
        return Objects.equals(name, heroi.name) && Objects.equals(xp, heroi.xp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, xp);
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
