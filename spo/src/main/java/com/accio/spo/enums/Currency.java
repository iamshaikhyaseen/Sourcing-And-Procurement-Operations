package com.accio.spo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Currency {

    INR("Indian Rupee", "₹"),
    USD("US Dollar", "$"),
    EUR("Euro", "€"),
    GBP("British Pound", "£"),
    AED("UAE Dirham", "د.إ"),
    SAR("Saudi Riyal", "ر.س"),
    CAD("Canadian Dollar", "C$"),
    AUD("Australian Dollar", "A$"),
    JPY("Japanese Yen", "¥"),
    CNY("Chinese Yuan", "¥"),
    SGD("Singapore Dollar", "S$"),
    CHF("Swiss Franc", "CHF"),
    NZD("New Zealand Dollar", "NZ$"),
    PKR("Pakistani Rupee", "₨"),
    BDT("Bangladeshi Taka", "৳"),
    LKR("Sri Lankan Rupee", "Rs"),
    NPR("Nepalese Rupee", "रू"),
    KWD("Kuwaiti Dinar", "د.ك"),
    QAR("Qatari Riyal", "ر.ق"),
    OMR("Omani Rial", "ر.ع."),
    BHD("Bahraini Dinar", "د.ب"),
    MYR("Malaysian Ringgit", "RM"),
    THB("Thai Baht", "฿"),
    IDR("Indonesian Rupiah", "Rp"),
    KRW("South Korean Won", "₩"),
    TRY("Turkish Lira", "₺"),
    RUB("Russian Ruble", "₽"),
    ZAR("South African Rand", "R"),
    BRL("Brazilian Real", "R$"),
    MXN("Mexican Peso", "$");

    private final String displayName;
    private final String symbol;

}
