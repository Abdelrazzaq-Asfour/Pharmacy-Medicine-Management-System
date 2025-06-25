import java.util.*;

public class Pharmacy {
    private List<Medicine> medicines;

    public Pharmacy() {
        medicines = new ArrayList<>();
    }

    public void addMedicine(Medicine med) {
        medicines.add(med);
    }

    public void sellMedicine(String id, int quantity) {
        for (Medicine med : medicines) {
            if (med.getId().equals(id)) {
                med.decreaseQuantity(quantity);
                return;
            }
        }
    }

    public void restockMedicine(String id, int quantity) {
        for (Medicine med : medicines) {
            if (med.getId().equals(id)) {
                med.increaseQuantity(quantity);
                return;
            }
        }
    }

    public void checkExpiry(String todayDate) {
        System.out.println("Checking expired medicines...");
        for (Medicine med : medicines) {
            if (med.isExpired(todayDate)) {
                System.out.println("Expired: " + med);
            }
        }
    }

    public void showAllMedicines() {
        for (Medicine med : medicines) {
            System.out.println(med);
        }
    }

    public void searchAlternatives(String scientificName) {
        System.out.println("Alternatives for: " + scientificName);
        for (Medicine med : medicines) {
            if (med.getScientificName().equalsIgnoreCase(scientificName)) {
                System.out.println("- " + med.getCommercialName());
            }
        }
    }
}
