//You are building a basic search feature for an e-commerce platform. Given a list of
// product names and a user search query (string),
// return all products that start with the given query (prefix search), sorted in lexicographical order.




import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] products = {"laptop", "lamp", "phone", "photo frame", "pen", "pencil"};
        String query = in.nextLine();
        List<String> results = search(products, query);
        if(results.isEmpty()){
            System.out.println("No result found");
        }else{
            System.out.println("Search Results for prefix " + query);
            for(String str : results){
                System.out.println(str);
            }
        }

    }
    public static List<String> search(String[] arr, String query){
        List<String> result = new ArrayList<>();
        for(String s : arr){
            String str = s.toLowerCase();
            if(str.startsWith(query)){
                result.add(s);
            }
        }

        Collections.sort(result);
        return result;
    }
}