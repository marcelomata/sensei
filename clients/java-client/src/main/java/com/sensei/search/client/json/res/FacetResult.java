package com.sensei.search.client.json.res;

public class FacetResult {
    private String value;
    private Boolean selected  = false;
    private Integer count;
    @Override
    public String toString() {
        return "FacetResult [value=" + value + ", selected=" + selected + ", count=" + count + "]";
    }
    public String getValue() {
      return value;
    }
    public Boolean getSelected() {
      return selected;
    }
    public Integer getCount() {
      return count;
    }

}
