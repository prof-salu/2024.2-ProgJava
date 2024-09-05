public class TiposPrimitivos {
    //psvm + tab ==> Função main
    public static void main(String[] args) {
        //Tipos primitivos
        //int, float, boolean, char
        
        //Inteiros
        byte a = 127;       //1 byte
        short b = 1200;     //2 bytes              
        int c = 20;    //4 bytes
        long d = 20000000000L;  //8 bytes
        
        //Reais
        float e = 92379;    //4 bytes
        double f = 23223.5;   //8 bytes
        
        //Caractere
        char g = 'g';
        
        //Lógica [true | false]
        boolean h = false;
        
        //String [Não é um tipo primitivo no JAVA]
        String nome = "Juca";
        
        //Type casting
        //Conversão explicita
        long x = 20000000000L;
        int y = (int) x;
        
        int b1 = 1;
        byte b2 = (byte) b1;
        
        //sout + TAB ==> System.out.println
        System.out.println(b2);
        
        //Conversão implicita
        int z = 11;
        long w = z;
    }
    
    //202208650406 - Luis felipe gouveia 
    //202203833049 - Joao victor silva
    //202202154903 - Erivaldo Dourado Marinho
}