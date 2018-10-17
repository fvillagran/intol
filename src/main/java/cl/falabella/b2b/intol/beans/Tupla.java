package cl.falabella.b2b.intol.beans;

public class Tupla<K,V>
{
   private K key;
   private V value;
   
   public Tupla()
   {
      ;
   }
   
   public Tupla(K key, V value)
   {
      this.key = key;
      this.value = value;
   }

   public void setKey(K key)
   {
      this.key = key;
   }

   public K getKey()
   {
      return key;
   }

   public void setValue(V value)
   {
      this.value = value;
   }

   public V getValue()
   {
      return value;
   }
}
