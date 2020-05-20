package org;

public class CompanyType {
    int id;
    String name_short;

    @Override
    public String toString() {
        return "CompanyType{" +
                "id=" + id +
                ", name_short='" + name_short + '\'' +
                '}';
    }
}
