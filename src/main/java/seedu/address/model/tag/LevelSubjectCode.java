package seedu.address.model.tag;

import seedu.address.logic.parser.exceptions.ParseException;

public enum LevelSubjectCode {
    PE("pe", "PriEng"), // Primary English
    PM("pm", "PriMath"), // Primary Math
    PS("ps", "PriSci"), // Primary Science
    SB("sb", "SecBio"), // Secondary Biology
    SC("sc", "SecChem"), // Secondary Chemistry
    SE("se", "SecEng"), // Secondary English
    SG("sg", "SecGeog"), // Secondary Geography
    SH("sh", "SecHist"), // Secondary History
    SL("sl", "SecLit"), // Secondary Literature
    SM("sm", "SecMath"), // Secondary Math
    SP("sp", "SecPhy"), // Secondary Physics
    TB("tb", "TerBio"), // Tertiary Biology
    TC("tc", "TerChem"), // Tertiary Chemistry
    TE("te", "TerEcon"), // Tertiary Economics
    TG("tg", "TerGeog"), // Tertiary Geography
    TH("th", "TerHist"), // Tertiary History
    TL("tl", "TerLit"), // Tertiary Literature
    TM("tm", "TerMath"), // Tertiary Math
    TP("tp", "TerPhy"); // Tertiary Physics

    public final String subCode;
    public final String label;

    LevelSubjectCode(String subCode, String label) {
        this.subCode = subCode;
        this.label = label;
    }

    /**
     * Checks if user input matches any enum values.
     *
     * @param subCode Tag from user input.
     * @return True if tag that user has given is valid, false otherwise.
     */
    public static boolean isValidTag(String subCode) {
        for (LevelSubjectCode x : values()) {
            if (x.subCode.equalsIgnoreCase(subCode)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns label that corresponds to the Tag user has given.
     *
     * @param subCode Tag from user input.
     * @return Label corresponding to the Tag.
     */
    public static String getLabel(String subCode) throws ParseException {
        for (LevelSubjectCode x : values()) {
            if (x.subCode.equalsIgnoreCase(subCode)) {
                return x.label;
            }
        }
        throw new ParseException(Tag.INVALID_TAG);
    }
}
