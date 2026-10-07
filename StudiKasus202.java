import java.util.Scanner;

public class StudiKasus202{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String studentName;
        String typeOfActivity;
        int numberOfUploadedDoc = 0;
        int winnerRank = 0;
        int fundingStats = 0;

        System.out.print("Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Activity(BELMAWA/BAKORMA/Mandiri/Other): ");
        typeOfActivity = sc.nextLine();

        if(typeOfActivity.equalsIgnoreCase("BELMAWA") || typeOfActivity.equalsIgnoreCase("BAKORMA") || typeOfActivity.equalsIgnoreCase("MANDIRI")){
            System.out.println("Insert winner rank (1-3, 0 if not): ");
            winnerRank = sc.nextInt();
            System.out.print("Enter amount of documents: ");
            numberOfUploadedDoc = sc.nextInt();
        } if (winnerRank >= 1 && winnerRank <= 3){
            if (numberOfUploadedDoc == 4){
                System.out.println("Fund granted!");
            } else{
                System.out.println("Award not given to " + studentName + ".");
                System.out.println("Incomplete documents (kurang " + (4 - numberOfUploadedDoc + "document."));
            } 
        } else if (typeOfActivity.equalsIgnoreCase("PKM")){
            System.out.println("Enter PKM funding status: ");
            fundingStats = sc.nextInt();
            System.out.print("Enter amount of documents: ");
            numberOfUploadedDoc = sc.nextInt();
            if (fundingStats == 1){
                if (numberOfUploadedDoc == 4){
                    System.out.println("Fund granted!");
                } else {
                    System.out.println("Award not given to " +studentName + ".");
                    System.out.println("Incomplete documents (kurang " + (4 - numberOfUploadedDoc + "document."));
                }
            } else {
                System.out.println("Award not given to " + studentName + ".");
                System.out.println("Not selected for funding");
            }
        } else {
                System.out.println("Award not given to " + studentName + ".");
                System.out.println("Activites outside not receive fund");
            }

        sc.close()
    }
}