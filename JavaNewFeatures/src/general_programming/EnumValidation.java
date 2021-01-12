package general_programming;

public class EnumValidation {

    enum Size{
        // enum constants
        SMALL, MEDIUM, LARGE, EXTRALARGE;

        public String getSize() {
            switch (this) {
                case SMALL -> {
                    return "small";
                }
                case MEDIUM -> {
                    return "medium";
                }

                case LARGE -> {
                    return "large";
                }
                case EXTRALARGE -> {
                    return "extralarge";
                }
                default -> {
                    return null;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Size.SMALL.getSize());
        System.out.println(Size.MEDIUM.getSize());
    }
}
