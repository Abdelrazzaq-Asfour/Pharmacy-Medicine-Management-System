public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        // Add sample medicines
        pharmacy.addMedicine(new Medicine("001", "Panadol", "Paracetamol", 50, "2023-01-01", "2025-01-01"));
        pharmacy.addMedicine(new Medicine("002", "Adol", "Paracetamol", 20, "2023-06-01", "2024-06-30"));
        pharmacy.addMedicine(new Medicine("003", "Brufen", "Ibuprofen", 30, "2023-03-15", "2025-03-15"));

        // Pharmacist operations
        pharmacy.sellMedicine("001", 5);
        pharmacy.restockMedicine("002", 10);
        pharmacy.checkExpiry("2025-01-02");

        // Search for medicine alternatives
        pharmacy.searchAlternatives("Paracetamol");

        // Show all available medicines
        pharmacy.showAllMedicines();
    }
}
