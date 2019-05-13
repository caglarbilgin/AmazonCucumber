package mapping;

public enum MapMethodType {

    CLICK_ELEMENT("click_element"), INPUT_ELEMENT("input_element");

    private final String value;

    MapMethodType(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }
}
