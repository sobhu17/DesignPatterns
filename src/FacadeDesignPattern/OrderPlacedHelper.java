package FacadeDesignPattern;

import FacadeDesignPattern.OrderPlacement.InventoryService;
import FacadeDesignPattern.OrderPlacement.LogisticService;
import FacadeDesignPattern.OrderPlacement.NotificationService;
import FacadeDesignPattern.OrderPlacement.SellerService;

public class OrderPlacedHelper {

    LogisticService logisticService = new LogisticService();
    InventoryService inventoryService = new InventoryService();
    SellerService sellerService = new SellerService();
    NotificationService notificationService = new NotificationService();

    public void onOrderPlacement(){
        logisticService.updateLogistics();

        inventoryService.inventoryUpdate();

        sellerService.notifySeller();

        notificationService.sendNotificationToUser();
    }
}
