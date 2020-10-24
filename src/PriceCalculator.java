public class PriceCalculator {
    private static final double LOGISTIC_CHARGE = 5;
    private static final double ADDITION_PERCENT = 0.05;

    public double calculatePrice(Ticket ticket) {
        return switch (ticket.getType()) {
            case ONLINE -> calculatePriceWithDiscount(ticket.getBasicPrice(), ticket.getDiscount());
            case STANDARD -> calculatePriceWithLogisticCharge(ticket.getBasicPrice(), ticket.getDiscount(), LOGISTIC_CHARGE);
            case GIFT -> calculatePriceWithLogisticChargeWithAddition(ticket.getBasicPrice(), ticket.getDiscount(), LOGISTIC_CHARGE, ADDITION_PERCENT);
            default -> 0;
        };
    }

    private double calculatePriceWithDiscount(double basicPrice, double discount) {
        return basicPrice - (basicPrice * discount);
    }

    private double calculatePriceWithLogisticCharge(double basicPrice, double discount, double logisticCharge) {
        return calculatePriceWithDiscount(basicPrice, discount) + logisticCharge;
    }

    private double calculatePriceWithLogisticChargeWithAddition(double basicPrice, double discount, double logisticCharge, double additionPercent) {
        double addition = calculatePriceWithDiscount(basicPrice, discount) * additionPercent;
        return calculatePriceWithLogisticCharge(basicPrice, discount, logisticCharge) + addition;
    }

}
