package cl.falabella.b2b.intol.enumerator;

public enum PaisEnum {
    
    CHILE(1);
    
    private int code;
    private PaisEnum(int c) {
      code = c;
    }
    
    public int getCode() {
      return code;
    }   
}