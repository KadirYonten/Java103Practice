class RunNotepad {
   public static void main(String args[]) {
      Runtime rt = Runtime.getRuntime();
      Process proc;
      try {
         proc = rt.exec("notepad");
         proc.waitFor();    //try removing this line
      } catch (Exception e) {
         System.out.println("notepad açılamıyor.");
      }
   }
}
