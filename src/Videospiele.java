class Videospiele implements ComparableContent<Videospiele> {
  private int erscheinungsjahr, preis;
  private String titel, publisher, genre;
  Compare vergleicher;
  //Grafikkarten mindestanforderung
  public Videospiele(int pErscheinungsjahr, int pPreis, String pTitel, String pPublisher, String pGenre){
    this.vergleicher = new Compare();
    this.preis = pPreis;
    this.erscheinungsjahr = pErscheinungsjahr;
    this.titel = pTitel;
    this.publisher = pPublisher;
    this.genre = pGenre;
  }
  
  public boolean isGreater(Videospiele pVideospiele, String pAttribut) {
    if (pAttribut.equals("preis")) {
      int pErgebnis = vergleicher.comparePreis(this, pVideospiele);
      if (pErgebnis == 1) return true;
      if (pErgebnis == -1 || pErgebnis == 0) return false;

    }
    return false;

  }
  public boolean isLess(Videospiele pVideospiele){
        return preis < pVideospiele.getPreis();
    }

    public boolean isEqual(Videospiele pVideospiele){
        return preis == pVideospiele.getPreis();
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