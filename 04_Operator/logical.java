public class logical {
    public static void main(String[] args) {
        
        int x=7;
        int y=5;
        int a=5;
        int b=9;

    //    boolean result = a<b && x>y;
       boolean result1 = a>b || x>y || a>1;
       boolean result2 = a>b ;

        System.out.println(result1);
        System.out.println(!result2);
    }
}


/*

Valid Variable Names

int age;
int age1;
int studentAge;
int _count;
int $price;
int totalMarks;

Invalid Variable Names

int 1age;        // Starts with a digit
int my age;      // Contains a space
int first-name;  // Contains a hyphen (-)
int class;       // Java keyword
int @price;      // Invalid character

*/