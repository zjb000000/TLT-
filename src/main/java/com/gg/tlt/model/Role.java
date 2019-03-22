package com.gg.tlt.model;

public class Role {
    String roleName;
    int geoSearch;
    int jobSearch;
    int salSearch;
    int occDis;
    int eduDis;
    int talDis;

    public Role(String roleName, int geoSearch, int jobSearch, int salSearch, int occDis, int eduDis, int talDis, int geoDis) {
        this.roleName = roleName;
        this.geoSearch = geoSearch;
        this.jobSearch = jobSearch;
        this.salSearch = salSearch;
        this.occDis = occDis;
        this.eduDis = eduDis;
        this.talDis = talDis;
        this.geoDis = geoDis;
    }

    public Role() {
    }

    int geoDis;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getGeoSearch() {
        return geoSearch;
    }

    public void setGeoSearch(int geoSearch) {
        this.geoSearch = geoSearch;
    }

    public int getJobSearch() {
        return jobSearch;
    }

    public void setJobSearch(int jobSearch) {
        this.jobSearch = jobSearch;
    }

    public int getSalSearch() {
        return salSearch;
    }

    public void setSalSearch(int salSearch) {
        this.salSearch = salSearch;
    }

    public int getOccDis() {
        return occDis;
    }

    public void setOccDis(int occDis) {
        this.occDis = occDis;
    }

    public int getEduDis() {
        return eduDis;
    }

    public void setEduDis(int eduDis) {
        this.eduDis = eduDis;
    }

    public int getTalDis() {
        return talDis;
    }

    public void setTalDis(int talDis) {
        this.talDis = talDis;
    }

    public int getGeoDis() {
        return geoDis;
    }

    public void setGeoDis(int geoDis) {
        this.geoDis = geoDis;
    }
}
