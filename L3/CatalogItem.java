public class CatalogItem{
   private int itemId;
   private String description;
   public CatalogItem()
   {
      itemId=0;
      description="";
   }
   public CatalogItem(int iD,String cD)
   {
      int oID=iD;
      itemId=oID;
      
      String d=cD;
      description=d;
   }
   public int getItemId()
   {
      int gIi=itemId;
      return gIi;
   }
   public void setItemId(int pItemId)
   {
      int oItemId=pItemId;
      itemId=oItemId;
   }
   public String getDescription()
   {
      String gD=description;
      return gD;
   }
   public void setDesc(String newDesc)
   {
      String sD=newDesc;
      description=sD;
   }
   public String toString()
   {
      String tS="";
      tS+=getItemId()+" "+getDescription();
      return tS;
   }
   public boolean equals(CatalogItem o)
   {
      o=new CatalogItem();
      boolean b=false;
      if((getItemId()==o.getItemId())&&(description).equals(o.description))
      {
         b=true;
      }
      else
      {
         b=false;
      }
      return b;
   }
}