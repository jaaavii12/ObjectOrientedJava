package summits;

import java.util.ArrayList;

public class Summit {

   private String name;
   private int altitude;
   private ArrayList<Report> reports;

   public Summit(String name, int altitude) {
      this.name = name;
      this.altitude = altitude;
      this.reports = new ArrayList<>();
   }

   public void addReport(Report report) {
      this.reports.add(report);
   }

   public String getName() {
      return this.name;
   }

   public double meanDifficultyLevel() {
      double mean = 0;
      for (Report report : reports) {
         mean = mean + report.getDifficultyLevel();
      }
      mean /= reports.size();
      return mean;
   }

   public String toString() {
      if (reports.isEmpty()) {
         return name + ", " + altitude + "m, no ascent reports";
      } else {
         return name + ", " + altitude + "m, " + reports.size()
               + " ascent reports, average difficulty " + meanDifficultyLevel() + "/4";
      }
   }

}