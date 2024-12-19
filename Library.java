public class Library {
   private String libraryName;
   private String address;
   private String[] bookGenres;
   private String[] librarians;
   private String openingHours;
   private String contactInfo;
   
   
   public Library(String libraryName, String address, String[] bookGenres, String librarians[], String openingHours, String contactInfo) {
       this.libraryName = libraryName;
       this.address = address;
       this.bookGenres = bookGenres;
       this.librarians = librarians;
       this.openingHours = openingHours;
       this.contactInfo = contactInfo;
   }
   
    /Getters/
   public String getLibraryName() {
       return this.libraryName;
   }
   
   public String getAddress() {
       return this.address;
   }
   
   public String getBookGenres() {
       String genres = "";
       for(int i=0; i < bookGenres.length; i++) {
           if(i < bookGenres.length - 1){
               genres += bookGenres[i] + "," + " ";
           } else {
               genres += bookGenres[i];
           }
       }
       return genres;
   }