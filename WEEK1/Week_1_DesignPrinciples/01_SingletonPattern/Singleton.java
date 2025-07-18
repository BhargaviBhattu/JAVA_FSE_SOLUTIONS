class Singleton {
   public static Singleton instance;
   private Singleton(){
   }
   public static Singleton getInstance() {
       if (instance == null) {
           synchronized (Singleton.class) {
               if (instance == null) {
                   instance = new Singleton();
               }
           }
       }
       return instance;
   }
   public void displayMsg(){
       System.out.println("Singleton Design Pattern");
   }

}
