public class CompanyTest {
    public static void main(String[] args) {
        ITDepartment kahar = new ITDepartment("Kahar");
        HR lina = new HR("Lina");
        HelpDesk sam = new HelpDesk("Sam");

        Company<ITDepartment> actionet = new Company("ACTIONET inc.");

        actionet.addEmployees(kahar);

        System.out.println(actionet.runDepartment());



    }
}
