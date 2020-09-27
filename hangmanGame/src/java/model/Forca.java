package model;


public class Forca {
    
    private static Forca gibbet;
    
    private String word;
    private char[] hits;
    private char[] errors;
    private int attempts;
    
    private Forca(){
        this.word = "VASSOURA";        
        
        for(int i=0; i < this.word.length();i++){
            hits[i] = "_ ".charAt(i);
        }
        
        this.attempts = 0;
    }
    
    public static Forca getInstance(){
        if(gibbet == null){
            gibbet = new Forca();
        }
        
        return gibbet;
    }
    
    
    public void checkLetter(char letter){
        //Verifica a letra informada
        for(int i=0; i < this.word.length();i++){
            if(this.word.charAt(i) == letter){
                this.hits[i] = letter;
            }
        }
    }   
    
    
    public void updateHits(char letter){
        //Atualiza os acertos
    }
    
    public void updateErrors(char letter){
        //Atualiza os erros
    }
    
    public void updateAttempts(char letter){
        //Atualiza o numero de tentativas
    }
}
