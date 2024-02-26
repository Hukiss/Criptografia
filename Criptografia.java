public class Criptografia {

    private int value1, value2, value3, value4;
    private int valor;

    public Criptografia(int valorInteiro){
        this.Criptografando(valorInteiro);
    }

    public void Criptografando(int valorInteiro){

        this.setValue1(( valorInteiro / 1000) + 7) ;
        this.setValue2(((valorInteiro % 1000) / 100) + 7);
        this.setValue3(((valorInteiro % 100 ) / 10) + 7);
        this.setValue4((valorInteiro % 10) + 7);

        String show = ""+ getValue3()+getValue4()+getValue1()+getValue2();
        valor = Integer.parseInt(show);
    }

    public String showApresenta() {
        return "Valor Criptografado: "+valor;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue1() {
        return value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
    }

    public int getValue3() {
        return value3;
    }

    public void setValue4(int value4) {
        this.value4 = value4;
    }

    public int getValue4() {
        return value4;
    }
}
