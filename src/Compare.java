public class Compare{
  
    public int comparePreis(Videospiele v1, Videospiele v2){
      if(v1.getPreis() < v2.getPreis()){
        return -1;
      }
      if(v1.getPreis() > v2.getPreis()){
        return 1;
      }
      if(v1.getPreis() == v2.getPreis()){
        return 0;
      }


    return 0;
  }
  public int comparePublisher(Videospiele v1, Videospiele v2){
      int i = v1.getPublisher().compareTo(v2.getPublisher());
    if (i<0) return -1;
    if (i>0) return 1;
    return 0;
  }











}
