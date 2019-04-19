public class Book{
    public String title;
    public String textContents;
    public int numPages;
    public double printingCost;

    // Accessors
    public String getTitle(){
        return title;
    }
    public String getContents(){
        return textContents;
    }
    public double getPrintingCost(){
        return printingCost;
    }
    public int getPages(){
        return numPages;
    }

    // default constructor
    public Book(){
        this.title = "";
        this.textContents = "";
        this.numPages = 0;
        this.printingCost = 0.0;
    }
    public Book(String c, String t){
        this.textContents = c;
        this.title = t;
        int count = 1;
        String str = c + t;
        int length = str.length();
        for (char rand : str.toCharArray()){
            if (Character.isLetterOrDigit(rand)){
                count += 1;
            }
        }
        this.printingCost = count * 0.5;
        // calculation for number of pages
        int basePage = length/5;
        int addPage = length%5;
        int set = 0;
        if (addPage>0){
            set = 1;
        }
        this.numPages = basePage + set;
    }
    public void print(){
        System.out.println("Title: " + title);
        System.out.println("Body: " + textContents);
        System.out.println("Cost: $" + printingCost);
        System.out.println("Pages: " + numPages);
    }
}