package cl.falabella.b2b.intol.service.impl;

import cl.falabella.b2b.intol.service.ParentescoService;

import java.util.HashMap;
import java.util.Map;

public class ParentescoServiceImpl implements ParentescoService
{
   protected Map<String, Integer> codes1;
   protected Map<Integer, String> codes2;
   
   public ParentescoServiceImpl(Map<String, Integer> codes)
   {
      this.codes1 = codes;
      this.codes2 = new HashMap<Integer, String>();
      for(Map.Entry<String, Integer> entry : codes.entrySet())
      {
         codes2.put(entry.getValue(), entry.getKey());
      }
   }

   public int getCode(String parentesco)
   {
      return codes1.get(parentesco);
   }

   public String getCode(int parentesco)
   {
      return codes2.get(parentesco);
   }
}
