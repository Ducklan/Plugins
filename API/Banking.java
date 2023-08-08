public class Banking {
    private int getBankIndex(int ID){
        WidgetItem bankItem = new BankItemQuery()
                .idEquals(ID)
                .result(client)
                .first();
        if (bankItem != null) {
            return bankItem.getWidget().getIndex();
        }
        return -1;
    }

    private boolean bankOpen() {
        return client.getItemContainer(InventoryID.BANK) != null;
    }
}