package tiDo.Aims;

import java.util.List;
import java.util.Scanner;

import tiDo.Cart.Cart;
import tiDo.DigitalVideoDisc.DigitalVideoDisc;
import tiDo.LoginInformationDatabase.LoginInformationDatabase;
import tiDo.Store.Store;

public class Aims {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	LoginInformationDatabase loginDatabase = new LoginInformationDatabase();
    	Store store = new Store();
    	Cart cart = new Cart();
    	
    	System.out.printf("(1) - User, (2) - Manager: ");
    	int number = scanner.nextInt();
    	if (number == 1) {
    		
    	} else if (number == 2) {
    		boolean loginCondition = false;
    		loginDatabase.register("dangduckhai44", "dream1221");
    		loginCondition = loginDatabase.logIn("dangduckhai44", "dream1221");
    		if (loginCondition) {
    			store.addNewDVDs(loginCondition, "1X3DS", "Brotato", "Adventure", 60000);
    			store.addNewDVDs(loginCondition, "1X3DS", "Lien Minh huyen Thoai", "Adventure", 2000);
    			store.addNewDVDs(loginCondition, "1X3DS", "Dota2", "Adventure", 80000);
    		}
    		
//    		store.displayListOfDVDs();
    		DigitalVideoDisc[] result = store.searchByCategory("Adventure");
    		for (DigitalVideoDisc dvd : result) {
    			cart.addDVDToCart(dvd);
    		}
    		
    		cart.filterDVDByID("1X3DS");
    		
    	}
    	
    }
}
