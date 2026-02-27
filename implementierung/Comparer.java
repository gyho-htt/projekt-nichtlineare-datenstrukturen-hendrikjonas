public class Comparer{
  
  public int comparePreis(Game pV1, Game pV2){
    if(pV1.getPreis() < pV2.getPreis()){
      return -1;
    }
    if(pV1.getPreis() > pV2.getPreis()) {
      return 1;
    }
    if(pV1.getPreis() == pV2.getPreis()){
      return 0;
    }
    return 0;
  }
  public int comparePublisher(Game pV1, Game pV2){
      int i = pV1.getPublisher().compareTo(pV2.getPublisher());
    if (i<0) return -1;
    if (i>0) return 1;
    return 0;
  }

  public int compareTitel(Game pV1, Game pV2){
    int i = pV1.getPublisher().compareTo(pV2.getPublisher());
    if (i<0) return -1;
    if (i>0) return 1;
    return 0;
  }

  public int compareGenre(Game pV1, Game pV2){
    int i = pV1.getPublisher().compareTo(pV2.getPublisher());
    if (i<0) return -1;
    if (i>0) return 1;
    return 0;
  }

  public int compareErscheinungsjahr(Game pV1, Game pV2){
    int i = pV1.getPublisher().compareTo(pV2.getPublisher());
    if (i<0) return -1;
    if (i>0) return 1;
    return 0;
  }









}
