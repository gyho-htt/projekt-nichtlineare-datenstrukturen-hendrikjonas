class Game {
  private int erscheinungsjahr, preis;
  private String titel, publisher, genre;
  //Grafikkarten mindestanforderung
  public Game(int pErscheinungsjahr, int pPreis, String pTitel, String pPublisher, String pGenre){
    this.preis = pPreis;
    this.erscheinungsjahr = pErscheinungsjahr;
    this.titel = pTitel;
    this.publisher = pPublisher;
    this.genre = pGenre;
  }

  public int getErscheinungsjahr(){
    return erscheinungsjahr;
  }
  
  public int getPreis(){
    return preis;
  }
 
  public String getPublisher(){
    return publisher;
  }
  
  public String getGenre(){
    return genre;
  }
  
  public String getTitel(){
    return titel;
  }
}