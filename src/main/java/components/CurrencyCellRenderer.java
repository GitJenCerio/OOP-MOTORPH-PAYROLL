
package components;

import javax.swing.table.DefaultTableCellRenderer;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyCellRenderer extends DefaultTableCellRenderer {

    private NumberFormat currencyFormat;

    public CurrencyCellRenderer() {
        currencyFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());
    }

    @Override
    protected void setValue(Object value) {
        if (value instanceof Number) {
            value = currencyFormat.format(value);
        }
        super.setValue(value);
    }
}
