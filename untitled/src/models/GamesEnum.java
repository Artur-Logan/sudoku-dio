package models;

public enum GamesEnum {

    NON_STARTED("não iniciado"),
    INCOMPLETE("incompleto"),
    COMPLETE("completo");

    private String label;

    GamesEnum(final String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
