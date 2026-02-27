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
  

  
  
  
  
  
  
  
  
  
  
}
