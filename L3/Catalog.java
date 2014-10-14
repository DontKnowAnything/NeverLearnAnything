import java.util.ArrayList;
public class Catalog
{
   public final int MAX=100;
   private ArrayList<CatalogItem>catalogItems;
   public Catalog()
   {
      catalogItems=new ArrayList<CatalogItem>(0);
      
   }
   public void add(CatalogItem newItem)
   {
      
   }
   public void add(int newId,String newDesc)
   {
      int aId=newId;
      String nD=newDesc;
      CatalogItem ci;
      
      for(int i=0;i<1;i++)
      {
         ci=new CatalogItem(aId,nD);
         ci.setItemId(aId);
         catalogItems.add(ci);
      }
   }
   public void remove(int id)
   {
      int rId=id;
      CatalogItem cr;
      for(int i=0;i<1;i++)
      {
         //catalogItems.remove(rId);
         //cr=new CatalogItem(rId);
         catalogItems.get(rId);
         //cr.setItemId(rId);
         //catalogItems.remove(cr);
         //cr.setItemId(rId);
         catalogItems.remove(rId);
      }
   }
   public String find(String keyword)
   {
      String key=keyword;
      String found;
      if (catalogItems.contains(key))
      {
         found="Found";
      }
      return key;
   }
   public String toString()
   {
      String s="";
      s+=catalogItems.size();
      
      s+=catalogItems.toString();
      return s;
   }
   public boolean equals(Catalog obj)
   {
      boolean e=false;
      Catalog fO=new Catalog();
      if(fO==obj)
      {
         e=true;
      }
      else
      {
         e=false;
      }
      return e;
   }
}