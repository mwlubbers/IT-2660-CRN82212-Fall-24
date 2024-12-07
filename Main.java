class Main {
  public static void main(String[] args) {
    //**Step 3:** Create a map called creditHours.
    var creditHours = new MyHashMap();
    //*Step 4:** put() the following values:
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);
    
//    **Step 5:** Check for the following values. Display true or false depending on whether or not the map has the key.
    System.out.println("Is IT-1025 in the map? " + 
    creditHours.containsKey("IT-1025"));
    System.out.println("Is IT-2110 in the map? " + 
    creditHours.containsKey("IT-2110"));
    
//    **Step 6:** Print all of the values in the map.
System.out.println("All of the values in the map: " + creditHours);
    
//      **Step 7:** Remove IT-2030 and IT-1150.
    creditHours.remove("IT-2030");
    creditHours.remove("IT-1150"); 
    
//    **Step 8:** Print all of the values in the map.    
System.out.println("All of the values in the map: " + creditHours);
  }
}