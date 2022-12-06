package chapter09;

public class Stock
{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String symbolInput, String nameInput, double closingInput, double currentInput)
    {
        symbol = symbolInput;
        name = nameInput;
        currentPrice = currentInput;
        previousClosingPrice = closingInput;
    }

    double getChangePercent()
    {
        double percent = (currentPrice / previousClosingPrice) * 100;
        return percent;
    }
}
