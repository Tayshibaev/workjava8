package org;

import com.google.gson.annotations.SerializedName;

public class Company {
    int id;
    String code;
    @SerializedName("name_full")
    String namef;
    @SerializedName("company_type")
    CompanyType type;


}
