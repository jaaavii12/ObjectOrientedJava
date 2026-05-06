package summits;

import java.util.HashMap;

public class SummitCollection {

   private HashMap<String, Summit> summits;

   public SummitCollection() {
      this.summits = new HashMap<>();
   }

   public void add(Summit summit) {
      this.summits.put(summit.getName(), summit);
   }

   public Summit get(String name) {
      return this.summits.get(name);
   }

}